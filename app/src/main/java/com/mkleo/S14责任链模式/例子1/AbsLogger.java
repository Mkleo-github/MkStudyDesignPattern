package com.mkleo.S14责任链模式.例子1;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/17 10:41 星期四
 */
public abstract class AbsLogger {

    private AbsLogger mNextLogger;

    abstract LoggerLevel setLoggerLevel();

    abstract void print(String msg);

    public void logger(LoggerLevel loggerLevel, String msg) {
        if (loggerLevel == setLoggerLevel()) {
            this.print(msg);
        } else {
            if (null != mNextLogger)
                mNextLogger.logger(loggerLevel, msg);
        }
    }

    public AbsLogger setNextLogger(AbsLogger logger) {
        this.mNextLogger = logger;
        return this;
    }

}
