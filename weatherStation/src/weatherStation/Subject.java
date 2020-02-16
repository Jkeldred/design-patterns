package weatherStation;

/**
 * Only the main Subject of the project will implement this. In the one-to-many relationship, the Object that
 * implements this will be the "One" in this relationship.
 */
public interface Subject
{
    /**
     * All arguments to methods must be passed within the interface before they are implemented by other
     * classes that will be using them.
     * @param o
     */
    public void registerObserver(Observer o);
    public void notifyObservers();
    public void removeObserver(Observer o);
}
