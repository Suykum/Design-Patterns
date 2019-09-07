package decorator;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roasted";
    }

    @Override
    public double cost() {
        return .99;
    }
}
