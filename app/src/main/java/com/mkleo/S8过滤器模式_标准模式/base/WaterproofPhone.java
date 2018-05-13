package com.mkleo.S8过滤器模式_标准模式.base;

/**
 * @说明: 防水手机
 * @作者: Wang HengJin
 * @日期: 2018/5/10 14:22 星期四
 */
public class WaterproofPhone extends Phone implements IWaterproof{

    public WaterproofPhone(String phoneCode, String phoneName) {
        super(phoneCode, phoneName);
    }

    
}
