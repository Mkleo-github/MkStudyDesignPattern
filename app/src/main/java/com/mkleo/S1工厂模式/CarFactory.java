package com.mkleo.S1工厂模式;

import com.mkleo.S1工厂模式.产品.ChanganCar;
import com.mkleo.S1工厂模式.产品.HongqiCar;
import com.mkleo.S1工厂模式.产品.IProduct;
import com.mkleo.S1工厂模式.产品.ZhongtaiCar;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/8 17:10 星期二
 */
public class CarFactory {


    public IProduct produceCar(Class<? extends IProduct> c) {

        if (c == ChanganCar.class) {

            return new ChanganCar();

        } else if (c == HongqiCar.class) {

            return new HongqiCar();

        } else if (c == ZhongtaiCar.class) {

            return new ZhongtaiCar();
        }

        return null;
    }
}
