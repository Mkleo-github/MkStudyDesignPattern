package com.mkleo.S11外观模式;

import android.util.Log;

/**
 * @说明: 硬盘
 * @作者: Wang HengJin
 * @日期: 2018/5/14 15:13 星期一
 */
public class Hard implements IElement{

    @Override
    public void open() {
        Log.d("Mkleo","硬盘启动");
    }

    @Override
    public void close() {
        Log.d("Mkleo","硬盘关闭");
    }
}
