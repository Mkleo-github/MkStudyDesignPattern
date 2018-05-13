package com.mkleo.S8过滤器模式_标准模式.base;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * @说明: 条件且
 * @作者: Wang HengJin
 * @日期: 2018/5/11 15:43 星期五
 */
public abstract class AbsCriterion1<C, T> implements ICriterion<T> {


    private Class<? extends C> mCreiterionClass;

    public void setCreiterionClass(Class<? extends C> creiterionClass) {
        this.mCreiterionClass = mCreiterionClass;
    }

    //C是标准 T是对象
    @Override
    public final List<T> execCriterion(List<T> items) {

        List<T> criterionItems = new ArrayList<>();

        for (T item : items) {

            if (isInstaceOf(item)) {
                criterionItems.add(item);
            }
        }

        return criterionItems;
    }


    /**
     * 类名: AbsCriterion
     * 描述: 实测不成立
     * 码农: Wang HengJin
     * 时间: 2018/5/12 9:52
     */
    private boolean isInstaceOf(T t) {
        try {
            C c = (C) t;

            Log.d("Mkleo", "C:" + c.getClass().getSimpleName());
            Log.d("Mkleo", "T:" + t.getClass().getSimpleName());

            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
