package com.daishuai.command;

/**
 * @Description: 电灯(Receiver：命令接收者)
 * @Author: daishuai
 * @CreateDate: 2018/10/15 15:26
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class Light {

    public void on(){
        System.out.println("打开电灯！");
    }

    public void off(){
        System.out.println("关闭电灯！");
    }
}
