package com.example.myfarmug;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Locale;

public class complete_profile extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_profile);
        Spinner spinner =  findViewById(R.id.district);
        ArrayAdapter<CharSequence>adapter = ArrayAdapter.createFromResource(this,R.array.district,android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

       spinner.setOnItemSelectedListener(this);
        Spinner peri =  findViewById(R.id.period);
        ArrayAdapter<CharSequence>adapte = ArrayAdapter.createFromResource(this,R.array.period,android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        peri.setAdapter(adapte);
        peri.setOnItemSelectedListener(this);
}

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),text, Toast.LENGTH_SHORT);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    public void CheckBoxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.poutry:
                if (checked){
                    Toast.makeText(complete_profile.this,"You selected poutry",Toast.LENGTH_SHORT).show();
                }
            case R.id.live:
                if (checked){
                    Toast.makeText(complete_profile.this,"You selected Livestock",Toast.LENGTH_SHORT).show();
                }
            case R.id.crops:
                if(checked){
                    Toast.makeText(complete_profile.this,"You selected crops",Toast.LENGTH_SHORT).show();
                }
                }

    }
    public void Click_here(View view) {
        Intent i = new Intent(getApplicationContext(),Home.class);
        startActivity(i);
        finish();
    }
}