package com.test;

import android.view.View;
import com.viewlistener.ViewGroupListener;
import com.viewlistener.ViewListener;
/**
 * Created by kangaroo on 2017-2-21.
 *
 */

public class TestInterface extends TestAbstractClass implements ViewListener,ViewGroupListener,ViewListener.ClickListener {


    TestAbstractClass testAbstractClass;

    @Override
    public int onClickListener(View v, int position) {

        if (ClickListener.a == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public View onClickListener(View v) {
        return null;
    }

    @Override
    public void onLongListener(View v) {

        testAbstractClass = new TestInterface();
        testAbstractClass.getString();

    }
    @Override
    public View getViewListener(View v) {
        return null;
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void getView(View v) {

    }

    @Override
    public void setViewListener(View v) {

    }

    @Override
    public void getLongViewListener(View v, int position) {

    }


    @Override
    protected int getIntValue() {
        return 0;
    }
}


