package iterator;

import java.util.HashMap;
import java.util.Iterator;

public class CafeMenu implements Menu {
    HashMap<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        addItem("Veggie Burgervand Air Fries",
                 "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99);
        addItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false, 3.69);
        addItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamalo",
                true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
