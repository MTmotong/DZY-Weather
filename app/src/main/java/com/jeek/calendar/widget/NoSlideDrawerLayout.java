package com.jeek.calendar.widget;

import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

<<<<<<< HEAD

public class NoSlideDrawerLayout extends DrawerLayout {

    //private View vMenu;
=======
/**
 * Created by Jimmy on 2016/10/12 0012.
 */
public class NoSlideDrawerLayout extends DrawerLayout {

    private View vMenu;
>>>>>>> 6a0614a167bcc4c7a59bbd057fd13be96052bae3
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
<<<<<<< HEAD
        //vMenu = findViewWithTag("menu");
=======
        vMenu = findViewWithTag("menu");
>>>>>>> 6a0614a167bcc4c7a59bbd057fd13be96052bae3
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
<<<<<<< HEAD
//        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
//            int width = vMenu.getWidth();
//            mCanMove = ev.getX() >= width || ev.getX() < 15;
//        }
=======
        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
            int width = vMenu.getWidth();
            mCanMove = ev.getX() >= width || ev.getX() < 15;
        }
>>>>>>> 6a0614a167bcc4c7a59bbd057fd13be96052bae3
        try {
            return mCanMove && super.onInterceptTouchEvent(ev);
        } catch (Exception e) {
            return false;
        }
    }

}
