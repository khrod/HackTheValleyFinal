package com.example.fabulousunicorns.decisionbro;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import static com.google.android.gms.analytics.internal.zzy.v;

public class OtherCats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_cats);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton books = (ImageButton) findViewById(R.id.books);
        ImageButton movies = (ImageButton) findViewById(R.id.movies);
        ImageButton sports = (ImageButton) findViewById(R.id.sports);
        ImageButton gifts = (ImageButton) findViewById(R.id.gifts);
        ImageButton vacation = (ImageButton) findViewById(R.id.gifts);

        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(OtherCats.this, SideActivity.class));
            }
        });
        movies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(OtherCats.this, SideActivity.class));
            }
        });
        gifts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(OtherCats.this, SideActivity.class));
            }
        });
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(OtherCats.this, SideActivity.class));
            }
        });
        vacation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(OtherCats.this, SideActivity.class));
            }
        });

    }



    //@Override
  //  protected void onNewIntent(Intent intent) {
  //      super.onNewIntent(intent);
  //  }


}
