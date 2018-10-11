package com.daishuai.observer;

import com.daishuai.observer.custom.observer.CurrentConditionsDisplay;
import com.daishuai.observer.custom.observer.ForecastDisplay;
import com.daishuai.observer.custom.observer.StatisticsDisplay;
import com.daishuai.observer.custom.subject.WeatherData;
import com.daishuai.observer.java.CurrentConditions1Display;
import com.daishuai.observer.java.Forecast1Display;
import com.daishuai.observer.java.Statistics1Display;
import com.daishuai.observer.java.Weather1Data;

/**
 * @Description: 观察者模式（Observer Pattern）:
 * @Author: daishuai
 * @CreateDate: 2018/10/8 21:57
 * @Version: 1.0
 * Copyright: Copyright (c) 2018
 */
public class ObserverPatternTest {

    public static void main(String[] args) {


        //自定义观察者模式
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(12.5f,222,87.4f);

        //Java实现的观察者模式
        Weather1Data weather1Data = new Weather1Data();
        CurrentConditions1Display currentConditions1Display = new CurrentConditions1Display(weather1Data);
        Statistics1Display statistics1Display = new Statistics1Display(weather1Data);
        Forecast1Display forecast1Display = new Forecast1Display(weather1Data);
        weather1Data.setMeasurements(2323,78.3f,7800.44f);

    }
}
