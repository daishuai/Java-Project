package com.daishuai.observer.custom.subject;

import com.daishuai.observer.custom.observer.Observer;

/**
 * @Description: 主题
 * @Author: daishuai
 * @CreateDate: 2018/10/1 9:26
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public interface Subject {
    /**
     * 观察者向主题注册
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 观察者从主题移除
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    public void notifyObservers();
}
