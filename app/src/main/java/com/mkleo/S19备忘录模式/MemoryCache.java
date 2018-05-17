package com.mkleo.S19备忘录模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/17 16:59 星期四
 */
public class MemoryCache {

    private List<Memory> mMemoryCache = new ArrayList<>();

    public void addMemory(Memory memory) {
        mMemoryCache.add(memory);
    }

    public Memory getMemory(int position) {
        return mMemoryCache.get(position);
    }

    public int theLastPosition() {
        return mMemoryCache.size() - 1;
    }

}
