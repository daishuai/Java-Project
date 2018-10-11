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
public class Forecast1Display implements Observer, DisplayElement {

    private Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public Forecast1Display(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Weather1Data){
            Weather1Data weather1Data = (Weather1Data) o;
            this.temperature = weather1Data.getTemperature();
            this.humidity = weather1Data.getHumidity();
            this.pressure = weather1Data.getPressure();
            this.display();
        }
    }

    @Override
    public void display() {
        System.out.println(String.format("未来气象情况：temperature: %.2f, humidity: %.2f, pressure: %.2f.", this.temperature, this.humidity, this.pressure));
    }

}
