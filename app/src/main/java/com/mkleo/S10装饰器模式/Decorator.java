package com.mkleo.S10装饰器模式;

/**
 * @说明: 装饰器
 * @作者: Wang HengJin
 * @日期: 2018/5/14 10:18 星期一
 */
public abstract class Decorator<T> {

    protected T mDecirator;

    public Decorator(T t){
        this.mDecirator = t;
    }

}
