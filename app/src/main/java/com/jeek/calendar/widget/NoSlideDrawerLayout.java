package com.jeek.calendar.widget;

import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;


public class NoSlideDrawerLayout extends DrawerLayout {

    private boolean mCanMove;

    public NoSlideDrawerLayout(Context context) {
        super(context);
    }

    public NoSlideDrawerLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NoSlideDrawerLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        try {
            return mCanMove && super.onInterceptTouchEvent(ev);
        } catch (Exception e) {
            return false;
        }
    }

}
