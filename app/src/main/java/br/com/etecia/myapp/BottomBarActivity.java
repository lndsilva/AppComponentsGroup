package br.com.etecia.myapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BottomBarActivity extends AppCompatActivity {

    BottomAppBar bottomAppBar;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_bar_layout);

        fab = findViewById(R.id.idFAB);
        bottomAppBar = findViewById(R.id.idBottomBar);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Cliquei no FAB", Toast.LENGTH_SHORT).show();

            }
        });

        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Cliquei no buscar", Toast.LENGTH_SHORT).show();

            }
        });

        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                if (item.getItemId() == R.id.mDelete) {
                    Toast.makeText(getApplicationContext(), "Cliquei no delete", Toast.LENGTH_SHORT).show();
                } else if (item.getItemId() == R.id.mArchive) {
                    Toast.makeText(getApplicationContext(), "Cliquei no Archive", Toast.LENGTH_SHORT).show();
                } else if (item.getItemId() == R.id.mTurn) {
                    Toast.makeText(getApplicationContext(), "Cliquei no voltar", Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });


    }
}