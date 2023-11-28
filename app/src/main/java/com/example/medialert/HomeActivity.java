package com.example.medialert;

import static com.example.medialert.R.layout.activity_home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class HomeActivity extends AppCompatActivity  {
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_home);
        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);
    }

    private void setSingleEvent(GridLayout mainGrid) {
        for(int i=0;i<mainGrid.getChildCount();i++){
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (finalI == 0) {

                        Intent intent = new Intent(HomeActivity.this, labtest.class);
                        startActivity(intent);


                    }
                    if (finalI == 1) {

                        Intent intent = new Intent(HomeActivity.this, health.class);
                        startActivity(intent);


                    }
                    if (finalI == 2) {

                        Intent intent = new Intent(HomeActivity.this, addmedicin.class);
                        startActivity(intent);


                    }
                    if (finalI == 3) {

                        Intent intent = new Intent(HomeActivity.this,buymedicin.class);
                        startActivity(intent);


                    }
                    if (finalI == 4) {

                        Intent intent = new Intent(HomeActivity.this, scanner.class);
                        startActivity(intent);


                    }
                    if (finalI == 5) {

                        Intent intent = new Intent(HomeActivity.this, logoutt.class);
                        startActivity(intent);


                    }
                }
            });
        }
    }
}