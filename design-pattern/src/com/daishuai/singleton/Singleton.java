package com.daishuai.singleton;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/10/12 15:29
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class Singleton {

    //延迟加载
    //private static Singleton uniqueInstance;

    //“急切”加载
    //private static Singleton uniqueInstance = new Singleton();

    //双重检查加锁
    private static volatile Singleton uniqueInstance;

    private Singleton(){}

    //多线程会出现问题
    /*public static Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
            System.out.println("实例化Singleton");
        }
        return uniqueInstance;
    }*/

    //影响效率
    /*public static synchronized Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
            System.out.println("实例化Singleton");
        }
        return uniqueInstance;
    }*/

    //双重检擦加锁
    public static Singleton getInstance(){
        if (uniqueInstance == null){
            synchronized (Singleton.class){
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton();
                    System.out.println("实例化Singleton");
                }
            }
        }
        return uniqueInstance;
    }
}
