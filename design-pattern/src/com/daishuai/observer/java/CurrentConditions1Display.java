package com.daishuai.observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/10/8 22:57
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class CurrentConditions1Display implements Observer {

    private Observable observable;

    public CurrentConditions1Display(Observable observable){
        this.observable = observable;
        observable.addObserver(this);

    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;

        }
    }
}
