package labs.system.duck;

import labs.system.duck.behavior.fly.FlyNoWay;
import labs.system.duck.behavior.quack.Squeak;

public class RunbberDuck extends Duck {
    public RunbberDuck() {
        this.name = "Runbber Duck";
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }
}
