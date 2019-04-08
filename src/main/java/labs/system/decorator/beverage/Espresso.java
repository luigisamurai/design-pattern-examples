package labs.system.decorator.beverage;

public class Espresso extends Beverage {
    private float cost = 0.8F;

    public Espresso() {
        setDescription(String.format("Espresso: $ %s", this.cost));
    }

    public double cost() {
        return this.cost;
    }
}
