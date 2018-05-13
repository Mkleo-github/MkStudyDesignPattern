package com.mkleo.S8过滤器模式_标准模式.base;

import java.util.List;

/**
 * @说明: 标准
 * @作者: Wang HengJin
 * @日期: 2018/5/11 15:30 星期五
 */
interface ICriterion<T> {

    List<T> execCriterion(List<T> items);

}
