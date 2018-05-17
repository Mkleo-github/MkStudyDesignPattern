package com.mkleo.S15命令模式;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/17 14:24 星期四
 */
public abstract class CmdEntity<T> implements ICmd {

    protected final T mExecutor;

    public CmdEntity(T executor) {
        this.mExecutor = executor;
    }
}
