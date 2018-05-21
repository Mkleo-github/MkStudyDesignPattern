package com.mkleo.S25访问者模式;

import android.util.Log;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/21 9:33 星期一
 */
public class Keyboard implements ComputerPeripherals {
    @Override
    public void load() {
        Log.d("Mkleo","加载外置键盘");
    }
}
