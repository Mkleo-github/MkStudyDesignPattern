package com.mkleo.S13代理模式;

import android.util.Log;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/16 15:14 星期三
 */
public class Picture implements IPicture {

    private final String fileName;

    public Picture(String fileName) {
        this.fileName = fileName;
        this.loadPicture();
    }

    @Override
    public void display() {
        Log.d("Mkleo", "显示图片:" + fileName);
    }

    private void loadPicture() {
        Log.d("Mkleo", "加载图片:" + fileName);
    }
}
