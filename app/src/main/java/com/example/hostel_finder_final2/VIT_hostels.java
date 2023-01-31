package com.example.hostel_finder_final2;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;





public class VIT_hostels extends AppCompatActivity {

    TextView t01;
    Button  b100, b101, b102,b103, b104, b105, b106, b107, b108, b109, b110, b111, b112, b113, b114, b115, b116;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAGS_CHANGED,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();


        setContentView(R.layout.activity_vit_hostels);



//        searchView = (SearchView) findViewById(R.id.searchView2);
        t01 = (TextView) findViewById(R.id.textView01);
        b100 = (Button) findViewById(R.id.bt1);
        b101 = (Button) findViewById(R.id.bt2);
        b102 = (Button) findViewById(R.id.bt3);
        b103 = (Button) findViewById(R.id.bt4);
        b104 = (Button) findViewById(R.id.bt5);
        b105 = (Button) findViewById(R.id.bt6);
        b106 = (Button) findViewById(R.id.bt7);
        b107 = (Button) findViewById(R.id.bt8);
        b108 = (Button) findViewById(R.id.bt9);
        b109 = (Button) findViewById(R.id.bt10);
        b110 = (Button) findViewById(R.id.bt11);
        b111 = (Button) findViewById(R.id.bt12);
        b112 = (Button) findViewById(R.id.bt13);
        b113 = (Button) findViewById(R.id.bt14);
        b114 = (Button) findViewById(R.id.bt15);
        b115 = (Button) findViewById(R.id.bt16);
        b116 = (Button) findViewById(R.id.bt17);

        //Creating Listener for Button
        b100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent For Navigating to third Activity
                Intent pp = new Intent(VIT_hostels.this, VIT_A.class);

                //For Passing the Values to Second Activity

                startActivity(pp);

            }
        });

        b101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent For Navigating to third Activity
                Intent pp = new Intent(VIT_hostels.this, VIT_I.class);

                //For Passing the Values to Second Activity

                startActivity(pp);

            }
        });

        b102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent For Navigating to third Activity
                Intent pp = new Intent(VIT_hostels.this, VIT_D.class);

                //For Passing the Values to Second Activity

                startActivity(pp);

            }
        });

        b103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent For Navigating to third Activity
                Intent pp = new Intent(VIT_hostels.this, VIT_K.class);

                //For Passing the Values to Second Activity

                startActivity(pp);

            }
        });

        b104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent For Navigating to third Activity
                Intent pp = new Intent(VIT_hostels.this, VIT_M.class);

                //For Passing the Values to Second Activity

                startActivity(pp);

            }
        });

        b105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent For Navigating to third Activity
                Intent pp = new Intent(VIT_hostels.this, balaji.class);

                //For Passing the Values to Second Activity

                startActivity(pp);

            }
        });

        b106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent For Navigating to third Activity
                Intent pp = new Intent(VIT_hostels.this, madhura.class);

                //For Passing the Values to Second Activity

                startActivity(pp);

            }
        });

        b107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent For Navigating to third Activity
                Intent pp = new Intent(VIT_hostels.this, girlhostel.class);

                //For Passing the Values to Second Activity

                startActivity(pp);

            }
        });

        b108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent For Navigating to third Activity
                Intent pp = new Intent(VIT_hostels.this, sumadhu.class);

                //For Passing the Values to Second Activity

                startActivity(pp);

            }
        });

        b109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent For Navigating to third Activity
                Intent pp = new Intent(VIT_hostels.this, purandar.class);

                //For Passing the Values to Second Activity

                startActivity(pp);

            }
        });

        b110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent For Navigating to third Activity
                Intent pp = new Intent(VIT_hostels.this, hariom.class);

                //For Passing the Values to Second Activity

                startActivity(pp);

            }
        });






    }
}
