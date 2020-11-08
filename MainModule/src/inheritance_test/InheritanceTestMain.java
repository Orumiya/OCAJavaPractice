package inheritance_test;

import java.time.LocalDate;

public class InheritanceTestMain {
    public static void main(String... args) {

       // OverrideObjectClassOperations o = new OverrideObjectClassOperations();

        // FACTORY PATTERN
        Product food1 = ProductFactory.createProduct(PRODUCT_TYPE.FOOD, "lasagne", 1800);
        Product food2 = ProductFactory.createProduct(PRODUCT_TYPE.FOOD, "pizza", 1200);
        Product drink1 = ProductFactory.createProduct(PRODUCT_TYPE.DRINK, "orange juice", 500);
        System.out.println(food1 + ", " + food2 + ", " + drink1);

        if(food1 instanceof Food) {
            ((Food) food1).setExpirationDate(LocalDate.of(2021,12,20));
            System.out.println(food1.getName() + "'s expiration date: " + ((Food) food1).getExpirationDate());
        }
    }
}
