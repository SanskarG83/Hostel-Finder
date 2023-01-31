package com.example.hostel_finder_final2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class girlhostel extends AppCompatActivity {


    TextView t001,t002,t003,t004,t005;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAGS_CHANGED,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_girlhostel);

        t001 = (TextView) findViewById(R.id.textview001);
        t002 = (TextView) findViewById(R.id.textview002);
        t003 = (TextView) findViewById(R.id.textview003);
        t004 = (TextView) findViewById(R.id.textview004);
        t005 = (TextView) findViewById(R.id.textview005);



        t002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.com/maps/place/Girls+Hostel%2FPaying+Guest+near+VIT+and+VIIT+college/@18.4575647,73.8664409,17z/data=!3m1!4b1!4m5!3m4!1s0x3bc2eba7b02c6123:0xdca391954fad2366!8m2!3d18.4575567!4d73.8686296");
            }
        });




        t004.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent004 = new Intent(Intent.ACTION_DIAL);
                intent004.setData(Uri.parse("tel:9604703291"));
                startActivity(intent004);
            }
        });


        t005.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://photos.app.goo.gl/NE1a73hBhbcsMaWA6");
            }
        });


    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}



