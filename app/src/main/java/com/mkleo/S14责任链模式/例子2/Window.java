package com.mkleo.S14责任链模式.例子2;

import android.util.Log;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/17 11:26 星期四
 */
public abstract class Window {

    private Window mSuperWindow;
    private OnTouchListener mListener;

    public void setOnTouchListener(OnTouchListener listener) {
        this.mListener = listener;
    }

    public boolean dispatchTouch() {

        if (null != mSuperWindow && mSuperWindow.dispatchTouch()) {
            return true;
        }

        Log.d("Mkleo", handlerTouch());

        if (null != mListener) {
            return mListener.onTouch();
        }

        return false;
    }


    public void setSuperWindow(Window window) {
        this.mSuperWindow = window;
    }


    //处理触摸事件
    protected abstract String handlerTouch();


}
