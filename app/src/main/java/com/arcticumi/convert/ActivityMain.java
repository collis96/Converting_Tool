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
    private ImageView ivWeight;
    private ImageView ivStorage;
    private ImageView ivMagnetism;
    private ImageView ivRadiation;
    private ImageView ivFluid;
    private ImageView ivOther;

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
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
                startActivity(new Intent(this, ActivityCurrency.class));
                break;
            case R.id.temp:
                startActivity(new Intent(this, ActivityTemp.class));
                break;
            case R.id.mass:
                startActivity(new Intent(this, ActivityMass.class));
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
            case R.id.fuel:
                startActivity(new Intent(this, ActivityFuel.class));
                break;
            case R.id.other:
                startActivity(new Intent(this, ActivityOther.class));
                break;
        }
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ivDistance:
                startActivity(new Intent(this, ActivityDistance.class));
                break;
            case R.id.ivArea:
                startActivity(new Intent(this, ActivityArea.class));
                break;
            case R.id.ivVolume:
                startActivity(new Intent(this, ActivityVolume.class));
                break;
            case R.id.ivTime:
                startActivity(new Intent(this, ActivityTime.class));
                break;
            case R.id.ivCurrency:
                startActivity(new Intent(this, ActivityCurrency.class));
                break;
            case R.id.ivTemp:
                startActivity(new Intent(this, ActivityTemp.class));
                break;
            case R.id.ivWeight:
                startActivity(new Intent(this, ActivityMass.class));
                break;
            case R.id.ivStorage:
                startActivity(new Intent(this, ActivityStorage.class));
                break;
            case R.id.ivMagnetism:
                startActivity(new Intent(this, ActivityMagnetism.class));
                break;
            case R.id.ivRadiation:
                startActivity(new Intent(this, ActivityRadiation.class));
                break;
            case R.id.ivFluid:
                startActivity(new Intent(this, ActivityFuel.class));
                break;
            case R.id.ivOther:
                startActivity(new Intent(this, ActivityOther.class));
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
        ivWeight = findViewById(R.id.ivWeight);
        ivStorage = findViewById(R.id.ivStorage);
        ivMagnetism = findViewById(R.id.ivMagnetism);
        ivRadiation = findViewById(R.id.ivRadiation);
        ivFluid = findViewById(R.id.ivFluid);
        ivOther = findViewById(R.id.ivOther);

        ivDistance.setOnClickListener(this);
        ivArea.setOnClickListener(this);
        ivVolume.setOnClickListener(this);
        ivTime.setOnClickListener(this);
        ivCurrency.setOnClickListener(this);
        ivTemperature.setOnClickListener(this);
        ivWeight.setOnClickListener(this);
        ivStorage.setOnClickListener(this);
        ivMagnetism.setOnClickListener(this);
        ivRadiation.setOnClickListener(this);
        ivFluid.setOnClickListener(this);
        ivOther.setOnClickListener(this);

    }

}
