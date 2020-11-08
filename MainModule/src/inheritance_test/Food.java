package inheritance_test;

import java.time.LocalDate;

public class Food extends Product {

    private LocalDate expirationDate;
    public Food(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public double getPrice() {
        return 500;
    }

    public Food(String name, double basePrice, LocalDate expirationDate) {
        this(name, basePrice);
        this.setExpirationDate(expirationDate);
    }

    @Override
    public String toString() {
        return "super.toString: " + super.toString() + ", this impl: " + this.getName() + ", expiration date: " + getExpirationDate();
        // return this.getName() + ", expiration date: " + getExpirationDate();
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

}
