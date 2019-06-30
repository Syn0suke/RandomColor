package com.example.randomcolor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final Random rand = new Random();
    public View root;
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        root = findViewById(R.id.root);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int red = rand.nextInt(255);
                int green = rand.nextInt(255);
                int blue = rand.nextInt(255);

                int color = Color.rgb(red,green,blue);
                root.setBackgroundColor(color);
            }
        });
    }
}
