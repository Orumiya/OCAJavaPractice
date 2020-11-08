package inheritance_test;

import java.util.Objects;
enum PRODUCT_TYPE {
    FOOD,
    DRINK
}
public abstract class Product {
    public static int ID = 0;

    private PRODUCT_TYPE productType;
    private String name;
    private double basePrice;
    public final int productId;

    public Product(String name, double basePrice) {
        this.name = name;
        ID++;
        this.productId = ID;
        this.setBasePrice(basePrice);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        // this is what the super equals does!
        // if this product is exact same reference as the reference I get as an argument--
        // I am a reference in the same object in a heap or not?
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        Product other = (Product) obj;
        return this.productId == other.productId;
    }

    public int hashCode() {
        // return this.productId;
        return Objects.hash(productId, name);
    }

    public abstract double getPrice();

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
