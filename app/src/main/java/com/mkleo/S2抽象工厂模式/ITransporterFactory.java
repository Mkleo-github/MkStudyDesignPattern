package com.mkleo.S2抽象工厂模式;

import com.mkleo.S2抽象工厂模式.产品.IBoat;
import com.mkleo.S2抽象工厂模式.产品.ICar;

/**
 * @说明: 抽象运输器工厂
 * @作者: Wang HengJin
 * @日期: 2018/5/8 17:42 星期二
 */
public interface ITransporterFactory {

    ICar produceCar(Class<? extends ICar> c);

    IBoat produceBoat(Class<? extends IBoat> c);
}
