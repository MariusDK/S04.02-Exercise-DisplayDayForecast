package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // TODO (2) Display the weather forecast that was passed from MainActivity
        textView = (TextView)findViewById(R.id.data_weather);
        Intent intent = getIntent();
        if (intent.hasExtra(Intent.EXTRA_TEXT))
        {
            String text = intent.getStringExtra(Intent.EXTRA_TEXT);
            textView.setText(text);
        }
    }
}