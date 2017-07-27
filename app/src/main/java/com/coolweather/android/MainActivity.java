package com.coolweather.android;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.coolweather.android.service.AutoUpdateService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Intent intent1 = new Intent(this, AutoUpdateService.class);
//        startService(intent1);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        Log.d("MainActivity", "onCreate: 1");
        if (prefs.getString("weather", null) != null) {
            Log.d("MainActivity", "onCreate: 2");
            Intent intent = new Intent(this, WeatherActivity.class);
            startActivity(intent);
            finish();
        } else {
            Log.d("MainActivity", "onCreate: 3");
            Intent intent = new Intent(this, WeatherActivity.class);
            intent.putExtra("weather_id", "北京");

            startActivity(intent);
            finish();

        }
    }
}