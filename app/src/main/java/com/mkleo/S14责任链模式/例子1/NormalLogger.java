package com.mkleo.S14责任链模式.例子1;

import android.util.Log;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/17 10:50 星期四
 */
public class NormalLogger extends AbsLogger{

    @Override
    protected LoggerLevel setLoggerLevel() {
        return LoggerLevel.NORMAL;
    }

    @Override
    protected void print(String msg) {
        Log.d("Mkleo", "Normal:" + msg);
    }
}
