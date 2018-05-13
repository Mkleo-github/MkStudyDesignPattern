package com.mkleo.S5原型模式;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/9 15:29 星期三
 */
public class User implements Cloneable {

    protected int type;
    private int id;
    private int age;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
