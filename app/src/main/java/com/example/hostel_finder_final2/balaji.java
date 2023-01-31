package com.example.hostel_finder_final2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class balaji extends AppCompatActivity {


    TextView t001,t002,t003,t004,t005;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAGS_CHANGED,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_balaji);

        t001 = (TextView) findViewById(R.id.textview001);
        t002 = (TextView) findViewById(R.id.textview002);
        t003 = (TextView) findViewById(R.id.textview003);
        t004 = (TextView) findViewById(R.id.textview004);
        t005 = (TextView) findViewById(R.id.textview005);


        t002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.co.in/maps/place/Balaji+Boys+Hostel/@18.4567874,73.8676004,17z/data=!3m1!4b1!4m5!3m4!1s0x3bc2eaebdd4fc8e3:0xbe3ee2c03f6b05a8!8m2!3d18.4567816!4d73.8697352?hl=en&authuser=0");
            }
        });


        t005.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://photos.app.goo.gl/7XtMUtJ8CRTRZipr5");
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}



