package com.xworkz.weatherapp;

import com.xworkz.weatherapp.season.Season;
import com.xworkz.weatherapp.weather.Weather;

public class SeasonExecuter {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Season season=new Season();
        Weather weather=new Weather();
        weather.setWeatherId(17);
        weather.setWeatherName("Summer");
        weather.setWeatherTempetature(33);

        season.creatWeather(weather);
        season.getWeatherDetails();

        System.out.println("Main Ended");
    }
}
