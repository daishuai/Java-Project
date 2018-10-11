package com.daishuai.observer.java;

import java.util.Observable;

/**
 * @Description: java类作用描述
 * @Author: daishuai
 * @CreateDate: 2018/10/1 19:36
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class Weather1Data extends Observable {

    private float temperature;

    private float humidity;

    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void measurementsChange(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChange();
    }
}
