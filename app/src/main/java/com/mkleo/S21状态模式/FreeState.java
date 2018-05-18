package com.mkleo.S21状态模式;

import android.util.Log;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/18 9:36 星期五
 */
public class FreeState implements IState<Player> {

    @Override
    public void action(Player context) {

        Log.d("Mkleo", "玩家进入空闲状态");

        context.setState(this);

    }
}
