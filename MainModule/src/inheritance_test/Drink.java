package inheritance_test;

public class Drink extends Product {
    private int milliLiter;
    public Drink(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public double getPrice() {
        return 300;
    }

    public String toString() {
        return this.getName();
    }

    public int getMilliLiter() {
        return milliLiter;
    }

    public void setMilliLiter(int milliLiter) {
        this.milliLiter = milliLiter;
    }
}
