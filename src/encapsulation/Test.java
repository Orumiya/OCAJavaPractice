package encapsulation;

public class Test {
    public static void main(String[] args) {

        Customer client = new Customer();
        client.sethasLoyaltyDiscount(true);
        Item item = new Item();
       // item.price = 10.0; // WONT COMPILE!!!!
        item.setPrice(client, 16.0);
        System.out.println(item.getPrice());
        item.setColorCode('B');
        System.out.println(item.getColorCode());
    }
}

class Customer {
    private boolean hasLoyaltyDiscount;

    public void sethasLoyaltyDiscount(boolean hasDiscount) {
        this.hasLoyaltyDiscount = hasDiscount;
    }
    public boolean hasLoyaltyDiscount() {
        return this.hasLoyaltyDiscount;
    }
}

class Item {
    private double price;
    private char colorCode;

    public void setColorCode(char newColorCode) {
        if (newColorCode == 'R') {
            colorCode = newColorCode;
            return;
        }
        if (newColorCode == 'B') {
            colorCode = newColorCode;
            return;
        }
        if (newColorCode == 'Y') {
            colorCode = newColorCode;
            return;
        }
        System.out.println("invalid color code, use R B or Y");
    }

    public char getColorCode () {
        return colorCode;
    }
    public void setPrice(Customer cust, double defaultPrice) {
        if (cust.hasLoyaltyDiscount()) {
            this.price = defaultPrice* .85;
        } else {
            this.price = defaultPrice;
        }
    }

    public double getPrice() {
        return this.price;
    }
}
