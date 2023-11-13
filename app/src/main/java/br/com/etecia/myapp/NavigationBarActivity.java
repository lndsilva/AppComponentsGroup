package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class NavigationBarActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    ExploreFragment exploreFragment = new ExploreFragment();
    GoFragment goFragment = new GoFragment();
    SavedFragment savedFragment = new SavedFragment();

    ContributeFragment contributeFragment = new ContributeFragment();
    UpdatesFragment updatesFragment = new UpdatesFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_bar_layout);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.containerBottomNavView, exploreFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.mExplore) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.containerBottomNavView, exploreFragment).commit();
                    return true;
                } else if (item.getItemId() == R.id.mGo) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.containerBottomNavView, goFragment).commit();
                    return true;
                } else if (item.getItemId() == R.id.mSaved) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.containerBottomNavView, savedFragment).commit();
                    return true;
                } else if (item.getItemId() == R.id.mContribute) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.containerBottomNavView, contributeFragment).commit();
                    return true;
                } else if (item.getItemId() == R.id.mUpdates) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.containerBottomNavView, updatesFragment).commit();
                    return true;
                }

                return false;
            }
        });
    }
}