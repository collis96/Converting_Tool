package com.arcticumi.convert;

import android.util.Xml;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class CurrencyXmlParser {

    private static final String ns = null;

    public List parse(InputStream in) throws XmlPullParserException, IOException {
        try {
            XmlPullParser parser = Xml.newPullParser();
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
            parser.setInput(in, null);
            parser.nextTag();
            return readFeed(parser);
        } finally {
            in.close();
        }
    }

    private List readFeed(XmlPullParser parser) throws XmlPullParserException, IOException {
        List entries = new ArrayList();

        parser.require(XmlPullParser.START_TAG, ns, "channel");
        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.getEventType() != XmlPullParser.START_TAG) {
                continue;
            }
            String name = parser.getName();
            if (name.equals("item")) {
                entries.add(readItem(parser));
            } else {
                skip(parser);
            }
        }
        return entries;
    }

    public static class Item {
        public final String bCurrency;
        public final String tCurrency;
        public final String exRate;

        private Item(String bCurrency, String tCurrency, String exRate) {
            this.bCurrency = bCurrency;
            this.tCurrency = tCurrency;
            this.exRate = exRate;
        }

    }

    //Process contents of Item tag
    private Item readItem(XmlPullParser parser) throws XmlPullParserException, IOException {
        parser.require(XmlPullParser.START_TAG, ns, "item");
        String bCurrency = null;
        String tCurrency = null;
        String exRate = null;
        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.getEventType() != XmlPullParser.START_TAG) {
                continue;
            }
            String name = parser.getName();
            if (name.equals("baseCurrency")) {
                bCurrency = readBaseCurrency(parser);
            } else if (name.equals("targetCurrency")) {
                tCurrency = readTargetCurrency(parser);
            } else if (name.equals("exchangeRate")) {
                exRate = readExchangeRate(parser);
            } else {
                skip(parser);
            }
        }
        return new Item(bCurrency, tCurrency, exRate);
    }

    //process baseCurrency tags in the feed
    private String readBaseCurrency(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, ns, "baseCurrency");
        String bCurrency = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "baseCurrency");
        return bCurrency;
    }

    //process targetCurrency tags in the feed
    private String readTargetCurrency(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, ns, "targetCurrency");
        String tCurrency = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "targetCurrency");
        return tCurrency;
    }

    //process exchangeRate tags in the feed
    private String readExchangeRate(XmlPullParser parser) throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, ns, "exchangeRate");
        String exRate = readText(parser);
        parser.require(XmlPullParser.END_TAG, ns, "exchangeRate");
        return exRate;
    }

    //extract values from tags
    private String readText(XmlPullParser parser) throws IOException, XmlPullParserException {
        String result = "";
        if (parser.next() == XmlPullParser.TEXT) {
            result = parser.getText();
            parser.nextTag();
        }
        return result;
    }

    //skip tags we dont care about
    private void skip(XmlPullParser parser) throws XmlPullParserException, IOException {
        if (parser.getEventType() != XmlPullParser.START_TAG) {
            throw new IllegalStateException();
        }
        int depth = 1;
        while (depth != 0) {
            switch (parser.next()) {
                case XmlPullParser.END_TAG:
                    depth--;
                    break;
                case XmlPullParser.START_TAG:
                    depth++;
                    break;
            }
        }
    }
}

