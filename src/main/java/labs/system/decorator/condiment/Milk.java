package labs.system.decorator.condiment;

import labs.system.decorator.beverage.Beverage;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.setName("Milk");
        this.setCost(0.5F);
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + this.getCost();
    }
}
