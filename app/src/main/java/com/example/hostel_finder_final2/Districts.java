package com.example.hostel_finder_final2;


import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.SearchView;
import android.widget.Toast;


public class Districts extends AppCompatActivity {

    TextView t3,t4;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;
    String username;
    SearchView searchView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAGS_CHANGED,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();



        setContentView(R.layout.activity_districts);




        searchView = (SearchView) findViewById(R.id.searchView);
        t3 = (TextView) findViewById(R.id.textView2);
        t4 = (TextView) findViewById(R.id.textView3);
        b1= (Button) findViewById(R.id.button2);
        b2= (Button) findViewById(R.id.button3);
        b3= (Button) findViewById(R.id.button4);
        b4= (Button) findViewById(R.id.button5);
        b5= (Button) findViewById(R.id.button6);
        b6= (Button) findViewById(R.id.button7);
        b7= (Button) findViewById(R.id.button8);
        b8= (Button) findViewById(R.id.button9);
        b9= (Button) findViewById(R.id.button10);
        b10= (Button) findViewById(R.id.button11);
        b11= (Button) findViewById(R.id.button12);
        b12= (Button) findViewById(R.id.button13);
        b13= (Button) findViewById(R.id.button14);
        b14= (Button) findViewById(R.id.button15);
        b15= (Button) findViewById(R.id.button16);
        b16= (Button) findViewById(R.id.button17);
        b17= (Button) findViewById(R.id.button18);
        b18= (Button) findViewById(R.id.button19);





                //Creating Listener for Button
         b11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        //Intent For Navigating to third Activity
                        Intent n1 = new Intent(Districts.this,Pune_colleges.class);

                        //For Passing the Values to Second Activity

                        startActivity(n1);

                    }
         });


        b1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                //Intent For Navigating to third Activity
                                Intent n1 = new Intent(Districts.this,Colleges.class);

                                //For Passing the Values to Second Activity

                                startActivity(n1);
//
//        b19.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//
//                        //Intent For Navigating to third Activity
//                        Intent o = new Intent(Hostel_finder.this,MainActivity.class);
//
//                        //For Passing the Values to Second Activity
//
//                        startActivity(o);


//                //Getting the Intent
//                Intent k = getIntent();
//
//                //Getting the Values from First Activity using the Intent received
//                username=k.getStringExtra("username");
//
//                //Setting the Values to Intent
//                t4.setText(username);


            }
        });

    }
}


