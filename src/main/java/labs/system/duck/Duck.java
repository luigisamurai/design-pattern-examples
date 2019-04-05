package labs.system.duck;

import labs.system.duck.behavior.fly.FlyBehavior;
import labs.system.duck.behavior.quack.QuackBehavior;

public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public String swing() {
        return "Swing";
    }

    public void display() {
        String text = String.format(
                "The %s says %s, it %s",
                this.getName(),
                this.performQuack(),
                this.performFly()
        );

        System.out.println(text);
    }

    public String performFly() {
        return flyBehavior.fly();
    }

    public String performQuack() {
        return quackBehavior.makeSound();
    }
}
