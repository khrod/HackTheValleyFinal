package com.example.fabulousunicorns.decisionbro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button button;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Assign a listener to your button
        //  imageeButton.setOnClickListener(new View.OnClickListener() {
        //   @Override

        button = (Button) findViewById(R.id.button);
        txt = (TextView) findViewById(R.id.txt);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, SideActivity.class));
               // txt.setText("hi");
               // Intent intent = new Intent(MainActivity.this, Loginn.class);
               // startActivity(intent);
            }



            //   Button button = (Button) v;
            // ((Button) v).setText("clicked");
            //Start your second activity
            //Intent intent = new Intent(MainActivity.this, Loginn.class);
            //startActivity(intent);
        });
        // });


    }
}

