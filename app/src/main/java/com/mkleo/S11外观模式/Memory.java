package com.mkleo.S11外观模式;

import android.util.Log;

/**
 * @说明: 内存
 * @作者: Wang HengJin
 * @日期: 2018/5/14 15:14 星期一
 */
public class Memory implements IElement{

    @Override
    public void open() {
        Log.d("Mkleo","内存启动");
    }

    @Override
    public void close() {
        Log.d("Mkleo","内存关闭");
    }
}
