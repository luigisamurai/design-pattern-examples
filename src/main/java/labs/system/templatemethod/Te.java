package labs.system.templatemethod;

public class Te extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Te.brew -> té");

    }

    @Override
    public void addCondiments() {
        System.out.println("Te.addCondiments -> Lemon");
    }
}
