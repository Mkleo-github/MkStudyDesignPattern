package com.mkleo.S14责任链模式.例子1;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/17 11:19 星期四
 */
public class Logger {

    public static void logger(LoggerLevel level, String msg) {
        new NormalLogger().setNextLogger(new MainLogger().setNextLogger(new ErrorLogger())).logger(level, msg);
    }

}
