package com.arcticumi.convert;

import android.util.Log;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.StringReader;
import java.util.ArrayList;

public class ParseCurrency {
    private static final String TAG = "ParseCurrency";
    ArrayList<FeedItem> conversions;

    public ParseCurrency() {
        this.conversions = new ArrayList<>();
    }

    public ArrayList<FeedItem> getConversions() {
        return conversions;
    }

    public boolean parse(String xmlData){
        boolean status = true;
        FeedItem currentRecord = null;
        boolean inItem = false;
        String textValue = "";

        try {
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            factory.setNamespaceAware(true);
            XmlPullParser xpp = factory.newPullParser();
            xpp.setInput(new StringReader(xmlData));
            int eventType = xpp.getEventType();
            while(eventType != XmlPullParser.END_DOCUMENT){
                String tagName = xpp.getName();
                switch(eventType){
                    case XmlPullParser.START_TAG:
                        Log.d(TAG, "parse: Starting tag for " + tagName);
                        if("item".equalsIgnoreCase(tagName)){
                            inItem = true;
                            currentRecord = new FeedItem();
                        }
                        break;
                    case XmlPullParser.TEXT:
                        textValue = xpp.getText();
                        break;
                    case XmlPullParser.END_TAG:
                        Log.d(TAG, "parse: Ending tag for " + tagName);
                        if(inItem){
                            if("item".equalsIgnoreCase(tagName)){
                                conversions.add(currentRecord);
                                inItem = false;
                            } else if ("baseCurrency".equalsIgnoreCase(tagName)) {
                                currentRecord.setBaseCurrency(textValue);
                            } else if ("targetCurrency".equalsIgnoreCase(tagName)) {
                                currentRecord.setTargetCurrency(textValue);
                            } else if ("exchangeRate".equalsIgnoreCase(tagName)) {
                                textValue = textValue.replace(",","");
                                currentRecord.setExchangeRate(Double.parseDouble(textValue));
                            }
                        }
                        break;
                    default:
                        //nothing else to do
                }
                eventType = xpp.next();

            }
        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }

        return status;

    }
}
