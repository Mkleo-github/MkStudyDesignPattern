package com.mkleo.S12享元模式;

/**
 * @说明: 位图实例
 * @作者: Wang HengJin
 * @日期: 2018/5/15 9:32 星期二
 */
public class Bitmap {

    private final String name;

    protected Bitmap(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bitmap:" + name;
    }
}
