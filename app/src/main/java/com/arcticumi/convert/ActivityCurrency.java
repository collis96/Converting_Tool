package com.arcticumi.convert;


import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class ActivityCurrency extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private static final String TAG = "ActivityCurrency";

    private String URL = "http://www.floatrates.com/daily/usd.xml";

    private String baseCurrency;
    private String baseCode;
    private String targetCurrency;
    private String targetCode;
    private TextView tvInputSummary;
    private TextView tvexRate;
    private double input;

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
        final EditText etInput = findViewById(R.id.etCurrencyInput);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, tb,
                R.string.navigation_drawer_open, R.string.navigation_drawer_closed);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        Spinner spCurrencyFrom = findViewById(R.id.spCurrencyFrom);
        Spinner spCurrencyTo = findViewById(R.id.spCurrencyTo);

        ArrayAdapter<CharSequence> currencyAdapter = ArrayAdapter.createFromResource(this, R.array.conversions, R.layout.spinner_item);
        currencyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spCurrencyFrom.setAdapter(currencyAdapter);
        spCurrencyTo.setAdapter(currencyAdapter);

        spCurrencyFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                baseCurrency = parent.getItemAtPosition(position).toString();
                switch(baseCurrency){
                    case "US Dollar":
                        baseCode = "USD";
                        URL = "http://www.floatrates.com/daily/usd.xml";
                        break;
                    case "Euro":
                        baseCode = "EUR";
                        URL = "http://www.floatrates.com/daily/eur.xml";
                        break;
                    case "UK Pound Sterling":
                        baseCode = "GBP";
                        URL = "http://www.floatrates.com/daily/gbp.xml";
                        break;
                    case "Australian Dollar":
                        baseCode = "AUD";
                        URL = "http://www.floatrates.com/daily/aud.xml";
                        break;
                    case "Canadian Dollar":
                        baseCode = "CAD";
                        URL = "http://www.floatrates.com/daily/cad.xml";
                        break;
                    case "Japanese Yen":
                        baseCode = "JPY";
                        URL = "http://www.floatrates.com/daily/jpy.xml";
                        break;
                    case "Swiss Franc":
                        baseCode = "CHF";
                        URL = "http://www.floatrates.com/daily/chf.xml";
                        break;
                    case "Comoro Franc":
                        baseCode = "KMF";
                        URL = "http://www.floatrates.com/daily/kmf.xml";
                        break;
                    case "Afghan Afghani":
                        baseCode = "AFN";
                        URL = "http://www.floatrates.com/daily/afn.xml";
                        break;
                    case "Albanian Lek":
                        baseCode = "ALL";
                        URL = "http://www.floatrates.com/daily/all.xml";
                        break;
                    case "Algerian Dinar":
                        baseCode = "DZD";
                        URL = "http://www.floatrates.com/daily/dzd.xml";
                        break;
                    case "Angolan Kwanza":
                        baseCode = "AOA";
                        URL = "http://www.floatrates.com/daily/aoa.xml";
                        break;
                    case "Argentine Peso":
                        baseCode = "ARS";
                        URL = "http://www.floatrates.com/daily/ars.xml";
                        break;
                    case "Armenia Dram":
                        baseCode = "AMD";
                        URL = "http://www.floatrates.com/daily/amd.xml";
                        break;
                    case "Aruban Florin":
                        baseCode = "AWG";
                        URL = "http://www.floatrates.com/daily/awg.xml";
                        break;
                    case "Azerbaijan Manat":
                        baseCode = "AZN";
                        URL = "http://www.floatrates.com/daily/azn.xml";
                        break;
                    case "Bahamian Dollar":
                        baseCode = "BSD";
                        URL = "http://www.floatrates.com/daily/bsd.xml";
                        break;
                    case "Bahrain Dinar":
                        baseCode = "BHD";
                        URL = "http://www.floatrates.com/daily/bhd.xml";
                        break;
                    case "Bangladeshi Taka":
                        baseCode = "BDT";
                        URL = "http://www.floatrates.com/daily/bdt.xml";
                        break;
                    case "Barbadian Dollar":
                        baseCode = "BBD";
                        URL = "http://www.floatrates.com/daily/bbd.xml";
                        break;
                    case "Belarussian Ruble":
                        baseCode = "BYN";
                        URL = "http://www.floatrates.com/daily/byn.xml";
                        break;
                    case "Belize Dollar":
                        baseCode = "BZD";
                        URL = "http://www.floatrates.com/daily/bzd.xml";
                        break;
                    case "Bolivian Boliviano":
                        baseCode = "BOB";
                        URL = "http://www.floatrates.com/daily/bob.xml";
                        break;
                    case "Bosnia-Herzegovina Convertible Mark":
                        baseCode = "BAM";
                        URL = "http://www.floatrates.com/daily/bam.xml";
                        break;
                    case "Botswana Pula":
                        baseCode = "BWP";
                        URL = "http://www.floatrates.com/daily/bwp.xml";
                        break;
                    case "Brazilian Real":
                        baseCode = "BRL";
                        URL = "http://www.floatrates.com/daily/brl.xml";
                        break;
                    case "Brunei Dollar":
                        baseCode = "BND";
                        URL = "http://www.floatrates.com/daily/bnd.xml";
                        break;
                    case "Bulgarian Lev":
                        baseCode = "BGN";
                        URL = "http://www.floatrates.com/daily/bgn.xml";
                        break;
                    case "Burundian Franc":
                        baseCode = "BIF";
                        URL = "http://www.floatrates.com/daily/bif.xml";
                        break;
                    case "Cambodian Riel":
                        baseCode = "KHR";
                        URL = "http://www.floatrates.com/daily/khr.xml";
                        break;
                    case "Cape Verde Escudo":
                        baseCode = "CVE";
                        URL = "http://www.floatrates.com/daily/cve.xml";
                        break;
                    case "Central African CFA Franc":
                        baseCode = "XAF";
                        URL = "http://www.floatrates.com/daily/xaf.xml";
                        break;
                    case "CFP Franc":
                        baseCode = "XPF";
                        URL = "http://www.floatrates.com/daily/xpf.xml";
                        break;
                    case "Chilean Peso":
                        baseCode = "CLP";
                        URL = "http://www.floatrates.com/daily/clp.xml";
                        break;
                    case "Chinese Yuan":
                        baseCode = "CNY";
                        URL = "http://www.floatrates.com/daily/cny.xml";
                        break;
                    case "Colombian Peso":
                        baseCode = "COP";
                        URL = "http://www.floatrates.com/daily/cop.xml";
                        break;
                    case "Congolese Franc":
                        baseCode = "CDF";
                        URL = "http://www.floatrates.com/daily/cdf.xml";
                        break;
                    case "Costa Rican Colón":
                        baseCode = "CRC";
                        URL = "http://www.floatrates.com/daily/crc.xml";
                        break;
                    case "Croatian Kuna":
                        baseCode = "HRK";
                        URL = "http://www.floatrates.com/daily/hrk.xml";
                        break;
                    case "Cuban Peso":
                        baseCode = "CUP";
                        URL = "http://www.floatrates.com/daily/cup.xml";
                        break;
                    case "Czech Koruna":
                        baseCode = "CZK";
                        URL = "http://www.floatrates.com/daily/czk.xml";
                        break;
                    case "Danish Krone":
                        baseCode = "DKK";
                        URL = "http://www.floatrates.com/daily/dkk.xml";
                        break;
                    case "Djiboutian Franc":
                        baseCode = "DJF";
                        URL = "http://www.floatrates.com/daily/djf.xml";
                        break;
                    case "Dominican Peso":
                        baseCode = "DOP";
                        URL = "http://www.floatrates.com/daily/dop.xml";
                        break;
                    case "East Caribbean Dollar":
                        baseCode = "XCD";
                        URL = "http://www.floatrates.com/daily/xcd.xml";
                        break;
                    case "Egyptian Pound":
                        baseCode = "EGP";
                        URL = "http://www.floatrates.com/daily/egp.xml";
                        break;
                    case "Eritrean Nakfa":
                        baseCode = "ERN";
                        URL = "http://www.floatrates.com/daily/ern.xml";
                        break;
                    case "Ethiopian Birr":
                        baseCode = "ETB";
                        URL = "http://www.floatrates.com/daily/etb.xml";
                        break;
                    case "Fiji Dollar":
                        baseCode = "FJD";
                        URL = "http://www.floatrates.com/daily/fjd.xml";
                        break;
                    case "Gambian Dalasi":
                        baseCode = "GMD";
                        URL = "http://www.floatrates.com/daily/gmd.xml";
                        break;
                    case "Georgian Lari":
                        baseCode = "GEL";
                        URL = "http://www.floatrates.com/daily/gel.xml";
                        break;
                    case "Ghanaian Cedi":
                        baseCode = "GHS";
                        URL = "http://www.floatrates.com/daily/ghs.xml";
                        break;
                    case "Gibraltar Pound":
                        baseCode = "GIP";
                        URL = "http://www.floatrates.com/daily/gip.xml";
                        break;
                    case "Guatemalan Quetzal":
                        baseCode = "GTQ";
                        URL = "http://www.floatrates.com/daily/gtq.xml";
                        break;
                    case "Guinean Franc":
                        baseCode = "GNF";
                        URL = "http://www.floatrates.com/daily/gnf.xml";
                        break;
                    case "Guyanese Dollar":
                        baseCode = "GYD";
                        URL = "http://www.floatrates.com/daily/gyd.xml";
                        break;
                    case "Haitian Gourde":
                        baseCode = "HTG";
                        URL = "http://www.floatrates.com/daily/htg.xml";
                        break;
                    case "Honduran Lempira":
                        baseCode = "HNL";
                        URL = "http://www.floatrates.com/daily/hnl.xml";
                        break;
                    case "Hong Kong Dollar":
                        baseCode = "HKD";
                        URL = "http://www.floatrates.com/daily/hkd.xml";
                        break;
                    case "Hungarian Forint":
                        baseCode = "HUF";
                        URL = "http://www.floatrates.com/daily/huf.xml";
                        break;
                    case "Icelandic Krona":
                        baseCode = "ISK";
                        URL = "http://www.floatrates.com/daily/isk.xml";
                        break;
                    case "Indian Rupee":
                        baseCode = "INR";
                        URL = "http://www.floatrates.com/daily/inr.xml";
                        break;
                    case "Indonesian Rupiah":
                        baseCode = "IDR";
                        URL = "http://www.floatrates.com/daily/idr.xml";
                        break;
                    case "Iranian Rial":
                        baseCode = "IRR";
                        URL = "http://www.floatrates.com/daily/irr.xml";
                        break;
                    case "Iraqi Dinar":
                        baseCode = "IQD";
                        URL = "http://www.floatrates.com/daily/iqd.xml";
                        break;
                    case "Israeli New Sheqel":
                        baseCode = "ILS";
                        URL = "http://www.floatrates.com/daily/ils.xml";
                        break;
                    case "Jamaican Dollar":
                        baseCode = "JMD";
                        URL = "http://www.floatrates.com/daily/jmd.xml";
                        break;
                    case "Jordanian Dinar":
                        baseCode = "JOD";
                        URL = "http://www.floatrates.com/daily/jod.xml";
                        break;
                    case "Kazakhstani Tenge":
                        baseCode = "KZT";
                        URL = "http://www.floatrates.com/daily/kzt.xml";
                        break;
                    case "Kenyan Shilling":
                        baseCode = "KES";
                        URL = "http://www.floatrates.com/daily/kes.xml";
                        break;
                    case "Kuwaiti Dinar":
                        baseCode = "KWD";
                        URL = "http://www.floatrates.com/daily/kwd.xml";
                        break;
                    case "Kyrgyzstan Som":
                        baseCode = "KGS";
                        URL = "http://www.floatrates.com/daily/kgs.xml";
                        break;
                    case "Lao Kip":
                        baseCode = "LAK";
                        URL = "http://www.floatrates.com/daily/lak.xml";
                        break;
                    case "Latvian Lats":
                        baseCode = "LVL";
                        URL = "http://www.floatrates.com/daily/lvl.xml";
                        break;
                    case "Lebanese Pound":
                        baseCode = "LBP";
                        URL = "http://www.floatrates.com/daily/lbp.xml";
                        break;
                    case "Lesotho Loti":
                        baseCode = "LSL";
                        URL = "http://www.floatrates.com/daily/lsl.xml";
                        break;
                    case "Liberian Dollar":
                        baseCode = "LRD";
                        URL = "http://www.floatrates.com/daily/lrd.xml";
                        break;
                    case "Libyan Dinar":
                        baseCode = "LYD";
                        URL = "http://www.floatrates.com/daily/lyd.xml";
                        break;
                    case "Lithuanian Litas":
                        baseCode = "LTL";
                        URL = "http://www.floatrates.com/daily/ltl.xml";
                        break;
                    case "Macanese Pataca":
                        baseCode = "MOP";
                        URL = "http://www.floatrates.com/daily/mop.xml";
                        break;
                    case "Macedonian Denar":
                        baseCode = "MKD";
                        URL = "http://www.floatrates.com/daily/mkd.xml";
                        break;
                    case "Malagasy Ariary":
                        baseCode = "MGA";
                        URL = "http://www.floatrates.com/daily/mga.xml";
                        break;
                    case "Malawian Kwacha":
                        baseCode = "MWK";
                        URL = "http://www.floatrates.com/daily/mwk.xml";
                        break;
                    case "Malaysian Ringgit":
                        baseCode = "MYR";
                        URL = "http://www.floatrates.com/daily/myr.xml";
                        break;
                    case "Maldivian Rufiyaa":
                        baseCode = "MVR";
                        URL = "http://www.floatrates.com/daily/mvr.xml";
                        break;
                    case "Mauritanian Ouguiya":
                        baseCode = "MRU";
                        URL = "http://www.floatrates.com/daily/mru.xml";
                        break;
                    case "Mauritian Rupee":
                        baseCode = "MUR";
                        URL = "http://www.floatrates.com/daily/mur.xml";
                        break;
                    case "Mexican Peso":
                        baseCode = "MXN";
                        URL = "http://www.floatrates.com/daily/mxn.xml";
                        break;
                    case "Moldova Lei":
                        baseCode = "MDL";
                        URL = "http://www.floatrates.com/daily/mdl.xml";
                        break;
                    case "Mongolian Togrog":
                        baseCode = "MNT";
                        URL = "http://www.floatrates.com/daily/mnt.xml";
                        break;
                    case "Moroccan Dirham":
                        baseCode = "MAD";
                        URL = "http://www.floatrates.com/daily/mad.xml";
                        break;
                    case "Mozambican Metical":
                        baseCode = "MZN";
                        URL = "http://www.floatrates.com/daily/mzn.xml";
                        break;
                    case "Myanma Kyat":
                        baseCode = "MMK";
                        URL = "http://www.floatrates.com/daily/mmk.xml";
                        break;
                    case "Namibian Dollar":
                        baseCode = "NAD";
                        URL = "http://www.floatrates.com/daily/nad.xml";
                        break;
                    case "Nepalese Rupee":
                        baseCode = "NPR";
                        URL = "http://www.floatrates.com/daily/npr.xml";
                        break;
                    case "Neth. Antillean Guilder":
                        baseCode = "ANG";
                        URL = "http://www.floatrates.com/daily/ang.xml";
                        break;
                    case "New Taiwan Dollar":
                        baseCode = "TWD";
                        URL = "http://www.floatrates.com/daily/twd.xml";
                        break;
                    case "New Turkmenistan Manat":
                        baseCode = "TMT";
                        URL = "http://www.floatrates.com/daily/tmt.xml";
                        break;
                    case "New Zealand Dollar":
                        baseCode = "NZD";
                        URL = "http://www.floatrates.com/daily/nzd.xml";
                        break;
                    case "Nicaraguan Córdoba":
                        baseCode = "NIO";
                        URL = "http://www.floatrates.com/daily/nio.xml";
                        break;
                    case "Nigerian Naira":
                        baseCode = "NGN";
                        URL = "http://www.floatrates.com/daily/ngn.xml";
                        break;
                    case "Norwegian Krone":
                        baseCode = "NOK";
                        URL = "http://www.floatrates.com/daily/nok.xml";
                        break;
                    case "Omani Rial":
                        baseCode = "OMR";
                        URL = "http://www.floatrates.com/daily/omr.xml";
                        break;
                    case "Pakistani Rupee":
                        baseCode = "PKR";
                        URL = "http://www.floatrates.com/daily/pkr.xml";
                        break;
                    case "Panamanian Balboa":
                        baseCode = "PAB";
                        URL = "http://www.floatrates.com/daily/pab.xml";
                        break;
                    case "Papua New Guinean Kina":
                        baseCode = "PGK";
                        URL = "http://www.floatrates.com/daily/pgk.xml";
                        break;
                    case "Paraguayan Guarani":
                        baseCode = "PYG";
                        URL = "http://www.floatrates.com/daily/pyg.xml";
                        break;
                    case "Peruvian Nuevo Sol":
                        baseCode = "PEN";
                        URL = "http://www.floatrates.com/daily/pen.xml";
                        break;
                    case "Philippine Peso":
                        baseCode = "PHP";
                        URL = "http://www.floatrates.com/daily/php.xml";
                        break;
                    case "Polish Zloty":
                        baseCode = "PLN";
                        URL = "http://www.floatrates.com/daily/pln.xml";
                        break;
                    case "Qatari Rial":
                        baseCode = "QAR";
                        URL = "http://www.floatrates.com/daily/qar.xml";
                        break;
                    case "Romanian New Leu":
                        baseCode = "RON";
                        URL = "http://www.floatrates.com/daily/ron.xml";
                        break;
                    case "Russian Rouble":
                        baseCode = "RUB";
                        URL = "http://www.floatrates.com/daily/rub.xml";
                        break;
                    case "Rwandan Franc":
                        baseCode = "RWF";
                        URL = "http://www.floatrates.com/daily/rwf.xml";
                        break;
                    case "Salvadoran Colon":
                        baseCode = "SVC";
                        URL = "http://www.floatrates.com/daily/svc.xml";
                        break;
                    case "Samoan Tala":
                        baseCode = "WST";
                        URL = "http://www.floatrates.com/daily/wst.xml";
                        break;
                    case "Sao Tome and Principe Dobra":
                        baseCode = "STN";
                        URL = "http://www.floatrates.com/daily/stn.xml";
                        break;
                    case "Saudi Riyal":
                        baseCode = "SAR";
                        URL = "http://www.floatrates.com/daily/sar.xml";
                        break;
                    case "Serbian Dinar":
                        baseCode = "RSD";
                        URL = "http://www.floatrates.com/daily/rsd.xml";
                        break;
                    case "Seychelles Rupee":
                        baseCode = "SCR";
                        URL = "http://www.floatrates.com/daily/scr.xml";
                        break;
                    case "Sierra Leonean Leonean":
                        baseCode = "SLL";
                        URL = "http://www.floatrates.com/daily/sll.xml";
                        break;
                    case "Singapore Dollar":
                        baseCode = "SGD";
                        URL = "http://www.floatrates.com/daily/sgd.xml";
                        break;
                    case "Soloman Islands Dollar":
                        baseCode = "SBD";
                        URL = "http://www.floatrates.com/daily/sbd.xml";
                        break;
                    case "Somali Shilling":
                        baseCode = "SOS";
                        URL = "http://www.floatrates.com/daily/sos.xml";
                        break;
                    case "South African Rand":
                        baseCode = "ZAR";
                        URL = "http://www.floatrates.com/daily/zar.xml";
                        break;
                    case "South Korean Won":
                        baseCode = "KRW";
                        URL = "http://www.floatrates.com/daily/krw.xml";
                        break;
                    case "South Sudanese Pound":
                        baseCode = "SSP";
                        URL = "http://www.floatrates.com/daily/ssp.xml";
                        break;
                    case "Sri Lanka Rupee":
                        baseCode = "LKR";
                        URL = "http://www.floatrates.com/daily/lkr.xml";
                        break;
                    case "Sudanese Pound":
                        baseCode = "SDG";
                        URL = "http://www.floatrates.com/daily/sdg.xml";
                        break;
                    case "Surinamese Dollar":
                        baseCode = "SRD";
                        URL = "http://www.floatrates.com/daily/srd.xml";
                        break;
                    case "Swazi Lilangeni":
                        baseCode = "SZL";
                        URL = "http://www.floatrates.com/daily/szl.xml";
                        break;
                    case "Swedish Krona":
                        baseCode = "SEK";
                        URL = "http://www.floatrates.com/daily/sek.xml";
                        break;
                    case "Syrian Pound":
                        baseCode = "SYP";
                        URL = "http://www.floatrates.com/daily/syp.xml";
                        break;
                    case "Tajikistan Ruble":
                        baseCode = "TJS";
                        URL = "http://www.floatrates.com/daily/tjs.xml";
                        break;
                    case "Tanzanian Shilling":
                        baseCode = "TZS";
                        URL = "http://www.floatrates.com/daily/tzs.xml";
                        break;
                    case "Thai Baht":
                        baseCode = "THB";
                        URL = "http://www.floatrates.com/daily/thb.xml";
                        break;
                    case "Tongan Pa'anga":
                        baseCode = "TOP";
                        URL = "http://www.floatrates.com/daily/top.xml";
                        break;
                    case "Trinidad Tobago Dollar":
                        baseCode = "TTD";
                        URL = "http://www.floatrates.com/daily/ttd.xml";
                        break;
                    case "Tunisian Dinar":
                        baseCode = "TND";
                        URL = "http://www.floatrates.com/daily/tnd.xml";
                        break;
                    case "Turkish Lira":
                        baseCode = "TRY";
                        URL = "http://www.floatrates.com/daily/try.xml";
                        break;
                    case "UAE Dirham":
                        baseCode = "AED";
                        URL = "http://www.floatrates.com/daily/aed.xml";
                        break;
                    case "Ugandan Shilling":
                        baseCode = "UGX";
                        URL = "http://www.floatrates.com/daily/ugx.xml";
                        break;
                    case "Ukrainian Hryvnia":
                        baseCode = "UAH";
                        URL = "http://www.floatrates.com/daily/uah.xml";
                        break;
                    case "Uruguayan Peso":
                        baseCode = "UYU";
                        URL = "http://www.floatrates.com/daily/uyu.xml";
                        break;
                    case "Uzbekistan Sum":
                        baseCode = "UZS";
                        URL = "http://www.floatrates.com/daily/uzs.xml";
                        break;
                    case "Vanuatu Vatu":
                        baseCode = "VUV";
                        URL = "http://www.floatrates.com/daily/vuv.xml";
                        break;
                    case "Venezuelan Bolivar":
                        baseCode = "VES";
                        URL = "http://www.floatrates.com/daily/ves.xml";
                        break;
                    case "Vietnamese Dong":
                        baseCode = "VND";
                        URL = "http://www.floatrates.com/daily/vnd.xml";
                        break;
                    case "West African CFA Franc":
                        baseCode = "XOF";
                        URL = "http://www.floatrates.com/daily/xof.xml";
                        break;
                    case "Yemeni Rial":
                        baseCode = "YER";
                        URL = "http://www.floatrates.com/daily/yer.xml";
                        break;
                    case "Zambian Kwacha":
                        baseCode = "ZMW";
                        URL = "http://www.floatrates.com/daily/zmw.xml";
                        break;
                }
                Log.d(TAG, "onItemSelected: from code " + baseCode);
                Log.d(TAG, "onItemSelected: URL " + URL);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spCurrencyTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                targetCurrency = parent.getItemAtPosition(position).toString();
                switch(targetCurrency){
                    case "US Dollar":
                        targetCode = "USD";
                        break;
                    case "Euro":
                        targetCode = "EUR";
                        break;
                    case "UK Pound Sterling":
                        targetCode = "GBP";
                        break;
                    case "Australian Dollar":
                        targetCode = "AUD";
                        break;
                    case "Canadian Dollar":
                        targetCode = "CAD";
                        break;
                    case "Japanese Yen":
                        targetCode = "JPY";
                        break;
                    case "Swiss Franc":
                        targetCode = "CHF";
                        break;
                    case "Comoro Franc":
                        targetCode = "KMF";
                        break;
                    case "Afghan Afghani":
                        targetCode = "AFN";
                        break;
                    case "Albanian Lek":
                        targetCode = "ALL";
                        break;
                    case "Algerian Dinar":
                        targetCode = "DZD";
                        break;
                    case "Angolan Kwanza":
                        targetCode = "AOA";
                        break;
                    case "Argentine Peso":
                        targetCode = "ARS";
                        break;
                    case "Armenia Dram":
                        targetCode = "AMD";
                        break;
                    case "Aruban Florin":
                        targetCode = "AWG";
                        break;
                    case "Azerbaijan Manat":
                        targetCode = "AZN";
                        break;
                    case "Bahamian Dollar":
                        targetCode = "BSD";
                        break;
                    case "Bahrain Dinar":
                        targetCode = "BHD";
                        break;
                    case "Bangladeshi Taka":
                        targetCode = "BDT";
                        break;
                    case "Barbadian Dollar":
                        targetCode = "BBD";
                        break;
                    case "Belarussian Ruble":
                        targetCode = "BYN";
                        break;
                    case "Belize Dollar":
                        targetCode = "BZD";
                        break;
                    case "Bolivian Boliviano":
                        targetCode = "BOB";
                        break;
                    case "Bosnia-Herzegovina Convertible Mark":
                        targetCode = "BAM";
                        break;
                    case "Botswana Pula":
                        targetCode = "BWP";
                        break;
                    case "Brazilian Real":
                        targetCode = "BRL";
                        break;
                    case "Brunei Dollar":
                        targetCode = "BND";
                        break;
                    case "Bulgarian Lev":
                        targetCode = "BGN";
                        break;
                    case "Burundian Franc":
                        targetCode = "BIF";
                        break;
                    case "Cambodian Riel":
                        targetCode = "KHR";
                        break;
                    case "Cape Verde Escudo":
                        targetCode = "CVE";
                        break;
                    case "Central African CFA Franc":
                        targetCode = "XAF";
                        break;
                    case "CFP Franc":
                        targetCode = "XPF";
                        break;
                    case "Chilean Peso":
                        targetCode = "CLP";
                        break;
                    case "Chinese Yuan":
                        targetCode = "CNY";
                        break;
                    case "Colombian Peso":
                        targetCode = "COP";
                        break;
                    case "Congolese Franc":
                        targetCode = "CDF";
                        break;
                    case "Costa Rican Colón":
                        targetCode = "CRC";
                        break;
                    case "Croatian Kuna":
                        targetCode = "HRK";
                        break;
                    case "Cuban Peso":
                        targetCode = "CUP";
                        break;
                    case "Czech Koruna":
                        targetCode = "CZK";
                        break;
                    case "Danish Krone":
                        targetCode = "DKK";
                        break;
                    case "Djiboutian Franc":
                        targetCode = "DJF";
                        break;
                    case "Dominican Peso":
                        targetCode = "DOP";
                        break;
                    case "East Caribbean Dollar":
                        targetCode = "XCD";
                        break;
                    case "Egyptian Pound":
                        targetCode = "EGP";
                        break;
                    case "Eritrean Nakfa":
                        targetCode = "ERN";
                        break;
                    case "Ethiopian Birr":
                        targetCode = "ETB";
                        break;
                    case "Fiji Dollar":
                        targetCode = "FJD";
                        break;
                    case "Gambian Dalasi":
                        targetCode = "GMD";
                        break;
                    case "Georgian Lari":
                        targetCode = "GEL";
                        break;
                    case "Ghanaian Cedi":
                        targetCode = "GHS";
                        break;
                    case "Gibraltar Pound":
                        targetCode = "GIP";
                        break;
                    case "Guatemalan Quetzal":
                        targetCode = "GTQ";
                        break;
                    case "Guinean Franc":
                        targetCode = "GNF";
                        break;
                    case "Guyanese Dollar":
                        targetCode = "GYD";
                        break;
                    case "Haitian Gourde":
                        targetCode = "HTG";
                        break;
                    case "Honduran Lempira":
                        targetCode = "HNL";
                        break;
                    case "Hong Kong Dollar":
                        targetCode = "HKD";
                        break;
                    case "Hungarian Forint":
                        targetCode = "HUF";
                        break;
                    case "Icelandic Krona":
                        targetCode = "ISK";
                        break;
                    case "Indian Rupee":
                        targetCode = "INR";
                        break;
                    case "Indonesian Rupiah":
                        targetCode = "IDR";
                        break;
                    case "Iranian Rial":
                        targetCode = "IRR";
                        break;
                    case "Iraqi Dinar":
                        targetCode = "IQD";
                        break;
                    case "Israeli New Sheqel":
                        targetCode = "ILS";
                        break;
                    case "Jamaican Dollar":
                        targetCode = "JMD";
                        break;
                    case "Jordanian Dinar":
                        targetCode = "JOD";
                        break;
                    case "Kazakhstani Tenge":
                        targetCode = "KZT";
                        break;
                    case "Kenyan Shilling":
                        targetCode = "KES";
                        break;
                    case "Kuwaiti Dinar":
                        targetCode = "KWD";
                        break;
                    case "Kyrgyzstan Som":
                        targetCode = "KGS";
                        break;
                    case "Lao Kip":
                        targetCode = "LAK";
                        break;
                    case "Latvian Lats":
                        targetCode = "LVL";
                        break;
                    case "Lebanese Pound":
                        targetCode = "LBP";
                        break;
                    case "Lesotho Loti":
                        targetCode = "LSL";
                        break;
                    case "Liberian Dollar":
                        targetCode = "LRD";
                        break;
                    case "Libyan Dinar":
                        targetCode = "LYD";
                        break;
                    case "Lithuanian Litas":
                        targetCode = "LTL";
                        break;
                    case "Macanese Pataca":
                        targetCode = "MOP";
                        break;
                    case "Macedonian Denar":
                        targetCode = "MKD";
                        break;
                    case "Malagasy Ariary":
                        targetCode = "MGA";
                        break;
                    case "Malawian Kwacha":
                        targetCode = "MWK";
                        break;
                    case "Malaysian Ringgit":
                        targetCode = "MYR";
                        break;
                    case "Maldivian Rufiyaa":
                        targetCode = "MVR";
                        break;
                    case "Mauritanian Ouguiya":
                        targetCode = "MRU";
                        break;
                    case "Mauritian Rupee":
                        targetCode = "MUR";
                        break;
                    case "Mexican Peso":
                        targetCode = "MXN";
                        break;
                    case "Moldova Lei":
                        targetCode = "MDL";
                        break;
                    case "Mongolian Togrog":
                        targetCode = "MNT";
                        break;
                    case "Moroccan Dirham":
                        targetCode = "MAD";
                        break;
                    case "Mozambican Metical":
                        targetCode = "MZN";
                        break;
                    case "Myanma Kyat":
                        targetCode = "MMK";
                        break;
                    case "Namibian Dollar":
                        targetCode = "NAD";
                        break;
                    case "Nepalese Rupee":
                        targetCode = "NPR";
                        break;
                    case "Neth. Antillean Guilder":
                        targetCode = "ANG";
                        break;
                    case "New Taiwan Dollar":
                        targetCode = "TWD";
                        break;
                    case "New Turkmenistan Manat":
                        targetCode = "TMT";
                        break;
                    case "New Zealand Dollar":
                        targetCode = "NZD";
                        break;
                    case "Nicaraguan Córdoba":
                        targetCode = "NIO";
                        break;
                    case "Nigerian Naira":
                        targetCode = "NGN";
                        break;
                    case "Norwegian Krone":
                        targetCode = "NOK";
                        break;
                    case "Omani Rial":
                        targetCode = "OMR";
                        break;
                    case "Pakistani Rupee":
                        targetCode = "PKR";
                        break;
                    case "Panamanian Balboa":
                        targetCode = "PAB";
                        break;
                    case "Papua New Guinean Kina":
                        targetCode = "PGK";
                        break;
                    case "Paraguayan Guarani":
                        targetCode = "PYG";
                        break;
                    case "Peruvian Nuevo Sol":
                        targetCode = "PEN";
                        break;
                    case "Philippine Peso":
                        targetCode = "PHP";
                        break;
                    case "Polish Zloty":
                        targetCode = "PLN";
                        break;
                    case "Qatari Rial":
                        targetCode = "QAR";
                        break;
                    case "Romanian New Leu":
                        targetCode = "RON";
                        break;
                    case "Russian Rouble":
                        targetCode = "RUB";
                        break;
                    case "Rwandan Franc":
                        targetCode = "RWF";
                        break;
                    case "Salvadoran Colon":
                        targetCode = "SVC";
                        break;
                    case "Samoan Tala":
                        targetCode = "WST";
                        break;
                    case "Sao Tome and Principe Dobra":
                        targetCode = "STN";
                        break;
                    case "Saudi Riyal":
                        targetCode = "SAR";
                        break;
                    case "Serbian Dinar":
                        targetCode = "RSD";
                        break;
                    case "Seychelles Rupee":
                        targetCode = "SCR";
                        break;
                    case "Sierra Leonean Leonean":
                        targetCode = "SLL";
                        break;
                    case "Singapore Dollar":
                        targetCode = "SGD";
                        break;
                    case "Soloman Islands Dollar":
                        targetCode = "SBD";
                        break;
                    case "Somali Shilling":
                        targetCode = "SOS";
                        break;
                    case "South African Rand":
                        targetCode = "ZAR";
                        break;
                    case "South Korean Won":
                        targetCode = "KRW";
                        break;
                    case "South Sudanese Pound":
                        targetCode = "SSP";
                        break;
                    case "Sri Lanka Rupee":
                        targetCode = "LKR";
                        break;
                    case "Sudanese Pound":
                        targetCode = "SDG";
                        break;
                    case "Surinamese Dollar":
                        targetCode = "SRD";
                        break;
                    case "Swazi Lilangeni":
                        targetCode = "SZL";
                        break;
                    case "Swedish Krona":
                        targetCode = "SEK";
                        break;
                    case "Syrian Pound":
                        targetCode = "SYP";
                        break;
                    case "Tajikistan Ruble":
                        targetCode = "TJS";
                        break;
                    case "Tanzanian Shilling":
                        targetCode = "TZS";
                        break;
                    case "Thai Baht":
                        targetCode = "THB";
                        break;
                    case "Tongan Pa'anga":
                        targetCode = "TOP";
                        break;
                    case "Trinidad Tobago Dollar":
                        targetCode = "TTD";
                        break;
                    case "Tunisian Dinar":
                        targetCode = "TND";
                        break;
                    case "Turkish Lira":
                        targetCode = "TRY";
                        break;
                    case "UAE Dirham":
                        targetCode = "AED";
                        break;
                    case "Ugandan Shilling":
                        targetCode = "UGX";
                        break;
                    case "Ukrainian Hryvnia":
                        targetCode = "UAH";
                        break;
                    case "Uruguayan Peso":
                        targetCode = "UYU";
                        break;
                    case "Uzbekistan Sum":
                        targetCode = "UZS";
                        break;
                    case "Vanuatu Vatu":
                        targetCode = "VUV";
                        break;
                    case "Venezuelan Bolivar":
                        targetCode = "VES";
                        break;
                    case "Vietnamese Dong":
                        targetCode = "VND";
                        break;
                    case "West African CFA Franc":
                        targetCode = "XOF";
                        break;
                    case "Yemeni Rial":
                        targetCode = "YER";
                        break;
                    case "Zambian Kwacha":
                        targetCode = "ZMW";
                        break;

                }
                Log.d(TAG, "onItemSelected: target code " + targetCode);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        tvexRate = findViewById(R.id.tvExRate);
        tvInputSummary = findViewById(R.id.tvInputSummary);

        Button btnGo = findViewById(R.id.btnCurrency);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Starting AsyncTask");
                input = Double.parseDouble(etInput.getText().toString());
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
            ArrayList<FeedItem> conversions;
            ParseCurrency parseCurrency = new ParseCurrency();
            parseCurrency.parse(result);
            conversions = parseCurrency.getConversions();
            for(FeedItem conv : conversions){
                Log.d(TAG, "onPostExecute: Inside conversions for loop");
                Log.d(TAG, "onPostExecute: target currency " + conv.getTargetCurrency());
                if(targetCode.equals(conv.getTargetCurrency())){
                    double output;
                    String inputString;
                    String outputString;
                    output = conv.getExchangeRate() * input;
                    output = Math.round(output * 100);
                    output /= 100;
                    inputString = input + " " + conv.getBaseCurrency() + " =";
                    outputString = output + " " + conv.getTargetCurrency();
                    Log.d(TAG, "onPostExecute: target code = target currency " + targetCode);
                    tvInputSummary.setText(inputString);
                    tvexRate.setText(outputString);
                }
            }
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

}
