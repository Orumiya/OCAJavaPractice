package methods;

// STATIKUS metódusok
public class Shop {
    public static String staticItemId;
    int instanceItemId;
    public static void main(String[] args) {

        Shop shop1 = new Shop();
        staticItemId = "static01";
        // instanceItemId = 4;   --> ezt nem lehet!!!!
        shop1.instanceItemId = 2;

        staticMethodShowItemId();  // objektum referencia nélkül hívható a static
        shop1.instanceMethodShowItemId(); // csak objektum referenciával hívható a nem static
        // instanceMethodShowItemId();   ---> így nem!!!
       // shop1.convertStringValues();

        // ha objektumot adunk a metódusnak --> referencia!!!!
       Shirt shirt1 = new Shirt(23, "woman shirt");
       shirt1.colorCode = 'B';
        System.out.println(shirt1.colorCode);
       Shirt.changeColor(shirt1, 'L');
        System.out.println(shirt1.colorCode);

        //************* ha primitive data type-ot kap, akkor nem írja felül!
        int A = 3;
        int B = 5;
        int sum = 0;
        System.out.println("A: " + A + " B: " + B);

        assignBtoA(A, B);
        System.out.println("A: " + A + " B: " + B);

        shirt1.A = 3;
        shirt1.B = 5;
        System.out.println("shirt.A: " + shirt1.A + " shirt1.B: " + shirt1.B);
        assignBtoA(shirt1.A, shirt1.B);
        System.out.println("shirt.A: " + shirt1.A + " shirt1.B: " + shirt1.B);
        //*************
        assignBtoA(shirt1, B);
        System.out.println("passing reference: shirt.A: " + shirt1.A + " shirt1.B: " + shirt1.B);
    }
    public static void assignBtoA(int num1, int num2) {
        num1 = num2;
    }

    // overloading csak akkor, ha a paraméterek eltérnek!!! ha csak a return type tér el, az nem jó!!!!!
    public static void assignBtoA(Shirt myShirt, int num2) {
        myShirt.A = num2;
    }

    public void instanceMethodShowItemId() {
        System.out.println("static: " + staticItemId);
        System.out.println("instance: " + instanceItemId);
    }

    public static void staticMethodShowItemId() {
        System.out.println("static: " + staticItemId);
        // System.out.println("instance: " + instanceItemId);   ---> ezt nem lehet itt se!!!!
    }

    public void convertStringValues() {
        String numberAsString = "3456789";
        int numberAsNumber = Integer.parseInt(numberAsString);
        System.out.println("parsed to Int:" + numberAsNumber);
        double numberAsDouble = Double.parseDouble(numberAsString);
        System.out.println("parsed to double: " + numberAsDouble);
        String fakebool = "true";
        boolean myBool = Boolean.parseBoolean(fakebool);
        System.out.println("parsed to boolean: " + myBool);
    }
}
