package com.mkleo.S15命令模式;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/17 14:32 星期四
 */
public class CmdCloseComputer extends CmdEntity<IComputer> {

    public CmdCloseComputer(IComputer executor) {
        super(executor);
    }

    @Override
    public void execute() {
        mExecutor.close();
    }
}
