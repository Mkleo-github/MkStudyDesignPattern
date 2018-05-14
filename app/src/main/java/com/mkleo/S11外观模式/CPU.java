package com.mkleo.S11外观模式;

import android.util.Log;

/**
 * @说明: 中央处理器
 * @作者: Wang HengJin
 * @日期: 2018/5/14 15:13 星期一
 */
public class CPU implements IElement{

    @Override
    public void open() {
        Log.d("Mkleo","CPU启动");
    }

    @Override
    public void close() {
        Log.d("Mkleo","CPU关闭");
    }
}
