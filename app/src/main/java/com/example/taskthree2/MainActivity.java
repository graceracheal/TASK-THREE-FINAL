package com.example.taskthree2;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private MaterialToolbar topAppBar;
    private BottomAppBar bottomAppBar;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topAppBar = findViewById(R.id.topAppBar);
        bottomAppBar = findViewById(R.id.bottomAppBar);
        fab = findViewById(R.id.fab);

        setSupportActionBar(topAppBar);

        bottomAppBar.setNavigationOnClickListener(v -> {
            Toast.makeText(this, "Menu clicked", Toast.LENGTH_SHORT).show();
        });

        bottomAppBar.setOnMenuItemClickListener(item -> {
            if (item.getItemId() == R.id.profile) {
                Toast.makeText(this, "Profile clicked", Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        });

        fab.setOnClickListener(v -> {
            Toast.makeText(this, "Play clicked", Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.top_app_bar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.search) {
            Toast.makeText(this, "Search clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}