package com.mkleo.S6适配器模式;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/10 9:38 星期四
 */
public class MediaAdapter implements IMediaPlayer {

    private AudioPlayer mAudioPlayer;
    private VideoPlayer mVideoPlayer;

    private final Class<? extends IMediaPlayer> type;

    public MediaAdapter(Class type) {
        this.type = type;
    }

    @Override
    public void play(String path) {

        if (type == AudioPlayer.class) {
            mAudioPlayer = new AudioPlayer();
            mAudioPlayer.play(path);
        } else if (type == VideoPlayer.class) {
            mVideoPlayer = new VideoPlayer();
            mVideoPlayer.play(path);
        }

    }

    @Override
    public void stop() {

        if (type == AudioPlayer.class) {
            mAudioPlayer = new AudioPlayer();
            mAudioPlayer.stop();
        } else if (type == VideoPlayer.class) {
            mVideoPlayer = new VideoPlayer();
            mVideoPlayer.stop();
        }
    }
}
