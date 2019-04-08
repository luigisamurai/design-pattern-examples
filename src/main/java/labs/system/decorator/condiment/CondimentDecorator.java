package labs.system.decorator.condiment;

import labs.system.decorator.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public String getDescription() {
        return String.format("%s\n\t%s: $ %s", this.beverage.getDescription(), this.getName(), this.getCost());
    }

}
