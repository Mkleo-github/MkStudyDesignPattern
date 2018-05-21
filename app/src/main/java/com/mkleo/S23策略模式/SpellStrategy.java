package com.mkleo.S23策略模式;

/**
 * @说明: 拼写策略
 * @作者: Wang HengJin
 * @日期: 2018/5/18 16:38 星期五
 */
public class SpellStrategy implements IStrategy<String> {


    @Override
    public String execStrategy(String... strings) {

        StringBuilder stringBuilder = new StringBuilder();

        for (String s : strings) {
            stringBuilder.append(s);
        }

        return stringBuilder.toString();
    }
}
