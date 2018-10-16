package com.daishuai.command;

/**
 * @Description: 命令模式（Command Pattern）:
 * 将“请求”封装成对象，以便使用不同的请求、队列或日志来参数化其他对象。
 * @Author: daishuai
 * @CreateDate: 2018/10/15 15:24
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class CommandPatternTest {

    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        SimpleRemoteController controller = new SimpleRemoteController();
        controller.setOnCommands(0,lightOnCommand);
        controller.setOffCommands(0, lightOffCommand);
        controller.onButtonWasPushed(0);
        controller.offButtonWasPushed(0);
        controller.onButtonWasPushed(1);
    }
}
