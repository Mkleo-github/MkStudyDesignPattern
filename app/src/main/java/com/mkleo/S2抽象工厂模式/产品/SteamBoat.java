package com.mkleo.S2抽象工厂模式.产品;

import android.util.Log;

/**
 * @说明: 轮船
 * @作者: Wang HengJin
 * @日期: 2018/5/8 17:34 星期二
 */
public class SteamBoat implements IBoat {

    @Override
    public void obtain() {
        Log.d("Mkleo", "获得轮船");
    }
}
