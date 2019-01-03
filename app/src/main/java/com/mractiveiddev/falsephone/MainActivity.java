package com.mractiveiddev.falsephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView tvmassage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvmassage = findViewById(R.id.tvMassage);

        if (getIntent().getData() != null)
        {
            tvmassage.setText(getIntent().getData().toString());
        }
        else
        {
            tvmassage.setText("No data recieved");
        }
    }
}
