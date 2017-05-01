package com.naman14.cb_ui;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ObjectAnimator animator = ObjectAnimator.ofFloat(findViewById(R.id.text1), "translationX", 0f, 700f);
        animator.setDuration(500);
        animator.start();
    }
}
