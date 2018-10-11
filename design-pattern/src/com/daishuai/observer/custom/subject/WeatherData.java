package com.daishuai.observer.custom.subject;

import com.daishuai.observer.custom.observer.Observer;

import java.util.List;

/**
 * @Description: 气象站实现主题
 * @Author: daishuai
 * @CreateDate: 2018/10/1 9:43
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class WeatherData implements Subject {

    private List<Observer> observers;

    private float temperature;

    private float humidity;

    private float pressure;

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

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

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index > 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update();
        }
    }


}
