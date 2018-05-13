package com.mkleo.S8过滤器模式_标准模式.base;

/**
 * @说明: 手机
 * @作者: Wang HengJin
 * @日期: 2018/5/10 14:15 星期四
 */
public class Phone {

    private final String phoneCode;       //手机代号
    private final String phoneName;       //手机名称


    public Phone(String phoneCode, String phoneName) {
        this.phoneCode = phoneCode;
        this.phoneName = phoneName;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public String getPhoneName() {
        return phoneName;
    }
}
