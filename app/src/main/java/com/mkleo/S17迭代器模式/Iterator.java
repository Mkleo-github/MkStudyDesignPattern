package com.mkleo.S17迭代器模式;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/17 15:21 星期四
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();
}
