package com.example.drawableclip;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView) findViewById(R.id.image);
        btn = (Button) findViewById(R.id.btnclip);

        img.setImageLevel(1000);

        ClipDrawable clipDrawable = (ClipDrawable) img.getDrawable();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageLevel(clipDrawable.getLevel()+1000);
            }
        });
    }
}