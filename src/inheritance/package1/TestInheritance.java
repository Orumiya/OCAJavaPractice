package inheritance.package1;

public class TestInheritance {
    public static void main(String[] args) {
        Shirt shirt1 = new Shirt("woman basic shirt", 'R', 38, 45);
        Trousers t1 = new Trousers("men basic trousers");
        t1.setSize(56);

        shirt1.display();
        t1.display();
        Shirt shirt2 = new Shirt("child shirt", 'B', 30, 30);
        System.out.println("shirt1 id: " + shirt1.getId() + ", trousers id: " + t1.getId() + ", shirt2 id: " + shirt2.getId());

        Cloth shirt3 = new Shirt("shirt cloth", 'G', 36, 40);
        System.out.println(shirt3.getName());
        // shirt3 doesn't know about neckSize!!!!
    }
}
