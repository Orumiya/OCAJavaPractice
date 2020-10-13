package operators;

public class FullOrShortCircuitEval {
    public FullOrShortCircuitEval() {
        System.out.println("*********Shirt circuit eval -> right hand side of || and && not evaluated if first part is true");
        int a = 2, b = 3;
        boolean c = false;
        c =(a > b && ++b == 4); // c is false, b is 3 --> a ++b itt nem hajtódik végre!!!
        System.out.println(c + ", " + b);
        c = (a > b | ++b == 4); // c is true, b is 4
        System.out.println(c + ", " + b);
        System.out.println("full evaluation: | & ^");
        System.out.println("^ - exclusive or: left or right has to be true");

    }
}
