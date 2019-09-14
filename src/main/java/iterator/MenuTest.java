package iterator;

public class MenuTest {
    public static void main(String[] args) {
        PancakeHouseMenu pancake = new PancakeHouseMenu();
        DinerMenu diner = new DinerMenu();
        CafeMenu cafe = new CafeMenu();
        Waitress waitress = new Waitress(pancake, diner, cafe);
        waitress.printMenu();
    }


}
