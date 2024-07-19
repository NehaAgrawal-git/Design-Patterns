
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        weatherStation.registerObserver(currentDisplay);
        weatherStation.registerObserver(statisticsDisplay);

        // Simulate weather changes
        weatherStation.setWeatherData(80, 65, 30);
        weatherStation.setWeatherData(82, 70, 29);
        
        // Unregister an observer
        weatherStation.removeObserver(statisticsDisplay);

        weatherStation.setWeatherData(78, 90, 29);
    }
}
