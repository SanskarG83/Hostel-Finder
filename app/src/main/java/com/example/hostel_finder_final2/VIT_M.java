package com.example.hostel_finder_final2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class VIT_M extends AppCompatActivity {


    TextView tM1,tM2,tM3,tM4,tM5,tM6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAGS_CHANGED,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_vit_m);

        tM1 = (TextView) findViewById(R.id.textviewM1);
        tM2 = (TextView) findViewById(R.id.textviewM2);
        tM3 = (TextView) findViewById(R.id.textviewM3);
        tM4 = (TextView) findViewById(R.id.textviewM4);
        tM5 = (TextView) findViewById(R.id.textviewM5);
        tM6 = (TextView) findViewById(R.id.textviewM6);



        tM2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.co.in/maps?hl=en&tab=rl&authuser=0");
            }
        });


        tM4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentM4 = new Intent(Intent.ACTION_DIAL);
                intentM4.setData(Uri.parse("tel:02024202287"));
                startActivity(intentM4);
            }
        });

        tM6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentM6 = new Intent(Intent.ACTION_DIAL);
                intentM6.setData(Uri.parse("tel:02024202230"));
                startActivity(intentM6);
            }
        });


        tM5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://i.postimg.cc/DZ7tq9T3/No-Image.jpg");
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}



