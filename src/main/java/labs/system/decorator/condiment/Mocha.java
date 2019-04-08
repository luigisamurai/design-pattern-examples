package labs.system.decorator.condiment;

import labs.system.decorator.beverage.Beverage;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.setName("Mocha");
        this.setCost(0.7F);
        this.beverage = beverage;
    }

    public double cost() {
        return this.beverage.cost() + this.getCost();
    }
}
