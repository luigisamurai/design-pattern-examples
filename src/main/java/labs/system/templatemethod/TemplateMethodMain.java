package labs.system.templatemethod;

public class TemplateMethodMain {
    public static void main(String [] args) {
        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage te = new Te();

        coffee.preparate();
        System.out.println();
        te.preparate();
    }
}
