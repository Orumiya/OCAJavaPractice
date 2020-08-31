package abstractClasses;

// cannot be instantiated!!!!
public abstract class Clothing {
    public static final int TAX1 = 27;
    int id;
    String name;
    double netPrice;
    double price;

    // can contain concrete and abstract methods as well
    public int getId() {
        return id;
    }
    public double getPrice() {
        return price;
    }
    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }
    public void setName (String newName) {
        name = newName;
    }

    public abstract String displayName(); //MUST BE implemented in the child class
    public abstract double calculatePrice(); //MUST BE implemented in the child class
}
