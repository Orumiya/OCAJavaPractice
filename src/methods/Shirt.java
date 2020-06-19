package methods;

public class Shirt {
    // static field is shared by all objects
    public static int itemCount;
    public int itemNo;
    public String name;
    public String description;
    public char colorCode;
    public int A;
    public int B;

    public Shirt(){}
    public Shirt(int _itemNo, String _name) {
        this();
        itemCount++;
        this.itemNo = _itemNo;
        this.name = _name;
        display();
        this.description = returnStringValue();
        // System.out.println(description);
    }
    public Shirt(char _colorCode) {
        this();
        this.colorCode = _colorCode;
    }

    public void display() {
        System.out.println("item: " + itemCount + name + " " + itemNo);
    }

    public String returnStringValue() {
        return "very nice t-shirt";
    }

    public static int howManyShirtsDoWeHave() {
        System.out.println("all shirts: " + itemCount);
        return itemCount;
    }

    public static void changeColor(Shirt shirt, char newColorCode) {
        shirt.colorCode = newColorCode;
    }
}
