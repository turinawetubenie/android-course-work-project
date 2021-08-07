package com.example.myfarmug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Farming_Tips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farming__tips);
    }
    public void tomatoes(View view) {
        Intent i = new Intent(getApplicationContext(),Tomato.class);
        startActivity(i);
        finish();
    }
    public void carrot(View view) {
        Intent i = new Intent(getApplicationContext(),Tomato.class);
        startActivity(i);
        finish();
    }
    public void beans(View view) {
        Intent i = new Intent(getApplicationContext(),Beans.class);
        startActivity(i);
        finish();
    }
    public void paper(View view) {
        Intent i = new Intent(getApplicationContext(),Paper.class);
        startActivity(i);
        finish();
    }
    public void Water_mellon(View view) {
        Intent i = new Intent(getApplicationContext(),Mellon.class);
        startActivity(i);
        finish();
    }
    public void fish(View view) {
        Intent i = new Intent(getApplicationContext(),Fish.class);
        startActivity(i);
        finish();
    }
    public void passion_fruit(View view) {
        Intent i = new Intent(getApplicationContext(),Passion.class);
        startActivity(i);
        finish();
    }
    public void rabbit(View view) {
        Intent i = new Intent(getApplicationContext(),Rabbit.class);
        startActivity(i);
        finish();
    }

}