package com.example.medialert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;

public class SplashScreen extends AppCompatActivity {

    ImageView splashLogo;
    TextView Slogan;


    Animation topAnim,bottomAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //hooks
        splashLogo = findViewById(R.id.splash_logo);
        Slogan =findViewById(R.id.slogan);


        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_anim);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_anim);
        //set animation
        splashLogo.setAnimation(topAnim);
        Slogan.setAnimation(bottomAnim);

        Intent i = new Intent(SplashScreen.this, MainActivity.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                 startActivity(i);
                finish(); } },4000);
    }
    }
