package com.mkleo.S15命令模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/17 14:36 星期四
 */
public class CmdExecutor implements ICmd{

    private List<ICmd> mCmds = new ArrayList<>();

    public void addCmd(ICmd cmd) {
        if (null != cmd)
            mCmds.add(cmd);
    }


    @Override
    public void execute() {

        for(ICmd cmd : mCmds){
            cmd.execute();
        }

        mCmds.clear();
    }
}
