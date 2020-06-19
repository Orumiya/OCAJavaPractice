package encapsulation;

public class EqualityBetweenStrings {

    public static void main(String[        ] args) {
        String name1 = "John Smith";
        String name2 = "Ted Smith";
        if (name1.equals(name2)) {
            System.out.println("same name");
        } else {
            System.out.println("different name");
        }

        String name3 = "John Smith";
        String name4 = "john smitH";

        if (name3.equalsIgnoreCase(name4)) {
            System.out.println("same name");
        } else {
            System.out.println("different name");
        }

        // SOHAAAAAAAA!!!!! if (name1 == name4)
        // viszont name1 == name3 true lesz, mert a Java takarékos módon ugyanarra a memóriahely címét adja a name3-nak is

        int A, B, C, D;
        A = 3;
        B = A++;
        System.out.println("B" + B);
        System.out.println("A" + A);
        C = --A;
        System.out.println("C" + C);
        D = ++A;
        System.out.println("A" + A);
        if (!name1.equals(name2) && (A > B || C < D )) {
            System.out.println(A + " " + B + " " + C + " " + D);
        }

        int x = 3, y = 5, z = 0, a = 3, b = 4, c = 1;
        z = (y < x) ? x : y;

        z = (a > b) ? x : (b > c) ? y : c;
        System.out.println(z);

        x = 4;
        y = 9;
        x = ((y / x) < 3) ? x+= y : x *y;
        System.out.println(x);

    }
}
