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





public class Pune_colleges extends AppCompatActivity {

    TextView t9;
    Button  b20, b21, b22,b23, b24, b25, b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAGS_CHANGED,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();


        setContentView(R.layout.activity_pune_colleges);


//        searchView = (SearchView) findViewById(R.id.searchView2);
        t9 = (TextView) findViewById(R.id.textView9);
        b20 = (Button) findViewById(R.id.button20);
        b21 = (Button) findViewById(R.id.button21);
        b22 = (Button) findViewById(R.id.button22);
        b23 = (Button) findViewById(R.id.button23);
        b24 = (Button) findViewById(R.id.button24);
        b25 = (Button) findViewById(R.id.button25);
        b26 = (Button) findViewById(R.id.button26);
        b27 = (Button) findViewById(R.id.button27);
        b28 = (Button) findViewById(R.id.button28);
        b29 = (Button) findViewById(R.id.button29);
        b30 = (Button) findViewById(R.id.button30);
        b31 = (Button) findViewById(R.id.button31);
        b32 = (Button) findViewById(R.id.button32);
        b33 = (Button) findViewById(R.id.button33);
        b34 = (Button) findViewById(R.id.button34);
        b35 = (Button) findViewById(R.id.button35);
        b36 = (Button) findViewById(R.id.button36);

        //Creating Listener for Button
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent For Navigating to third Activity
                Intent q = new Intent(Pune_colleges.this, VIT_hostels.class);

                //For Passing the Values to Second Activity

                startActivity(q);

            }
        });



    }
}
