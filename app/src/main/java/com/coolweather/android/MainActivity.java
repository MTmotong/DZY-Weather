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
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private ChooseAreaFragment chooseAreaFragment;

    DrawerLayout mDrawLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (prefs.getString("weather", null) != null) {
            Intent intent = new Intent(this, WeatherActivity.class);
            startActivity(intent);
            finish();
        }

        //侧边栏
        NavigationView navigationView = (NavigationView) findViewById(R.id.left_drawer);
        navigationView.setCheckedItem(R.id.nav_addcity);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                fragmentTransaction = fragmentManager.beginTransaction();
                hideAllFragment(fragmentTransaction);
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        mDrawLayout.openDrawer(GravityCompat.START);
                        break;
                    case R.id.nav_addcity:
                        if (chooseAreaFragment == null) {
                            chooseAreaFragment = new ChooseAreaFragment();
                            fragmentTransaction.add(R.id.choose_area_fragment, chooseAreaFragment);
                        }
                        Toast.makeText(MainActivity.this, "dianle ", Toast.LENGTH_SHORT).show();
                }
                fragmentTransaction.commit();
                mDrawLayout.closeDrawers();
                return true;
            }
        });
    }

    private void initFragment() {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        hideAllFragment(fragmentTransaction);
    }
    private void hideAllFragment(FragmentTransaction fragmentTransaction) {
//        if(weathPage != null) {
//            fragmentTransaction.hide(weatherPage);
//        }
    }

}