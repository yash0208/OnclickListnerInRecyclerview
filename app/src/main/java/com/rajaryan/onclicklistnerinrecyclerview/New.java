package com.rajaryan.onclicklistnerinrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class New extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        TextView textView = findViewById(R.id.textView);
        String movieName = getIntent().getStringExtra("MOVIE_NAME");
        textView.setText(movieName);
    }
}
