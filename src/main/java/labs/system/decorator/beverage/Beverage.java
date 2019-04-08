package labs.system.decorator.beverage;

public abstract class Beverage {
    private String name;
    private float cost;
    private String description;


    public abstract double cost();

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public float getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

}
