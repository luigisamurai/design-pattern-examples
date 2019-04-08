package labs.system.decorator;

import labs.system.decorator.beverage.Beverage;
import labs.system.decorator.beverage.DartRoast;
import labs.system.decorator.beverage.Decaf;
import labs.system.decorator.beverage.HouseBlend;
import labs.system.decorator.condiment.Milk;
import labs.system.decorator.condiment.Mocha;
import labs.system.decorator.condiment.Soy;
import labs.system.decorator.condiment.Whip;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DecoratorMain {

    public static void generateInvoice(List<Beverage> beverages) {
        beverages.stream().forEach(beverage ->
                System.out.println(
                        String.format(
                                "%s\nsub: %.2f\n",
                                beverage.getDescription(),
                                beverage.cost()
                        )
                )
        );

        Double total = beverages.stream().collect(Collectors.summingDouble(Beverage::cost));
        System.out.println(String.format("Total: $ %.2f", total));

    }

    public static void main(String args[]) {
        List<Beverage> beverages = new ArrayList<Beverage>();

        Beverage darkRoast = new DartRoast();
        darkRoast = new Milk(darkRoast);
        darkRoast = new Whip(darkRoast);
        darkRoast = new Soy(darkRoast);

        Beverage decaf = new Decaf();
        decaf = new Milk(decaf);
        decaf = new Whip(decaf);
        decaf = new Soy(decaf);

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Milk(houseBlend);
        houseBlend = new Whip(houseBlend);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);


        beverages.add(darkRoast);
        beverages.add(decaf);
        beverages.add(houseBlend);

        generateInvoice(beverages);
    }
}
