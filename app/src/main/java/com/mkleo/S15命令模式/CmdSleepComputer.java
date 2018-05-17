package com.mkleo.S15命令模式;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/17 14:33 星期四
 */
public class CmdSleepComputer extends CmdEntity<IComputer> {


    public CmdSleepComputer(IComputer executor) {
        super(executor);
    }

    @Override
    public void execute() {
        mExecutor.sleep();
    }
}
