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
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class ActivityEnergy extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = "ActivityEnergy";
    private DrawerLayout drawer;
    private String inputUnit, outputUnit;
    private double input;
    private String output;


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                startActivity(new Intent(this, ActivityMain.class));
                finish();
                break;
            case R.id.distance:
                startActivity(new Intent(this, ActivityDistance.class));
                finish();
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
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy);
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

        final Conversions convert = new Conversions();
        Button btnConvert = findViewById(R.id.btnEnergy);
        final EditText etInput = findViewById(R.id.etEnergyInput);
        final TextView tvInputSummary = findViewById(R.id.tvEnergyInput);
        final TextView tvOutput = findViewById(R.id.tvEnergyOutput);
        Spinner spEnergyFrom = findViewById(R.id.spEnergyFrom);
        Spinner spEnergyTo = findViewById(R.id.spEnergyTo);

        ArrayAdapter<CharSequence> energyAdapter = ArrayAdapter.createFromResource(this, R.array.energy, R.layout.spinner_item);
        energyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spEnergyFrom.setAdapter(energyAdapter);
        spEnergyTo.setAdapter(energyAdapter);

        spEnergyFrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                inputUnit = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spEnergyTo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                try {
                    input = Double.valueOf(String.valueOf(etInput.getText()));
                    switch (inputUnit) {
                        case "Joule":
                            convert.jouleToOther(input, outputUnit);
                            output = convert.getStrOutput();
                            break;
                        case "Kilojoule":
                            convert.kilojouleToOther(input, outputUnit);
                            output = convert.getStrOutput();
                            break;
                        case "Gram calorie":
                            convert.gramCalorieToOther(input, outputUnit);
                            output = convert.getStrOutput();
                            break;
                        case "Kilocalorie":
                            convert.kilocalorieToOther(input, outputUnit);
                            output = convert.getStrOutput();
                            break;
                        case "Watt hour":
                            convert.wattHourToOther(input, outputUnit);
                            output = convert.getStrOutput();
                            break;
                        case "Kilowatt hour":
                            convert.kilowattHourToOther(input, outputUnit);
                            output = convert.getStrOutput();
                            break;
                        case "Electronvolt":
                            convert.electronvoltToOther(input, outputUnit);
                            output = convert.getStrOutput();
                            break;
                        case "British thermal unit":
                            convert.britishThermalUnitToOther(input, outputUnit);
                            output = convert.getStrOutput();
                            break;
                        case "US therm":
                            convert.usThermToOther(input, outputUnit);
                            output = convert.getStrOutput();
                            break;
                        case "Foot-pound":
                            convert.footPoundToOther(input, outputUnit);
                            output = convert.getStrOutput();
                            break;
                    } //todo put in another function
                    Log.d(TAG, "onClick: Input value after conversion = " + input);
                    Log.d(TAG, "onClick: Output value after conversion = " + output);
                    String inputSummary;
                    inputSummary = input + " " + inputUnit + "s =";
//                    double temp = Math.round(Double.parseDouble(output) * 100);
//                    temp = temp / 100;
//                    output = String.valueOf(temp);
                    String outputString;
                    outputString = output + " " + outputUnit + "s";
                    tvInputSummary.setText(inputSummary);
                    tvOutput.setText(outputString);
                } catch (NumberFormatException ignored) {
                } catch (NullPointerException e) {
                    Log.e(TAG, "afterTextChanged: " + e);
                }
            }
        });


    }

}
