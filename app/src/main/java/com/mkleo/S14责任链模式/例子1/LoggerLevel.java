package com.mkleo.S14责任链模式.例子1;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/17 10:42 星期四
 */
public enum LoggerLevel {

    ERROR(-1),
    NORMAL(1),
    MAIN(2);

    final int level;

    LoggerLevel(int level) {
        this.level = level;
    }


}
