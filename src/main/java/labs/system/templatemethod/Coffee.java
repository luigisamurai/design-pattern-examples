package labs.system.templatemethod;

public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Coffee.brew -> coffee");

    }

    @Override
    public void addCondiments() {
        System.out.println("Coffee.addCondiments -> Milk and sugar");
    }
}
