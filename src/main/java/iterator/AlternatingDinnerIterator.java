package iterator;

import java.util.Calendar;
import java.util.Iterator;

public class AlternatingDinnerIterator implements Iterator<MenuItem> {
    MenuItem[] menuItems;
    int position;

    public AlternatingDinnerIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        position = Calendar.DAY_OF_WEEK % 2;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position = position + 2;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("does not support remove");
    }
}
