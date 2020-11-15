package collectionsTest;

public class Food extends Product {
    public Food(String name) {
        this.setName(name);
        this.setProductType(ProductType.FOOD);
    }
    private double price;
    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double netPrice) {
        this.price = price * (1 + ÁFA);
    }
}
