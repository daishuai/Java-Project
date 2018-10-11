package com.daishuai.observer.custom.observer;

import com.daishuai.observer.custom.subject.Subject;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/10/1 19:25
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private Subject subject;
    private float temperature;
    private float humidity;
    private float pressure;

    public ForecastDisplay(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }

    @Override
    public void display() {
        System.out.println(String.format("未来气象情况：temperature: %.2f, humidity: %.2f, pressure: %.2f.", this.temperature, this.humidity, this.pressure));
    }
}
