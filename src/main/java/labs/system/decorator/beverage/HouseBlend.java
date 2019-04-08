package labs.system.decorator.beverage;

public class HouseBlend extends Beverage {
    private float cost = 1.3F;

    public HouseBlend() {
        setDescription(String.format("HouseBlend: $ %s", this.cost));
    }

    public double cost() {

        return this.cost;
    }
}
