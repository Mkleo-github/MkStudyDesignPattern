package com.mkleo.S5原型模式;

import java.util.Hashtable;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/9 16:40 星期三
 */
public class UserCache {

    private static Hashtable<Integer,User> mUserCache = new Hashtable<>();

    public static User getUser(int id) throws CloneNotSupportedException {
        User user = mUserCache.get(id);
        return (User) user.clone();
    }


    public static void loadUsers(){

        AdminUser adminUser = new AdminUser();
        adminUser.setId(0);
        adminUser.setName("Admin");
        mUserCache.put(adminUser.getId(),adminUser);

        NormalUser user1 = new NormalUser();
        user1.setId(1);
        user1.setName("Mkleo");
        mUserCache.put(user1.getId(),user1);

        NormalUser user2 = new NormalUser();
        user2.setId(2);
        user2.setName("Mkleo2");
        mUserCache.put(user2.getId(),user2);


    }
}
