package abstractClasses;

public class Shirt extends Clothing{

    @Override
    public String displayName() {
        return "shirt object: " + this.name;
    }

    @Override
    public double calculatePrice() {
        price = netPrice * (((double)TAX1 / 100) + 1.0);
        return price;
    }
}
