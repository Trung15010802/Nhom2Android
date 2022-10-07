package com.example.transition;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.transition.Transition;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView) findViewById(R.id.image);
        TransitionDrawable transitionDrawable = (TransitionDrawable) img.getDrawable();
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transitionDrawable.reverseTransition(2000);
            }
        });
    }
}