package com.arcticumi.convert;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

import org.xmlpull.v1.XmlPullParserException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class ActivityCurrency extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private static final String TAG = "ActivityCurrency";

    private static final String URL = "http://www.floatrates.com/daily/gbp.xml";
    private TextView tvbCurrency;
    private TextView tvtCurrency;
    private TextView tvexRate;
    private String strbCurrency;
    private String strtCurrency;
    private String strexRate;
    private Button btnGo;

    private DrawerLayout drawer;

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                startActivity(new Intent(this, ActivityMain.class));
                break;
            case R.id.distance:
                startActivity(new Intent(this, ActivityDistance.class));
                break;
            case R.id.area:
                startActivity(new Intent(this, ActivityArea.class));
                break;
            case R.id.volume:
                startActivity(new Intent(this, ActivityVolume.class));
                break;
            case R.id.time:
                startActivity(new Intent(this, ActivityTime.class));
                break;
            case R.id.currency:
                break;
            case R.id.temp:
                startActivity(new Intent(this, ActivityTemp.class));
                break;
            case R.id.weight:
                startActivity(new Intent(this, ActivityWeight.class));
                break;
            case R.id.storage:
                startActivity(new Intent(this, ActivityStorage.class));
                break;
            case R.id.magnetism:
                startActivity(new Intent(this, ActivityMagnetism.class));
                break;
            case R.id.radiation:
                startActivity(new Intent(this, ActivityRadiation.class));
                break;
            case R.id.fluid:
                startActivity(new Intent(this, ActivityFluid.class));
                break;
            case R.id.other:
                startActivity(new Intent(this, ActivityOther.class));
                break;
        }
        return true;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        Toolbar tb = findViewById(R.id.toolbar);
        setSupportActionBar(tb);
        getSupportActionBar().setTitle(null);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, tb,
                R.string.navigation_drawer_open, R.string.navigation_drawer_closed);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        tvbCurrency = findViewById(R.id.tvBCurrency);
        tvtCurrency = findViewById(R.id.tvTCurrency);
        tvexRate = findViewById(R.id.tvExRate);

        btnGo = findViewById(R.id.btnGo);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Starting AsyncTask");
                DownloadData downloadData = new DownloadData();
                downloadData.execute(URL);
                Log.d(TAG, "onClick: Done.");
            }
        });
    }

    private class DownloadData extends AsyncTask<String, Void, String> {
        private static final String TAG = "DownloadData";

        @Override
        protected String doInBackground(String... urls) {
            Log.d(TAG, "doInBackground: starts with " + urls[0]);
            String rssFeed = downloadXML(urls[0]);
            if (rssFeed == null) {
                Log.e(TAG, "doInBackground: Error downloading");
            }
            return rssFeed;
        }

        @Override
        protected void onPostExecute(String result) {
            Log.d(TAG, "onPostExecute: paramter is " + result);
        }

        private String downloadXML(String urlPath) {
            StringBuilder xmlResult = new StringBuilder();

            try {

                URL url = new URL(urlPath);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                int response = connection.getResponseCode();
                Log.d(TAG, "downloadXML: The response code was " + response);
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

                int charsRead;
                char[] inputBuffer = new char[500];
                while (true) {
                    charsRead = reader.read(inputBuffer);
                    if (charsRead < 0) {
                        break;
                    }
                    if (charsRead > 0) {
                        xmlResult.append(String.copyValueOf(inputBuffer, 0, charsRead));
                    }
                }
                reader.close();
                return xmlResult.toString();
            } catch (MalformedURLException e) {
                Log.e(TAG, "downloadXML: Invalid URL" + e.getMessage());
            } catch (IOException e) {
                Log.e(TAG, "downloadXML: IO Exception reading data " + e.getMessage());
            } catch (SecurityException e) {
                Log.e(TAG, "downloadXML: Security Exception, needs permission?" + e.getMessage());
            }

            return null;
        }
    }

//    private String loadXmlFromNetwork(String urlString) throws XmlPullParserException, IOException {
//        InputStream stream = null;
//        // Instantiate the parser
//        CurrencyXmlParser currencyXmlParser = new CurrencyXmlParser();
//        List<CurrencyXmlParser.Item> items = null;
//        String bCurrency = null;
//        String tCurrency = null;
//        String exRate = null;
//
//        try {
//            stream = downloadUrl(urlString);
//            items = currencyXmlParser.parse(stream);
//            // Makes sure that the InputStream is closed after the app is
//            // finished using it.
//        } finally {
//            if (stream != null) {
//                stream.close();
//            }
//        }
//
//        for(CurrencyXmlParser.Item item : items){
//            if(item.bCurrency=="GBP" && item.tCurrency=="EUR"){
//                strbCurrency = item.bCurrency;
//                strtCurrency = item.tCurrency;
//                strexRate = item.exRate;
//            }
//        }
//        return bCurrency;
//    }

}
