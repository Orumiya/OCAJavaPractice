package interfaces;

public class Shop {
    public static void main(String[] args) {

        Book book1 = new Book(200, 5);
        System.out.println(book1.discountPrice);
        System.out.println(book1.totalPrice);
        System.out.println(book1.getItemId());
    }
}
