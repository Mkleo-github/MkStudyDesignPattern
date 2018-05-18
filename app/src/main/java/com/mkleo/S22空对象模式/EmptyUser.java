package com.mkleo.S22空对象模式;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/18 9:51 星期五
 */
public class EmptyUser  {

    public static User getUser(){
        return new User("this empty user");
    }


}
