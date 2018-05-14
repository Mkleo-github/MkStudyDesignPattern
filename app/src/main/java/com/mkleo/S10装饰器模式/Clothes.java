package com.mkleo.S10装饰器模式;

import android.util.Log;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/14 14:28 星期一
 */
public class Clothes implements ICloth {

    @Override
    public void clip() {
        Log.d("Mkleo","裁剪出衣服");
    }
}
