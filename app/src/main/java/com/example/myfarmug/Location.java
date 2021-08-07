package com.example.myfarmug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Location extends AppCompatActivity {
    Intent intent = null, chooser = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        Button button = findViewById(R.id.launch_map);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent = new Intent(Intent.ACTION_VIEW);
                intent. setData(Uri.parse("geo:19.076.72.8777"));
                chooser = Intent.createChooser(intent,"Launch Maps");
                startActivity(chooser);
            }
        });
    }
}