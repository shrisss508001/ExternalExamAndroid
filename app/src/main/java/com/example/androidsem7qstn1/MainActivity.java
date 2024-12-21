package com.example.androidsem7qstn1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private view box;
    public ImageView arrowUp,arrowDown,arrowLeft,arrowRight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         arrowUp = findViewById(R.id.up);
         arrowDown = findViewById(R.id.Down);
         arrowLeft = findViewById(R.id.Left);
         arrowRight = findViewById(R.id.Right);

        arrowUp.setOnClickListener(v -> animateBox("up"));
        arrowDown.setOnClickListener(v -> animateBox("down"));
        arrowLeft.setOnClickListener(v -> animateBox("left"));
        arrowRight.setOnClickListener(v -> animateBox("right"));
    }

    private void animateBox(String direction) {
        animateBox(arrowDown.getTransitionName());

        TranslateAnimation animation;
        switch (direction) {
            case "up":
                animation = new TranslateAnimation(0, 0, 0, -200);
                break;
            case "down":
                animation = new TranslateAnimation(0, 0, 0, 200);
                break;
            case "left":
                animation = new TranslateAnimation(0, -200, 0, 0);
                break;
            case "right":
                animation = new TranslateAnimation(0, 200, 0, 0);
                break;
        }
        animation.setDuration(500);
        animation.setFillAfter(true);
        box.startAnimation(animation);
    }
}

















