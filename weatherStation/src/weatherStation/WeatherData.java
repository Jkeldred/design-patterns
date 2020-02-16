package weatherStation;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject
{
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * Instantiates a WeatherData Object. Initializes the observers ArrayList as well.
     */
    public WeatherData()
    {
        observers = new ArrayList<Observer>();
    }

    /**
     * <Method from interface: Subject></Method>
     * Will add an Observer implemented Object to the ArrayList of Observer Objects. It will then be notified of all
     * changes to the Subject implemented Object.
     * @param o
     */
    @Override
    public void registerObserver(Observer o)
    {
        this.observers.add(o);
    }

    /**
     * <Method from interface: Subject></Method>
     * Will notify all Observer implemented Objects when new data comes from the Subject implemented Object.
     */
    @Override
    public void notifyObservers()
    {
        for (Observer observer : observers)
        {
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }

    /**
     * <Method from interface: Subject> </Method>
     * Will remove the Observer implemented object from the ArrayList.
     * @param o
     */
    @Override
    public void removeObserver(Observer o)
    {
        int i = observers.indexOf(o);
        if (i > 0)
            observers.remove(o);
    }

    /**
     * Method called when the measurements are updated.
     */
    public void measurementsChanged()
    {
        notifyObservers();
    }

    /**
     * Sets the newly updated measurements from the weather machines.
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);


    }
}
