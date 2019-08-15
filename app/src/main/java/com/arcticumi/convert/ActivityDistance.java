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
    private String inputUnit, outputUnit;
    private static final String TAG = "ActivityDistance";
    private DrawerLayout drawer;


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                startActivity(new Intent(this, ActivityMain.class));
                finish();
                break;
            case R.id.distance:
                break;
            case R.id.area:
                startActivity(new Intent(this, ActivityArea.class));
                finish();
                break;
            case R.id.volume:
                startActivity(new Intent(this, ActivityVolume.class));
                finish();
                break;
            case R.id.time:
                startActivity(new Intent(this, ActivityTime.class));
                finish();
                break;
            case R.id.currency:
                startActivity(new Intent(this, ActivityCurrency.class));
                finish();
                break;
            case R.id.temp:
                startActivity(new Intent(this, ActivityTemp.class));
                finish();
                break;
            case R.id.mass:
                startActivity(new Intent(this, ActivityMass.class));
                finish();
                break;
            case R.id.storage:
                startActivity(new Intent(this, ActivityDigitalStorage.class));
                finish();
                break;
            case R.id.speed:
                startActivity(new Intent(this, ActivitySpeed.class));
                finish();
                break;
            case R.id.fuel:
                startActivity(new Intent(this, ActivityFuelEconomy.class));
                finish();
                break;
            case R.id.frequency:
                startActivity(new Intent(this, ActivityFrequency.class));
                finish();
                break;
            case R.id.datatransfer:
                startActivity(new Intent(this, ActivityDataTranserRate.class));
                finish();
                break;
            case R.id.energy:
                startActivity(new Intent(this, ActivityEnergy.class));
                finish();
                break;
            case R.id.planeangle:
                startActivity(new Intent(this, ActivityPlaneAngle.class));
                finish();
                break;
            case R.id.pressure:
                startActivity(new Intent(this, ActivityPressure.class));
                finish();
                break;
            case R.id.other:
                startActivity(new Intent(this, ActivityOther.class));
                finish();
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
        final TextView tvOutput = findViewById(R.id.tvDistanceOutput);
        final TextView tvInputSummary = findViewById(R.id.tvDistanceInputSummary);
        final EditText etInput = findViewById(R.id.etDistanceInput);
        Button btnConvert = findViewById(R.id.btnDistanceConvert);
        final Spinner spDistanceFrom = findViewById(R.id.spDistanceFrom);
        final Spinner spDistanceTo = findViewById(R.id.spDistanceTo);

        ArrayAdapter<CharSequence> adapterDistance = ArrayAdapter.createFromResource(this, R.array.distance, R.layout.spinner_item);
        adapterDistance.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spDistanceFrom.setAdapter(adapterDistance);
        spDistanceTo.setAdapter(adapterDistance);


        spDistanceFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                inputUnit = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spDistanceTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                outputUnit = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Input value before conversion = " + input);
                Log.d(TAG, "onClick: Output value before conversion = " + output);
                Log.d(TAG, "onClick: Output Unit Symbol = " + outputUnit);
                try {
                    input = Double.valueOf(String.valueOf(etInput.getText()));
                    switch (inputUnit) {
                        case "Inches":
                            convert.inchesToOther(input, outputUnit);
                            output = convert.getDoubleOut();
                            break;
                        case "Feet":
                            convert.feetToOther(input, outputUnit);
                            output = convert.getDoubleOut();
                            break;
                        case "Miles":
                            convert.milesToOther(input, outputUnit);
                            output = convert.getDoubleOut();
                            break;
                        case "Centimetres":
                            convert.centiToOther(input, outputUnit);
                            output = convert.getDoubleOut();
                            break;
                        case "Metres":
                            convert.metresToOther(input, outputUnit);
                            output = convert.getDoubleOut();
                            break;
                        case "Kilometres":
                            convert.kilometreToOther(input, outputUnit);
                            output = convert.getDoubleOut();
                            break;
                    } //todo put in another function
                    Log.d(TAG, "onClick: Input value after conversion = " + input);
                    Log.d(TAG, "onClick: Output value after conversion = " + output);
                    Format fm = new Format(inputUnit, outputUnit, output);
                    outputUnit = fm.getOutput();
                    String inputSummary;
                    inputSummary = input + " " + inputUnit + " =";
                    tvInputSummary.setText(inputSummary);
                    tvOutput.setText(outputUnit);
                } catch (NumberFormatException ignored) {
                } catch (NullPointerException e) {
                    Log.e(TAG, "afterTextChanged: " + e);
                }
            }
        });

    }

}

