package com.mkleo.S23策略模式;

/**
 * @说明: 加法
 * @作者: Wang HengJin
 * @日期: 2018/5/18 16:35 星期五
 */
public class AdditionStrategy implements IStrategy<Integer> {

    @Override
    public Integer execStrategy(Integer... integers) {
        int sum = 0;
        for (int val : integers) {
            sum += val;
        }
        return sum;
    }
}
