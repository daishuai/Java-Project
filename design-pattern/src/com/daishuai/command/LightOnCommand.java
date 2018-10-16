package com.daishuai.command;

/**
 * @Description: 执行打开电灯命令
 * @Author: daishuai
 * @CreateDate: 2018/10/15 15:26
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }
}
