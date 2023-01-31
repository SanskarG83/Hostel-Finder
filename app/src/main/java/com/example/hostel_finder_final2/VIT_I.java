package com.example.hostel_finder_final2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class VIT_I extends AppCompatActivity {


    TextView t0001,t0002,t0003,t0004,t0005;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAGS_CHANGED,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_vit_i);

        t0001 = (TextView) findViewById(R.id.textview0001);
        t0002 = (TextView) findViewById(R.id.textview0002);
        t0003 = (TextView) findViewById(R.id.textview0003);
        t0004 = (TextView) findViewById(R.id.textview0004);
        t0005 = (TextView) findViewById(R.id.textview0005);


        t0002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.com/maps/search/S+No+43,+Bibwewadi+Gaonthan,+Pune+%E2%80%93+37/@18.4709061,73.8582237,15z");
            }
        });


        t0004.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent004 = new Intent(Intent.ACTION_DIAL);
                intent004.setData(Uri.parse("tel:02024202230"));
                startActivity(intent004);
            }
        });


        t0005.setOnClickListener(new View.OnClickListener() {
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



