package labs.system.duck;

public class DuckSim {
    public static void main(String arg[]) {
        Duck mallard = new MallardDuck();
        Duck runbberDuck = new RunbberDuck();

        mallard.display();
        runbberDuck.display();
    }
}
