package inheritance_test;

public class ProductFactory {
    public static Product createProduct(PRODUCT_TYPE productType, String name, double base_price) {
        switch (productType) {
            case FOOD:
                return new Food(name, base_price);
            case DRINK:
                return new Drink(name, base_price);
            default:
                return null;
        }
    }
}
