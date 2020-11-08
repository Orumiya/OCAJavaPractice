package inheritance_test;

import java.time.LocalDate;

public class OverrideObjectClassOperations {
    public OverrideObjectClassOperations() {

        Product p = new Food("pasta", 1100, LocalDate.of(2020,12,31));
        System.out.println("product toString: " +p.toString());
        Food f = new Food("lasagne", 1800, LocalDate.of(2021, 2, 13));
        System.out.println("food toString: " + f.toString());

        System.out.println("product ID of p: " + p.productId);
        System.out.println("product ID of f: " + f.productId);
        System.out.println("p.hashCode() == f.hashCode(): ");
        System.out.println(p.hashCode() == f.hashCode());
        Product pp = f;
        System.out.println("pp.hashCode() == f.hashCode(): ");
        System.out.println(pp.hashCode() == f.hashCode());
    }
}
