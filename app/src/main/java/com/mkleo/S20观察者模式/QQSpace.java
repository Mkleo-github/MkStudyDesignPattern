package com.mkleo.S20观察者模式;

import java.util.Vector;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/17 17:28 星期四
 */
public class QQSpace {

    private Vector<IQQUser> mQQUsers = new Vector<>();

    public void subscribe(IQQUser qqUser) {
        if (!mQQUsers.contains(qqUser)) {
            mQQUsers.add(qqUser);
        }
    }


    public void unSubscribe(IQQUser qqUser) {
        if (mQQUsers.contains(qqUser)) {
            mQQUsers.remove(qqUser);
        }
    }


    public void updateSpace() {
        for (IQQUser qqUser : mQQUsers) {
            qqUser.onSpaceUpdate();
        }
    }
}
