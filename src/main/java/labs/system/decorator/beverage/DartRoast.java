package labs.system.decorator.beverage;

public class DartRoast extends Beverage {
    private float cost = 1.5F;

    public DartRoast() {
        setDescription(String.format("Dart Roast: $ %s", this.cost));
    }

    public double cost() {
        return cost;
    }
}
