package com.mkleo.S13代理模式;

/**
 * @说明: 代理图片
 * @作者: Wang HengJin
 * @日期: 2018/5/16 15:16 星期三
 */
public class ProxyPicture implements IPicture {

    private Picture picture;
    private final String fileName;

    public ProxyPicture(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (null == picture)
            picture = new Picture(fileName);
        picture.display();
    }


}
