package collectionsTest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
    public HashMapTest() {
        System.out.println("HashMap");
        HashMap<Product, Integer> products = new HashMap<>();
        Product p1 = new Food("hamburger");
        Product p2 = new Food("chocolate cake");
        products.put(new Food("sushi"), Integer.valueOf(10)); // --> unnecessary boxing
        products.put(p1, 3);
        products.put(p2, 7);
        displayHashMap(products);
        Integer count = products.put(p2, 9);
        System.out.println("old value:" + count);
        System.out.println("new value:" + products.get(p2));
        products.remove(p1);

    }

    public static <T, S> void displayHashMap(HashMap<T, S> myHashMap) {
        Set<T> keys = myHashMap.keySet();
        Collection<S> values = myHashMap.values();
        for(T item : keys) {
            S value = myHashMap.get(item);
            if (item instanceof Product) {
                System.out.println(((Product) item).getName() + ": " + value.toString());
            }
        }
        for (S item : values) {
            System.out.println("value: " + item.toString());
        }
    }
}
