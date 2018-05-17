package com.mkleo.S19备忘录模式;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/17 16:15 星期四
 */
public class Data {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memory saveStateToMemory() {
        return new Memory(state);
    }

    public void getStateByMemory(Memory memory) {
        this.state = memory.getState();
    }

}
