package strategy;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWing();
    }

    @Override
    public void display() {
        System.out.println("I'm real Mallard duck");
    }
}
