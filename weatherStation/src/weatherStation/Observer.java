package weatherStation;

/**
 * All Objects that are dependent of some information from the main Subject Object will implement this interface.
 * While all objects that implement this will receive the updated info from the Subject, the subject doesn't know
 * what the data is used for and the observers don't know where the data comes from.
 */
public interface Observer
{
    public void update(float temp, float humidity, float pressure);
}
