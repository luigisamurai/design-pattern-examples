package labs.system.decorator.condiment;

import labs.system.decorator.beverage.Beverage;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.setName("Whip");
        this.setCost(0.8F);
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + this.getCost();
    }
}
