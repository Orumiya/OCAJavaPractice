package interfaces;

// abstract class, implement an interface
public abstract class Item implements PriceManagerIF{
    private static int nextId = 0;
    private int itemId;
    double netPrice;
    double totalPrice;
    double discountPrice;

    public Item() {
        this.itemId = ++nextId;
    }

    public int getItemId() {
        return itemId;
    }

    @Override
    public double calculatePrice(double netPrice, double VAT) {
        return netPrice * ((VAT /100) + 1);
    }

    private void setTotalPrice(double netPrice) {
        this.totalPrice = this.calculatePrice(netPrice, VAT1);
    }

    public void setNetPrice (double netPrice) {
        this.netPrice = netPrice;
        this.setTotalPrice(this.netPrice);
    }
}
