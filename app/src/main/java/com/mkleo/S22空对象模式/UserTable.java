package com.mkleo.S22空对象模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/18 11:37 星期五
 */
public class UserTable {

    private static final String[] userNames = {"Jimi", "John", "Lemon", "daddy"};

    private static List<User> mUsers = new ArrayList<>();

    static {
        for (int i = 0; i < userNames.length; i++) {
            mUsers.add(new User(userNames[i]));
        }
    }


    public static User getUser(String userName) {
        for (User user : mUsers) {
            if (user.getUserName().equals(userName)) {
                return user;
            }
        }
        return EmptyUser.getUser();
    }


}
