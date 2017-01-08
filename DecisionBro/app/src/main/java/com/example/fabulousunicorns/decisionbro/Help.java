package com.example.fabulousunicorns.decisionbro;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        Button submit = (Button) findViewById(R.id.submit);
        Button faq = (Button) findViewById(R.id.faq);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Context context = getApplicationContext();
                CharSequence text = "Thank you for your submission!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        faq.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v){
                    startActivity(new Intent(Help.this, FAQActivity.class));
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



    }
}
