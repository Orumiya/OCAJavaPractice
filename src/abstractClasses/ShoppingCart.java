package abstractClasses;

public class ShoppingCart {

    public static void main(String[] args) {
        Shirt shirt1 = new Shirt();
        shirt1.setName("yellow shirt");
        shirt1.setNetPrice(20.0);
        System.out.println(shirt1.calculatePrice());
    }
}
