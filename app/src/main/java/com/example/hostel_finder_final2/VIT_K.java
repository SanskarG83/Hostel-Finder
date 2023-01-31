package com.example.hostel_finder_final2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class VIT_K extends AppCompatActivity {


    TextView t00001,t00002,t00003,t00004,t00005,t00006;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAGS_CHANGED,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_vit_k);

        t00001 = (TextView) findViewById(R.id.textview00001);
        t00002 = (TextView) findViewById(R.id.textview00002);
        t00003 = (TextView) findViewById(R.id.textview00003);
        t00004 = (TextView) findViewById(R.id.textview00004);
        t00005 = (TextView) findViewById(R.id.textview00005);
        t00006 = (TextView) findViewById(R.id.textview00006);



        t00002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.com/maps/place/Shreyas+Hostel/@18.4636353,73.859391,17z/data=!3m1!4b1!4m5!3m4!1s0x3bc2eabf0be217cb:0xfba63cfcb52e4994!8m2!3d18.4636353!4d73.8615797");
            }
        });


        t00004.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent004 = new Intent(Intent.ACTION_DIAL);
                intent004.setData(Uri.parse("tel:02024202287"));
                startActivity(intent004);
            }
        });

        t00006.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent00006 = new Intent(Intent.ACTION_DIAL);
                intent00006.setData(Uri.parse("tel:02024202230"));
                startActivity(intent00006);
            }
        });


        t00005.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://photos.app.goo.gl/Ffivb3WGAWQMYxAq9");
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}



