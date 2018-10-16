package com.daishuai.command;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/10/16 20:10
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class NoCommand implements Command {



    @Override
    public void execute() {
        System.out.println("默认空命令！");
    }
}
