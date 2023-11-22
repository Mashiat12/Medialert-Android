package com.example.medialert;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.io.File;

public class SplashScreen extends AppCompatActivity {

    ImageView splashLogo;
    TextView Slogan;
    Animation topAnim,bottomAnim;


    private FirebaseAuth mAuth ;



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

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                    Log.d("myTag", "This is from splash screen");


                FirebaseUser currentUser = mAuth.getCurrentUser();
                if(currentUser != null){
                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }else {
                    Intent intent = new Intent(SplashScreen.this, SignIn.class);
                    startActivity(intent);
                    finish();//finishing it because splash screen should be shown only once
                }
            }
        }, 1500);//for timer
    }
    }
