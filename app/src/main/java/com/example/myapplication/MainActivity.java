package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int value = 0;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.resultTV);
    }

    public void onOperatorClick(View view) {
        if (view.getId() == R.id.plusButton) {
            value += 1;
        } else if (view.getId() == R.id.minusButton) {
            value -= 1;
        }
        result.setText(String.valueOf(value));
    }
}
