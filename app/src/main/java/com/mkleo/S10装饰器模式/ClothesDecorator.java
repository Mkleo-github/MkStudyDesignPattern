package com.mkleo.S10装饰器模式;


import android.util.Log;

/**
 * @说明: 布
 * @作者: Wang HengJin
 * @日期: 2018/5/14 11:29 星期一
 */
public class ClothesDecorator extends Decorator<ICloth> implements ICloth {

    private final String clothName;

    public ClothesDecorator(ICloth iCloth, String clothName) {
        super(iCloth);
        this.clothName = clothName;
    }


    @Override
    public void clip() {
        //顺序控制先后
        if (mDecirator != null)
            mDecirator.clip();
        Log.d("Mkleo", "裁剪出:" + clothName);
    }
}
