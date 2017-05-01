package com.naman14.cb_ui;

import android.animation.ObjectAnimator;
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
        canvas.drawCircle(200, 200, 100, paint);

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
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setStrokeWidth(10);

    }

}
