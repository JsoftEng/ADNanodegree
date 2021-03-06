package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView mDetailWeatherData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mDetailWeatherData = (TextView) findViewById(R.id.tv_detail_weather_data);
        Intent fromMain = getIntent();

        if (fromMain != null) {
            if (fromMain.hasExtra(Intent.EXTRA_TEXT)) {
                mDetailWeatherData.setText(getIntent().getStringExtra(Intent.EXTRA_TEXT));
            }
        }
    }
}