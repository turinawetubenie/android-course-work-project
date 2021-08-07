package com.example.myfarmug;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflate = getMenuInflater();
        inflate.inflate(R.menu.drawer_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.backup:
                Intent s = new Intent(Home.this, Farming_Tips.class);
                startActivity(s);
                return true;
            case R.id.preferences:
                Intent p = new Intent(Home.this, Location.class);
                startActivity(p);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }
    public void Log_in(View view) {
        Intent i = new Intent(getApplicationContext(), Log_in.class);
        startActivity(i);
        finish();
    }
    public void update(View view) {
        Intent i = new Intent(getApplicationContext(), Update_profile.class);
        Toast.makeText(Home.this, "Profile Updated", Toast.LENGTH_SHORT).show();
        startActivity(i);
        finish();
    }
    public void location(View view) {
        Intent i = new Intent(getApplicationContext(), Location.class);
        startActivity(i);
        finish();
    }
    public void tips(View view) {
        Intent i = new Intent(getApplicationContext(), Farming_Tips.class);
        startActivity(i);
        finish();
    }
    public void Chat(View view) {
        Intent i = new Intent(getApplicationContext(), Chat.class);
        startActivity(i);
        finish();
    }
    public void weather(View view) {
        Intent i = new Intent(getApplicationContext(), Location.class);
        startActivity(i);
        finish();
    }
}