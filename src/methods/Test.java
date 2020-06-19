package methods;

public class Test {
    public static void main(String[] args) {
        Shirt shirt1 = new Shirt();
        Shirt shirt2 = new Shirt();
        shirt1 = shirt2;
        shirt1.colorCode = 'B';
        System.out.println("shirt1 color: " + shirt1.colorCode);
        shirt2.colorCode = 'G';
        System.out.println("shirt1 color: " + shirt1.colorCode);
        System.out.println("shirt2 color: " + shirt2.colorCode);
    }
}
