package com.daishuai.singleton;

/**
 * @Description: Singleton Pattern（单例模式）
 *
 * @Author: daishuai
 * @CreateDate: 2018/10/12 15:31
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class SingletonPatternTest {

    public static void main(String[] args) {

        for (int i=0;i < 100;i++){
            new Thread(() -> {Singleton singleton = Singleton.getInstance();}).start();
        }
    }
}
