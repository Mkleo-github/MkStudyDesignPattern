package com.mkleo.S8过滤器模式_标准模式.base;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * @说明: 条件且
 * @作者: Wang HengJin
 * @日期: 2018/5/11 15:43 星期五
 */
public abstract class AbsCriterion<T> implements ICriterion<T> {

    private final Class mCriterion;

    protected AbsCriterion(Class criterion) {
        this.mCriterion = criterion;
    }


    //C是标准 O是对象
    @Override
    public final List<T> execCriterion(List<T> items) {

        List<T> criterionItems = new ArrayList<>();

        for (T item : items) {
            if (item != null) {
                if (isInstaceOf(item)) {
                    criterionItems.add(item);
                }
            }
        }

        return criterionItems;
    }


    private boolean isInstaceOf(Object o) {
        try {
            //通过反射获取对象实例
            T t = (T) Class.forName(mCriterion.getName());

            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
