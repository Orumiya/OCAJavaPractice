package interfaces;

public class Book extends Item {
    public Book(double netPrice, double discount) {
        setNetPrice(netPrice);
        this.discountPrice = calculateDiscountPrice(this.totalPrice, discount);
    }
    @Override
    public double calculateDiscountPrice(double price, double discountPercent) {
        return price * ((100.0 - discountPercent) / 100);
    }
}
