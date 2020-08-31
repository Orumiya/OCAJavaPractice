package inheritance.package1;

import java.util.ArrayList;

public class Polymorphism {

    public static void main(String[] args) {
        Cloth shirt1 = new Shirt("yellow shirt", 'R', 38, 4);
        shirt1.display();
        Cloth trousers1 = new Trousers("jeans");
        trousers1.display();
        // shirt1.getNecksize() nem létezik!!!!!!
        // csak azt tudom hívni, ami a Cloth-ban is van, de az adatokat a Shirt-ből kapja!!!!

        ArrayList<Cloth> arrayList = new ArrayList<>();
        arrayList.add(shirt1);
        arrayList.add(trousers1);

        // casting the reference type
        // de ez nem biztonságos, mert előfordulhat casting error!!!!
        ((Trousers)trousers1).setFit("nicely fit");
        System.out.println(((Trousers) trousers1).getFit());

        // ellenőrzés!!!!!
        if(trousers1 instanceof Trousers) {
            String fit = ((Trousers)trousers1).getFit();
            System.out.println("this trousers is " + fit);
        }

    }
}
