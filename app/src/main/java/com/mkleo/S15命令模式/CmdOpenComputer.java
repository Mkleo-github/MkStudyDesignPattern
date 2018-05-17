package com.mkleo.S15命令模式;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/17 14:22 星期四
 */
public class CmdOpenComputer extends CmdEntity<IComputer>  {


    public CmdOpenComputer(IComputer computer) {
        super(computer);
    }

    @Override
    public void execute() {
        mExecutor.open();
    }
}
