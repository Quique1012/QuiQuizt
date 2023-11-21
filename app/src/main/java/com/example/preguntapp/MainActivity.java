package com.example.preguntapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // add listener to play card
        CardView play = findViewById(R.id.cardView);
        play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            Intent playIntent = new Intent(MainActivity.this,Jugar.class);

            startActivity(playIntent);

            }

        });
        // add listener to play card
        CardView ayuda = findViewById(R.id.cardViewAyuda);
        play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent playIntent = new Intent(MainActivity.this,Ayuda.class);

                startActivity(playIntent);

            }

        });
    }
}