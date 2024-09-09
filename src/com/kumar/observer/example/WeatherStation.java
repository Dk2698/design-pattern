package com.kumar.observer.example;

public class WeatherStation {
    public static void main(String[] args) {
        // Create a WeatherData instance
        WeatherData weatherData = new WeatherData();

        // Create and register displays
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        // Uncomment the following lines to add more displays
        // StatisticDisplay statisticDisplay = new StatisticsDisplay(weatherData);
        // ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        // Simulate weather measurements changes
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
