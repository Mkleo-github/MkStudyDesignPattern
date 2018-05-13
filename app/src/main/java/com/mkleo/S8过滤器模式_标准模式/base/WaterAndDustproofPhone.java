package com.mkleo.S8过滤器模式_标准模式.base;

/**
 * @说明: 防水防尘手机
 * @作者: Wang HengJin
 * @日期: 2018/5/11 15:26 星期五
 */
public class WaterAndDustproofPhone extends Phone implements IWaterproof, IDustproof {

    public WaterAndDustproofPhone(String phoneCode, String phoneName) {
        super(phoneCode, phoneName);
    }

}
