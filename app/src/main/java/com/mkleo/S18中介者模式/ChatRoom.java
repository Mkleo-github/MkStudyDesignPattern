package com.mkleo.S18中介者模式;

import android.util.Log;

/**
 * @说明: 中介(相当于串联)
 * @作者: Wang HengJin
 * @日期: 2018/5/17 15:55 星期四
 */
public class ChatRoom {


    public static void showMsg(ChatUser user, String msg) {
        Log.d("Mkleo", user.getUserName() + ":" + msg);
    }

}
