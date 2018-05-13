package com.mkleo.S6适配器模式;

import android.util.Log;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/10 9:28 星期四
 */
public class VideoPlayer implements IMediaPlayer {

    @Override
    public void play(String path) {
        Log.d("Mkleo","VideoPlayer");
    }

    @Override
    public void stop() {

    }
}
