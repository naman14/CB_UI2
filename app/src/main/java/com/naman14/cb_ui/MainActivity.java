package com.naman14.cb_ui;

import android.animation.ObjectAnimator;
import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ObjectAnimator animator = ObjectAnimator.ofFloat(findViewById(R.id.text1), "translationX", 0f, 700f);
        animator.setDuration(1000);
        animator.start();


//        Path path = new Path();
//        path.moveTo(200,200);
//        path.lineTo(500, 500);
//        path.lineTo(500, 1000);
//        path.lineTo(200, 200);
//
//        ObjectAnimator animator2 = ObjectAnimator.ofFloat(findViewById(R.id.text1), "x","y",path);
//        animator.setDuration(1000);
//        animator.start();
    }

    public void navigate(View view) {
        Intent intent= new Intent(this, SecondActivity.class);

        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this,
                Pair.create(findViewById(R.id.image1), "transition_image"),
                Pair.create(findViewById(R.id.fab), "transition_fab"));

        startActivity(intent, options.toBundle());
    }
}
