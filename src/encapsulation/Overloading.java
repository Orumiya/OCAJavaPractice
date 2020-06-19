package encapsulation;

public class Overloading {
    public static void main(String[] args) {

    }
}

class Shirt{
    public char colorCode;
    public double price;
    public Shirt() {
        // this is a no argument constructor, but NOT the default constructor
    }
    public Shirt(char _colorCode) {
        colorCode = _colorCode;
    }

    public Shirt(char _colorCode, double _price) {
        this(_colorCode);
        price = _price;
    }
}
