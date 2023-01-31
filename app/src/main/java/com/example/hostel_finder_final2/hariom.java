package com.example.hostel_finder_final2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class hariom extends AppCompatActivity {


    TextView tM1,tM2,tM3,tM4,tM5,tM6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAGS_CHANGED,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_hariom);

        tM1 = (TextView) findViewById(R.id.textviewM1);
        tM2 = (TextView) findViewById(R.id.textviewM2);
        tM3 = (TextView) findViewById(R.id.textviewM3);
        tM4 = (TextView) findViewById(R.id.textviewM4);
        tM5 = (TextView) findViewById(R.id.textviewM5);
        tM6 = (TextView) findViewById(R.id.textviewM6);



        tM2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.com/maps/place/Hari+Om+Boy's+Hostel/@18.456776,73.8563115,14z/data=!4m15!1m8!2m7!1shostels+near+vit+pune!3m5!1shostels+near+vit+pune!2s18.456199,+73.872126!4m2!1d73.8721263!2d18.4561989!3m5!1s0x3bc2eaec294ee3f7:0x7b5ca927ec9c4db6!8m2!3d18.4567729!4d73.8737898!15sChVob3N0ZWxzIG5lYXIgdml0IHB1bmWSAQtib3lzX2hvc3RlbA");
            }
        });


        tM4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentM4 = new Intent(Intent.ACTION_DIAL);
                intentM4.setData(Uri.parse("tel:7745835515"));
                startActivity(intentM4);
            }
        });

        tM6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentM6 = new Intent(Intent.ACTION_DIAL);
                intentM6.setData(Uri.parse("tel:7498571879"));
                startActivity(intentM6);
            }
        });


        tM5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://photos.app.goo.gl/91Teyt2z5mPWgbBH8");
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}



