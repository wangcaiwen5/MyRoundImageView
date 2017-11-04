


package com.example.mytest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.myroundimageview.RoundImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RoundImageView roundImageView = findViewById(R.id.riv_img);
        roundImageView.setBorderColor(Color.RED);
        roundImageView.setCircle(true);
        roundImageView.setBorderWidth(20);

    }
}
