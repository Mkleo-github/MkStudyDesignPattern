package com.mkleo.S3单例模式;

/**
 * @说明: 单例模式
 * @作者: Wang HengJin
 * @日期: 2018/5/7 9:50 星期一
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getSingleton() {
        return Provider.SINGLETON;
    }

    static final class Provider {

        static final Singleton SINGLETON = new Singleton();

    }


}
