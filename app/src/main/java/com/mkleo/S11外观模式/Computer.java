package com.mkleo.S11外观模式;

import android.util.Log;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/14 15:13 星期一
 */
public class Computer {

    private Hard hard = new Hard();
    private CPU cpu = new CPU();
    private Memory memory = new Memory();

    public void open(){
        Log.d("Mkleo","打开电脑");
        hard.open();
        memory.open();
        cpu.open();
    }

    public void close(){
        Log.d("Mkleo","关闭电脑");
        cpu.close();
        memory.close();
        hard.close();
    }

}
