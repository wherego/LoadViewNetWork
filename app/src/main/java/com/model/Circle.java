package com.model;

import android.graphics.Canvas;

import java.io.Serializable;
import java.util.RandomAccess;

/**
 * Created by kangaroo on 2017-2-22.
 */
public class Circle<T> extends Shape implements Cloneable ,Serializable,RandomAccess,Comparable<T> {

    @Override
    void draw(Canvas c) {
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
