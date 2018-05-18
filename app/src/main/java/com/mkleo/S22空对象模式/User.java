package com.mkleo.S22空对象模式;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/18 9:50 星期五
 */
public class User {

    private final String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
