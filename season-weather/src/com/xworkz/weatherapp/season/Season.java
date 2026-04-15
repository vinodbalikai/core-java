package com.xworkz.weatherapp.season;

import com.xworkz.weatherapp.weather.Weather;

public class Season {
    Weather weather;

    public boolean creatWeather(Weather weather){
        boolean isWeatherCreated=false;
        boolean isWeatherIdValid=false;
        boolean isWeatherNameValis=false;
        boolean isWeatherTemperatureValid=false;

        if(weather.getWeatherId()>0)isWeatherIdValid=true;
        if(weather.getWeatherName()!=null)isWeatherNameValis=true;
        if(weather.getWeatherTempetature()>0)isWeatherTemperatureValid=true;

        if(isWeatherIdValid&&isWeatherNameValis&&isWeatherTemperatureValid){
            isWeatherCreated=true;
            this.weather=weather;
        }
        return isWeatherCreated;
    }

    public void getWeatherDetails(){
        System.out.println("The weather id is: "+weather.getWeatherId());
        System.out.println("The weather name is: "+weather.getWeatherName());
        System.out.println("The weather temperature is: "+weather.getWeatherTempetature());
    }
}
