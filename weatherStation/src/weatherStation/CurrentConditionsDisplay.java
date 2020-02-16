package weatherStation;

public class CurrentConditionsDisplay implements Display, Observer
{
   private float temp;
   private float humidity;
   private Subject weatherData;

    /**
     * Your constructor is where you are adding the CurrentConditionDisplay object to the ArrayList in WeatherData.
     * It will need to be passed to each object to verify that it is added to the object.
     * @param weatherData
     */
   public CurrentConditionsDisplay(Subject weatherData)
   {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
   }


    @Override
    public void update(float temp, float humidity, float pressure)
    {
        this.temp = temp;
        this.humidity = humidity;
        display();

    }

    @Override
    public void display()
    {
        System.out.println("Current Conditions: " + temp
        + "F Degrees and " + humidity + "% Humidity");
    }
}
