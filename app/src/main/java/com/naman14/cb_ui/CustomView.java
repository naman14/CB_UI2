package com.naman14.cb_ui;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by naman on 1/5/17.
 */

public class CustomView extends View {

    private Paint paint;
    private int color;
    private float radius;

    public CustomView(Context context) {
        super(context);
        init();
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.CustomView);
        color = ta.getColor(R.styleable.CustomView_circleColor, Color.BLACK);
        ta.recycle();
        init();
    }

    public CustomView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(getWidth()/2, getHeight()/2, radius, paint);

//        Path  path = new Path();
//        path.moveTo(200,200);
//        path.lineTo(500, 500);
//        path.lineTo(500, 1000);
//        path.lineTo(200, 200);
//        canvas.drawPath(path, paint);
//
//        canvas.drawLine(200, 200, 500, 500, paint);
    }

    private void init() {
        paint = new Paint();
        paint.setColor(color);

        Keyframe kf0 = Keyframe.ofFloat(0f, 0f);
        Keyframe kf1 = Keyframe.ofFloat(0.5f, 200f);
        Keyframe kf2 = Keyframe.ofFloat(1f, 400f);

        PropertyValuesHolder pvh = PropertyValuesHolder.ofKeyframe("radius", kf0, kf1, kf2);
        ValueAnimator animator = ObjectAnimator.ofPropertyValuesHolder(this, pvh);
        animator.setDuration(1000);
        animator.start();

//        post(animate);

//        paint.setStyle(Paint.Style.STROKE);
//        paint.setStrokeWidth(10);

    }

    public void setRadius(float value) {
        this.radius = value;
        invalidate();
    }

//    private Runnable animate = new Runnable() {
//        @Override
//        public void run() {
//            if(radius < 500) {
//                radius += 10;
//                invalidate();
//            }
//            postDelayed(this, 10);
//        }
//    };

}
