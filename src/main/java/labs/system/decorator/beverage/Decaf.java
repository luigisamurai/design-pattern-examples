package labs.system.decorator.beverage;

public class Decaf extends Beverage {
    private float cost = 1.2F;

    public Decaf() {
        setDescription(String.format("Decaf: $ %s", this.cost));
    }

    public double cost() {
        return this.cost;
    }
}
