package starbuzz;

public class Soy extends CondimentDecorator
{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription()
    {
        return this.beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost()
    {
        return this.beverage.cost() + .15;
    }
}
