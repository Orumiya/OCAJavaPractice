package collectionsTest;

import java.util.*;

public class SetTest {
    public SetTest() {
        System.out.println("Set and HashSet");
        Set<Vendible> productHashSet = new HashSet<>();
        Food pizza = new Food("pizza");
        productHashSet.add(new Food("sushi"));
        productHashSet.add(new Food("lasagne"));
        productHashSet.add(pizza);
        printSetItemsWithForEach(productHashSet);
        productHashSet.add(pizza);
        printSetItemsWithFor(productHashSet);
        List<Vendible> foodList = new ArrayList<>();
        foodList.add(new Food("fish soup"));
        foodList.add(pizza);
        productHashSet.addAll(foodList);
        printSetItemsWithIterator(productHashSet);
    }

    public static void printSetItemsWithForEach(Set<Vendible> products) {
        products.forEach(item -> {
            if(item instanceof Product) {
                System.out.println(((Product) item).getName());
            }
        });
        System.out.println(" --------------- ");
    }

    public static void printSetItemsWithFor(Set<Vendible> products) {
        for(var item : products) {
            if(item instanceof Product) {
                System.out.println(((Product) item).getName());
            }
        };
        System.out.println(" --------------- ");
    }

    public static void printSetItemsWithIterator(Set<Vendible> products) {
        Iterator<Vendible> itr = products.iterator();
        while (itr.hasNext()) {
            // NEM HÍVJUK KÉTSZER AZ ITR.NEXT()-et egy cikluson belül, mert továbblép!!!! --> java.util.NoSuchElementException
            var item = itr.next();
            if(item instanceof Product) {
                System.out.println(((Product) item).getName());
            }
        }
        System.out.println(" --------------- ");
    }
 }
