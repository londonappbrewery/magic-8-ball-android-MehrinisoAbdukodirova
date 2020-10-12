package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1. created the UI
        //2. linked the ui with Java code
        //3. created an array that contains all ball images
        //4. created the askButton and linked it
        //5. created a new object to generate a new random number and stored it in an int variable 'number'
        //6. set a listener to the button and assigned the image resource to select from the ballArray

        final ImageView ballDisplay = (ImageView)findViewById(R.id.image_eightBall);

        final int ballArray[] = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        final Button askButton = (Button)findViewById(R.id.askButton);
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(4);
                ballDisplay.setImageResource(ballArray[number]);



            }
        });

    }
}
