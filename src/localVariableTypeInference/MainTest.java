package localVariableTypeInference;

import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {
        // local Variable Type Inference JAVA 10 feature
        // compiler infers the data type from the variable initialiser
        ArrayList list1 = new ArrayList<String>();
        var list2 = new ArrayList<String>(); // datatype declared only once

        // doesnt break the old code: var is not a keyword, only a reserved type name
        //USAGE:
        //1, local variables
        var x = list1.toString();
        // 2, for loop
        for(var i=0; i<10;i++) { }
        // 3, for each loop
        for (var y : list1) { }

        // DON'T USE IT:
        /* 1, declaration without initial value
        var price;

        2, declaration and initialisation with a null value
        var price = null;

        3, fields
        public var price;

        4, parameters
        public void setPrice(var price) {}

        5, method return types
        public var getSomething(int something) {
         return something;
        }
         */

    }
}
