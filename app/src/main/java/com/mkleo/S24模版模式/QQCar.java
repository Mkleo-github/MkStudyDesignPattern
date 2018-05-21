package com.mkleo.S24模版模式;

import android.util.Log;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/21 9:06 星期一
 */
public class QQCar extends Car{


    @Override
    void openFire() {
        Log.d("Mkleo","汽车点火");
    }

    @Override
    void openEngine() {
        Log.d("Mkleo","启动发动机");
    }

    @Override
    void openMotor() {
        Log.d("Mkleo","启动电机");
    }
}
