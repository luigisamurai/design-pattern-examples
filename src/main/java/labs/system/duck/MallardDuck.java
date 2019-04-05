package labs.system.duck;

import labs.system.duck.behavior.fly.Fly;
import labs.system.duck.behavior.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        this.name = "Mallard Duck";
        this.flyBehavior = new Fly();
        this.quackBehavior = new Quack();
    }
}
