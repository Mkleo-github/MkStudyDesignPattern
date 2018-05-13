package com.mkleo.S7桥接模式;

import android.util.Log;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/10 11:32 星期四
 */
public class Canvas implements ICanvas {

    @Override
    public void drawRect() {
        Log.d("Mkleo","绘制长方形");
    }

    @Override
    public void drawLine() {
        Log.d("Mkleo","绘制直线");
    }

    @Override
    public void drawCircle() {
        Log.d("Mkleo","绘制圆形");
    }
}
