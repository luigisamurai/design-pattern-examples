package labs.system.decorator.condiment;

import labs.system.decorator.beverage.Beverage;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.setName("Soy");
        this.setCost(0.5F);
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + this.getCost();
    }
}
