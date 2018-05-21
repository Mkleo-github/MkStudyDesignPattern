package com.mkleo.S24模版模式;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/18 17:12 星期五
 */
public abstract class Car {

    abstract void openFire();   //打火

    abstract void openEngine(); //开启发动机

    abstract void openMotor();  //开启电机


    public final void drive() {
        this.openFire();
        this.openEngine();
        this.openMotor();
    }

}
