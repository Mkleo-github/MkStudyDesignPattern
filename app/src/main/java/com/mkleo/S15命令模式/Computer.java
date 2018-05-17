package com.mkleo.S15命令模式;

import android.util.Log;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/17 14:34 星期四
 */
public class Computer implements IComputer {

    @Override
    public void open() {
        Log.d("Mkleo","开启电脑");
    }

    @Override
    public void close() {
        Log.d("Mkleo","关闭电脑");
    }

    @Override
    public void sleep() {
        Log.d("Mkleo","休眠电脑");
    }
}
