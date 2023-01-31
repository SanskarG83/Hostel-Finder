package com.example.hostel_finder_final2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class VIT_A extends AppCompatActivity {


    TextView t001,t002,t003,t004,t005;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAGS_CHANGED,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_vit);

        t001 = (TextView) findViewById(R.id.textview001);
        t002 = (TextView) findViewById(R.id.textview002);
        t003 = (TextView) findViewById(R.id.textview003);
        t004 = (TextView) findViewById(R.id.textview004);
        t005 = (TextView) findViewById(R.id.textview005);


        t002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.co.in/maps/place/VIT+College+Vishwakarma+Home-+A/@18.462621,73.8789374,17z/data=!3m1!4b1!4m5!3m4!1s0x3bc2ea8ccd395d71:0x759f5bb2cd8c9e78!8m2!3d18.4626128!4d73.8811267?hl=en&authuser=0");
            }
        });


        t004.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent004 = new Intent(Intent.ACTION_DIAL);
                intent004.setData(Uri.parse("tel:02024202287"));
                startActivity(intent004);
            }
        });


        t005.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://photos.app.goo.gl/VzeY8LPso5qLyQJRA");
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}



