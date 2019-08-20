package com.arcticumi.convert;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

public class ActivityMain extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    private DrawerLayout drawer;
    private ImageView ivDistance;
    private ImageView ivArea;
    private ImageView ivVolume;
    private ImageView ivTime;
    private ImageView ivCurrency;
    private ImageView ivTemperature;
    private ImageView ivMass;
    private ImageView ivStorage;
    private ImageView ivEnergy;
    private ImageView ivSpeed;

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
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
        }
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ivDistance:
                startActivity(new Intent(this, ActivityDistance.class));
                finish();
                break;
            case R.id.ivArea:
                startActivity(new Intent(this, ActivityArea.class));
                finish();
                break;
            case R.id.ivVolume:
                startActivity(new Intent(this, ActivityVolume.class));
                finish();
                break;
            case R.id.ivTime:
                startActivity(new Intent(this, ActivityTime.class));
                finish();
                break;
            case R.id.ivCurrency:
                startActivity(new Intent(this, ActivityCurrency.class));
                finish();
                break;
            case R.id.ivTemp:
                startActivity(new Intent(this, ActivityTemp.class));
                finish();
                break;
            case R.id.ivMass:
                startActivity(new Intent(this, ActivityMass.class));
                finish();
                break;
            case R.id.ivStorage:
                startActivity(new Intent(this, ActivityDigitalStorage.class));
                finish();
                break;
            case R.id.ivEnergy:
                startActivity(new Intent(this, ActivityEnergy.class));
                finish();
                break;
            case R.id.ivSpeed:
                startActivity(new Intent(this, ActivitySpeed.class));
                finish();
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        ivDistance = findViewById(R.id.ivDistance);
        ivArea = findViewById(R.id.ivArea);
        ivVolume = findViewById(R.id.ivVolume);
        ivTime = findViewById(R.id.ivTime);
        ivCurrency = findViewById(R.id.ivCurrency);
        ivTemperature = findViewById(R.id.ivTemp);
        ivMass = findViewById(R.id.ivMass);
        ivStorage = findViewById(R.id.ivStorage);
        ivEnergy = findViewById(R.id.ivEnergy);
        ivSpeed = findViewById(R.id.ivSpeed);

        ivDistance.setOnClickListener(this);
        ivArea.setOnClickListener(this);
        ivVolume.setOnClickListener(this);
        ivTime.setOnClickListener(this);
        ivCurrency.setOnClickListener(this);
        ivTemperature.setOnClickListener(this);
        ivMass.setOnClickListener(this);
        ivStorage.setOnClickListener(this);
        ivEnergy.setOnClickListener(this);
        ivSpeed.setOnClickListener(this);
    }

}