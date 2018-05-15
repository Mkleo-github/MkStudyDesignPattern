package com.mkleo.S12享元模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/15 9:38 星期二
 */
public class BitmapCache {

    private static final List<Bitmap> sBitmapCache = new ArrayList<>();

    public enum BitmapPool {

        BITMAP_BIRD("bird"),
        BITMAP_DOG("dog"),
        BITMAP_CAT("cat");

        public final String name;

        BitmapPool(String name) {
            this.name = name;
        }
    }

    static {
        sBitmapCache.add(new Bitmap(BitmapPool.BITMAP_BIRD.name));
        sBitmapCache.add(new Bitmap(BitmapPool.BITMAP_DOG.name));
        sBitmapCache.add(new Bitmap(BitmapPool.BITMAP_CAT.name));
    }


    public static Bitmap getBitmap(BitmapPool bitmapPool) {

        for (Bitmap bitmap : sBitmapCache) {
            if (bitmap.getName().equals(bitmapPool.name))
                return bitmap;
        }
        return null;
    }


}
