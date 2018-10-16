package com.daishuai.command;

/**
 * @Description: 执行关闭电灯命令
 * @Author: daishuai
 * @CreateDate: 2018/10/15 15:29
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }
}
