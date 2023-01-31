package com.example.hostel_finder_final2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class purandar extends AppCompatActivity {


    TextView t001,t002,t003,t004,t005;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAGS_CHANGED,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_purandar);

        t001 = (TextView) findViewById(R.id.textview001);
        t002 = (TextView) findViewById(R.id.textview002);
        t003 = (TextView) findViewById(R.id.textview003);
        t004 = (TextView) findViewById(R.id.textview004);
        t005 = (TextView) findViewById(R.id.textview005);


        t002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.co.in/maps/place/Purandar+Girls+Hostel/@18.4550321,73.8718421,17z/data=!3m1!4b1!4m5!3m4!1s0x3bc2eb7745938bff:0x57422cf9d01550b0!8m2!3d18.4550226!4d73.8739828?hl=en&authuser=0");
            }
        });


        t005.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://photos.app.goo.gl/aTvTaD7uoA9oY1xk7");
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}



