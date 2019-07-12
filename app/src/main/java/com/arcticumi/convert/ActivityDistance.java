package com.arcticumi.convert;

import android.content.Intent;
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
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class ActivityDistance extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private double input;
    private double output;
    private String measurementFrom, measurementTo, unit, outputUnit, outputUnitSymbol;
    private static final String TAG = "ActivityDistance";
    private DrawerLayout drawer;


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                startActivity(new Intent(this, ActivityMain.class));
                break;
            case R.id.distance:
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
                startActivity(new Intent(this, ActivityCurrency.class));
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
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);
        Toolbar tb = findViewById(R.id.toolbar);
        setSupportActionBar(tb);


        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, tb,
                R.string.navigation_drawer_open, R.string.navigation_drawer_closed);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        final Conversions convert = new Conversions();
        final TextView tvOutput = findViewById(R.id.tvOutput);
        final TextView tvUnitDisplay = findViewById(R.id.tvUnitDisplay);
        final EditText etInput = findViewById(R.id.etInput);
        Button bt = findViewById(R.id.button);
        final Spinner spUnitFrom = findViewById(R.id.spUnitFrom);
        final Spinner spUnitTo = findViewById(R.id.spUnitTo);
        Spinner spMeasurementFrom = findViewById(R.id.spMeasurementFrom);
        Spinner spMeasurementTo = findViewById(R.id.spMeasurementTo);

        ArrayAdapter<CharSequence> adapterMeasurement = ArrayAdapter.createFromResource(this, R.array.spMeasurement, R.layout.spinner_item);
        adapterMeasurement.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spMeasurementFrom.setAdapter(adapterMeasurement);
        spMeasurementTo.setAdapter(adapterMeasurement);

        final ArrayAdapter<CharSequence> adapterUnitsMetric = ArrayAdapter.createFromResource(this, R.array.metricUnitsDistance, R.layout.spinner_item);
        adapterUnitsMetric.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter<CharSequence> adapterUnitsImperial = ArrayAdapter.createFromResource(this, R.array.imperialUnitsDistance, R.layout.spinner_item);
        adapterUnitsImperial.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spMeasurementFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                measurementFrom = parent.getItemAtPosition(position).toString();
                //set unit arrayadapter
                try {
                    if (measurementFrom.equals("Metric") && measurementTo.equals("Imperial")) {
                        spUnitFrom.setAdapter(adapterUnitsMetric);
                        spUnitTo.setAdapter(adapterUnitsImperial);
                    } else if (measurementFrom.equals("Imperial") && measurementTo.equals("Metric")) {
                        spUnitFrom.setAdapter(adapterUnitsImperial);
                        spUnitTo.setAdapter(adapterUnitsMetric);
                    } else if (measurementFrom.equals("Imperial") && measurementTo.equals("Imperial")) {
                        spUnitFrom.setAdapter(adapterUnitsImperial);
                        spUnitTo.setAdapter(adapterUnitsImperial);
                    } else {
                        spUnitFrom.setAdapter(adapterUnitsMetric);
                        spUnitTo.setAdapter(adapterUnitsMetric);
                    }
                } catch (NullPointerException ignored) {

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spMeasurementTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                measurementTo = parent.getItemAtPosition(position).toString();
                //set unit arrayadapter
                try {
                    if (measurementFrom.equals("Metric") && measurementTo.equals("Imperial")) {
                        spUnitFrom.setAdapter(adapterUnitsMetric);
                        spUnitTo.setAdapter(adapterUnitsImperial);
                    } else if (measurementFrom.equals("Imperial") && measurementTo.equals("Metric")) {
                        spUnitFrom.setAdapter(adapterUnitsImperial);
                        spUnitTo.setAdapter(adapterUnitsMetric);
                    } else if (measurementFrom.equals("Imperial") && measurementTo.equals("Imperial")) {
                        spUnitFrom.setAdapter(adapterUnitsImperial);
                        spUnitTo.setAdapter(adapterUnitsImperial);
                    } else {
                        spUnitFrom.setAdapter(adapterUnitsMetric);
                        spUnitTo.setAdapter(adapterUnitsMetric);
                    }
                } catch (NullPointerException ignored) {

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spUnitFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                etInput.setText(String.valueOf(input));
                unit = parent.getItemAtPosition(position).toString();
                switch (unit) {
                    case "Centimetres":
                        tvUnitDisplay.setText(unit);
                        break;
                    case "Metres":
                        tvUnitDisplay.setText(unit);
                        break;
                    case "Kilometres":
                        tvUnitDisplay.setText(unit);
                        break;
                    case "Inches":
                        tvUnitDisplay.setText(unit);
                        break;
                    case "Feet":
                        tvUnitDisplay.setText(unit);
                        break;
                    case "Miles":
                        tvUnitDisplay.setText(unit);
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spUnitTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                outputUnitSymbol = parent.getItemAtPosition(position).toString();
//                etInput.setText(String.valueOf(input));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    input = Double.valueOf(String.valueOf(etInput.getText()));
                    switch (unit) {
                        case "Inches":
                            convert.inchesToOther(input, outputUnitSymbol);
                            output = convert.getOutput();
                            break;
                        case "Feet":
                            convert.feetToOther(input, outputUnitSymbol);
                            output = convert.getOutput();
                            break;
                        case "Miles":
                            convert.milesToOther(input, outputUnitSymbol);
                            output = convert.getOutput();
                            break;
                        case "Centimetres":
                            convert.centiToOther(input, outputUnitSymbol);
                            output = convert.getOutput();
                            break;
                        case "Metres":
                            convert.metresToOther(input, outputUnitSymbol);
                            output = convert.getOutput();
                            break;
                        case "Kilometre":
                            convert.kilometreToOther(input, outputUnitSymbol);
                            output = convert.getOutput();
                            break;
                    } //todo put in another function
                    Format fm = new Format(unit, outputUnitSymbol, output);
                    outputUnit = fm.getOutput();
                    tvOutput.setText(outputUnit);
                } catch (NumberFormatException ignored) {
                } catch (NullPointerException e) {
                    Log.e(TAG, "afterTextChanged: " + e);
                }
            }
        });

    }

}

