package arrayLists;
import java.util.ArrayList;

public class ArrayList_Test {
    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList();
        test.add("James");
        test.add("Paula");
        test.add(0, "Gerald");
        String[] stringArray = {"Joli", "Rozi"};
        test.add(stringArray[0]);
        test.forEach((e) -> System.out.println(e));

        ArrayList test2 = new ArrayList<String>();
        test2.add(3);
        test2.forEach((e) -> System.out.println(e));
        Item item = new Item("t-shirt", 3);
        test2.add(item);
        System.out.println(test2.get(1));

        System.out.println("Test arrayList size: " + test.size());
        test.remove("Paula");
        System.out.println("Test arrayList size: " + test.size());


        ArrayList<String> states = new ArrayList();
        states.add("Washington"); states.add("Oregon"); states.add("Idaho"); states.add("Texas");

        ArrayList<String> countries = new ArrayList<>();
        countries.add("Hungary");
        countries.add("Austria");
        countries.add("Honduras");
        countries.add("Mexico");
        ArrayList<Item> items;
        items = new ArrayList<>();
        items.add(item);

        countries.add(2, "England");
        for (String country : countries) {
            System.out.println(country);
        }

        if (countries.contains("Hungary")) {
            countries.remove("Hungary");
        }
     //   ArrayList<int> array = new ArrayList<int>();  --> primitive type nem lehet!!!

    }
}

class Item {
    String name;
    int size;
    public Item(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "item name: " + name + ", item size: " + size;
    }
}
