package primitiveVariables;

public class TypeCastingExamples {
    public TypeCastingExamples() {
        displayExamples();
    }

    private void displayExamples() {
        System.out.println("*********** TypeCastingExamples **************");
        byte a = 127;
        byte b = 5;
        // byte sum = a+b; POSSIBLE OVERFLOW THEREFORE COMPILER ERROR
        System.out.println("byte a = 127; byte b = 5; --> byte sum = a+b --> compiler error");
        int sum = a + b; // automatic promotion to larger type
        byte e = (byte)(a+b); // castolni kell, hogy valóban bíte legyen, de ez túlcsordult!!!!
        System.out.println(e + " túlcsordult 127 + 5 értéke byte type esetén");

        int f = a/b; // f is 25 as an int (because a and b were byte)
        System.out.println("int f = a/b; " + " f ="+f);
        float f_float = a/b; // automatic promotion, but f is still int 25.0
        float f_typeCasted = (float)(a/b); // explicit type casting but it's still 25.0
        System.out.println("f: " + f + ", f_float:" + f_float + ", f_typeCasted: "+f_typeCasted);

        float f_realFloat1 = (float)a /b;
        float f_realFloat2 = a/(float)b;
        System.out.println("f is real float if either a or b is type casted to float: float1: " + f_realFloat1 + " float2: " + f_realFloat2);

      //  b = b + 1;
        System.out.println("byte b = 5; b = b + 1; --> explicit casting is required!!!! compiler error!! b + 1 is an int!!!");
        b = (byte)(b + 1);

        System.out.println("b = (byte)(b + 1); result = " + b);
        b++;
        --b;
        System.out.println("b++ or --b for byte is OK without casting ---> it's an int!!!! ");
        System.out.println("b: " + b + ", b++ :" + b++ + ", b-- : " + b--);

        System.out.println("arithmetic operations work with character codes: you end up with new character code!");
        char x = 'x';
        char y = ++x;
        System.out.println("char x =" + x + ", char y = ++x; y =" + y);

    }
}
