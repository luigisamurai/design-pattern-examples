package labs.system.templatemethod;

public abstract class CaffeineBeverage {
    public abstract void brew();

    public abstract void addCondiments();

    public void preparate() {
        boilWatter();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWatter() {
        System.out.println("CaffeineBeverage.boilWatter");
    }

    public void pourInCup() {
        System.out.println("CaffeineBeverage.pourInCup");
    }
}
