package com.mkleo.S18中介者模式;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/17 15:56 星期四
 */
public class ChatUser {

    private final String userName;

    public ChatUser(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void sendMsg(String msg) {
        ChatRoom.showMsg(this, msg);
    }
}
