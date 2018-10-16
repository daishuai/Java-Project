package com.daishuai.command;

/**
 * @Description: 遥控器（Invoker：调用者）
 * @Author: daishuai
 * @CreateDate: 2018/10/15 15:31
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class SimpleRemoteController {

    private Command[] onCommands;

    private Command[] offCommands;


    public SimpleRemoteController(){
        onCommands = new Command[3];
        offCommands = new Command[3];
        for (int i = 0; i < offCommands.length; i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setOnCommands(int index, Command onCommand){
        if (onCommand != null && index < onCommands.length && index >= 0){
            onCommands[index] = onCommand;
        }
    }

    public void setOffCommands(int index, Command offCommand){
        if (offCommand != null && index < offCommands.length && index >= 0){
            offCommands[index] = offCommand;
        }
    }

    public void onButtonWasPushed(int index){
        if (index >= 0 && index < onCommands.length){
            onCommands[index].execute();
        }
    }

    public void offButtonWasPushed(int index){
        if (index >= 0 && index < offCommands.length){
            offCommands[index].execute();
        }
    }
}
