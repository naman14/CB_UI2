package com.naman14.cb_ui;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
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
    }

    private void init() {
        paint = new Paint();
        paint.setColor(color);

        ValueAnimator anim = ValueAnimator.ofFloat(0f, 400f);
        anim.setDuration(200);
        anim.start();


    }

}
