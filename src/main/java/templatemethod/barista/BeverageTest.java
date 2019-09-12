package templatemethod.barista;

public class BeverageTest {
    public static void main(String[] args) {
        TeaWithHook tea = new TeaWithHook();
        CoffeWithHook coffe = new CoffeWithHook();

        System.out.println("Making a tea...");
        tea.prepareRecipe();


        System.out.println("\nMaking coffee...");
        coffe.prepareRecipe();
    }
}
