package com.example.hostel_finder_final2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class sumadhu extends AppCompatActivity {


    TextView t001,t002,t003,t004,t005;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAGS_CHANGED,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_sumadhu);

        t001 = (TextView) findViewById(R.id.textview001);
        t002 = (TextView) findViewById(R.id.textview002);
        t003 = (TextView) findViewById(R.id.textview003);
        t004 = (TextView) findViewById(R.id.textview004);
        t005 = (TextView) findViewById(R.id.textview005);


        t002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.google.com/maps?q=Sumadhu+Boys+Hostel&rlz=1C1RLNS_enIN976IN976&um=1&ie=UTF-8&sa=X&ved=2ahUKEwiU6YnH2bn2AhWhBKYKHQFyCF0Q_AUoAXoECAIQAw");
            }
        });


        t005.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://photos.app.goo.gl/uvskj8fsohsQj5Ys6");
            }
        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}



