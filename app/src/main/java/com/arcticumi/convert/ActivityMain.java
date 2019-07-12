package com.arcticumi.convert;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

public class ActivityMain extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = "ActivityMain";
    private DrawerLayout drawer;

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


    }

}
