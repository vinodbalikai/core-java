package com.xworkz.weatherapp.weather;

public class Weather {
    private int weatherId;
    private String weatherName;
    private int weatherTempetature;

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public void setWeatherName(String weatherName) {
        this.weatherName = weatherName;
    }

    public void setWeatherTempetature(int weatherTempetature) {
        this.weatherTempetature = weatherTempetature;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public String getWeatherName() {
        return weatherName;
    }

    public int getWeatherTempetature() {
        return weatherTempetature;
    }
}
