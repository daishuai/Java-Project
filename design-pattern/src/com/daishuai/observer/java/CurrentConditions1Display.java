package com.daishuai.observer.java;

import com.daishuai.observer.custom.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/10/8 22:57
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class CurrentConditions1Display implements Observer, DisplayElement {

    private Observable observable;

    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditions1Display(Observable observable){
        this.observable = observable;
        observable.addObserver(this);

    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Weather1Data){
            Weather1Data weatherData = (Weather1Data) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            this.display();
        }
    }

    @Override
    public void display() {
        System.out.println(String.format("当前气象情况：temperature: %.2f, humidity: %.2f, pressure: %.2f.", this.temperature, this.humidity, this.pressure));
    }
}
