package com.mkleo.S23策略模式;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/18 16:10 星期五
 */
public interface IStrategy<T> {

    T execStrategy(T... ts); //执行策略

}
