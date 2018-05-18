package com.mkleo.S21状态模式;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/18 9:32 星期五
 */
public class Player {

    private IState<Player> state;

    public Player() {
        state = null;
    }

    public void setState(IState<Player> state) {
        this.state = state;
    }

    public IState<Player> getState() {
        return state;
    }
}
