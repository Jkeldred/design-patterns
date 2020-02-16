package weatherStation;

public class StatisticsDisplay implements Observer
{
    WeatherData weatherData = new WeatherData();
    private float temp;
    private float humidity;
    private float pressure;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void update(float temp, float humidity, float pressure)
    {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    private void updateDisplay() {
        System.out.println("Current Temp: " + temp + "\n" +
                "Current Humidity: " + humidity + "\n" +
                "Current Pressure: " + pressure);
    }
}
