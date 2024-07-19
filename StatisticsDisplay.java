
public class StatisticsDisplay implements Observer {
    private int temperature;
    private int humidity;
    private int pressure;

    @Override
    public void update(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Weather statistics: Temperature " + temperature + ", Humidity " + humidity + ", Pressure " + pressure);
    }
}
