package adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

public class IterenumTest {

    public static void main (String args[]) {
        ArrayList<String> l = new ArrayList<String>(Arrays.asList("one", "two", "three"));
        Enumeration<?> enumeration = new IteratorEnumeration(l.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }

}
