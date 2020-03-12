package starbuzz;

public abstract class Beverage
{
    String description = "unknown beverage";

    public String getDescription() {
        return description;
    }

    /**
     * An abstract method that will compute the cost of all the additional things added to the beverage.
     * @return
     */
    public abstract double cost();
}
