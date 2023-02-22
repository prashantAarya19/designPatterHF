package chapter1;

import chapter1.abstractType.Duck;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        mallardDuck.swim();
    }
}
