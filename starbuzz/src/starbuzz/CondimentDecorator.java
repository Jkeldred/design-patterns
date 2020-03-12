package starbuzz;

/**
 * This abstract class will be what all condiments inherit from. It will be the link between our beverages
 * and the different "behaviors" that the drink can have from the condimentDecorators.
 */
public abstract class CondimentDecorator extends Beverage
{
    public abstract String getDescription();
}
