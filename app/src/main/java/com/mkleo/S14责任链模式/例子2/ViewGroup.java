package com.mkleo.S14责任链模式.例子2;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/17 11:54 星期四
 */
public class ViewGroup extends Window {
    @Override
    protected String handlerTouch() {
        return "ViewGroup处理了该事件";
    }
}
