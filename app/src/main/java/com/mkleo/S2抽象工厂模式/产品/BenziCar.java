package com.mkleo.S2抽象工厂模式.产品;

import android.util.Log;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/8 17:13 星期二
 */
public class BenziCar implements ICar {

    @Override
    public void obtain() {
        Log.d("Mkleo", "获得奔驰汽车");
    }
}
