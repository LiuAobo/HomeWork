package com.example.myapplication;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private TextView tv_marquee;
    private boolean isPaused = false;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_marquee = tv_marquee.findViewById(R.id.tv_marquee);
        tv_marquee.setOnClickListener((View.OnClickListener) this);
        tv_marquee.requestFocus();
    }

    public void onClick(View v) {
        if (v.getId() == R.id.tv_marquee) {
            isPaused = !isPaused;
            if (isPaused) {
                tv_marquee.setFocusable(false);
                tv_marquee.setFocusableInTouchMode(false);
            } else {
                tv_marquee.setFocusable(true);
                tv_marquee.setFocusableInTouchMode(true);
                tv_marquee.requestFocus();
            }
        }
    }

}