package com.mkleo.S25访问者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/21 9:18 星期一
 */
public class MyComputer {

    private List<ComputerPeripherals> mComputerPeripherals = new ArrayList<>();

    //添加外设
    public void addPeripherals(ComputerPeripherals... computerPeripherals) {

        for (ComputerPeripherals peripherals : computerPeripherals) {
            if (!mComputerPeripherals.contains(peripherals)) {
                mComputerPeripherals.add(peripherals);
            }
        }

    }

    //开机
    public void open() {
        for (ComputerPeripherals peripherals : mComputerPeripherals) {
            peripherals.load();
        }
    }

}
