package com.example.myfarmug;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Update_profile extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void Submit(View view) {
        Intent i = new Intent(getApplicationContext(), Home.class);
        Toast.makeText(Update_profile.this, "Profile Updated", Toast.LENGTH_SHORT).show();
        startActivity(i);
        finish();
    }
    public void CheckBoxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.poutry:
                if (checked){
                    Toast.makeText(Update_profile.this,"You selected poutry",Toast.LENGTH_SHORT).show();
                }
            case R.id.live:
                if (checked){
                    Toast.makeText(Update_profile.this,"You selected Livestock",Toast.LENGTH_SHORT).show();
                }
            case R.id.crops:
                if(checked){
                    Toast.makeText(Update_profile.this,"You selected crops",Toast.LENGTH_SHORT).show();
                }
        }

    }

}