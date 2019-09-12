package templatemethod.sort;

import java.util.Arrays;

public class DuckSort {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Loli", 7),
                new Duck("Popi", 2),
                new Duck("Dony", 10)
        };
        System.out.println("Before sorting: ");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nafter sorting");
        display(ducks);
    }

    public static void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}
