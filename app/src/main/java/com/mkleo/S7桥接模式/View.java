package com.mkleo.S7桥接模式;

import android.util.Log;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/10 10:48 星期四
 */
public abstract class View implements IView {

    private Canvas mCanvas;

    public View() {

    }

    private void drawSub() {
        mCanvas = new Canvas();
        this.onDraw(mCanvas);
    }

    protected abstract void onDraw(Canvas canvas);

    @Override
    public void display() {
        this.drawSub();
        Log.d("Mkleo", "展示View");
    }
}
