package com.mkleo.S2抽象工厂模式;

import com.mkleo.S2抽象工厂模式.产品.BMWCar;
import com.mkleo.S2抽象工厂模式.产品.BenziCar;
import com.mkleo.S2抽象工厂模式.产品.IBoat;
import com.mkleo.S2抽象工厂模式.产品.ICar;
import com.mkleo.S2抽象工厂模式.产品.PleasureBoat;
import com.mkleo.S2抽象工厂模式.产品.SteamBoat;
import com.mkleo.S2抽象工厂模式.产品.AudiCar;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/8 17:44 星期二
 */
public class TransporterFactory implements ITransporterFactory {


    @Override
    public ICar produceCar(Class<? extends ICar> c) {

        if (c == BMWCar.class) {

            return new BMWCar();

        } else if (c == BenziCar.class) {

            return new BenziCar();

        } else if (c == AudiCar.class) {

            return new AudiCar();
        }

        return null;
    }

    @Override
    public IBoat produceBoat(Class<? extends IBoat> c) {

        if (c == PleasureBoat.class) {

            return new PleasureBoat();

        } else if (c == SteamBoat.class) {

            return new SteamBoat();

        }

        return null;
    }
}
