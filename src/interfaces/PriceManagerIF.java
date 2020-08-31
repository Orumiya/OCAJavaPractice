package interfaces;

public interface PriceManagerIF {
    public final int VAT1 = 27;
    int VAT2 = 5;

    // IF public methods are abstract!!!!
    public double calculatePrice(double netPrice, double VAT);
    public double calculateDiscountPrice(double price, double discountPercent);

    // NOT ABSTRACT METHODS IN IF: DEFAULT
    default double calculateVAT(double grossPrice, int VAT) {
        return grossPrice * VATpercent(VAT);
    }

    // PRIVATE
    private double VATpercent(int VAT) {
        return (double)VAT /100;
    }

    // STATIC
    public static int getVAT1() {
        return VAT1;
    }
}
