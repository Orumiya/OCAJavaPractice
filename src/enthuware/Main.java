package enthuware;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Question1:");
        List<Student> slist = List.of(new Student("S1", 40), new Student("S2", 35), new Student("S3", 30));
        Consumer<Student> increaseMarks = s->s.addMarks(10);
        slist.forEach(increaseMarks);
        slist.forEach(Student::debug);
        // This is a straightforward code that shows how to iterate through a list and perform an operation on each element.
        // Java 8 has added a default method default void forEach(Consumer<? super T> action) in java.lang.Iterable interface
        // (which is extended by java.util.List interface). It performs the given action for each element of the Iterable until all
        // elements have been processed or the action throws an exception. Unless otherwise specified by the implementing class,
        // actions are performed in the order of iteration (if an iteration order is specified). Exceptions thrown by the action are relayed
        // to the caller.  Java 9 has added List.of/Set.of methods that return an unmodifiable list/set containing an arbitrary number of
        // elements.

        System.out.println("Question2:");
        ArrayList<String> als = new ArrayList<>(List.of("a", "b", "c"));
        Set<String> ss = new HashSet();
        ss.addAll(als); //1
        als.clear();    //2
        System.out.println(ss.size());
      //  The List.of/Set.of methods return an unmodifiable List/Set. So, if you try to clear the List returned by List.of,
        //  an OperationNotSupportedException will indeed be thrown. However, that is not what the code is doing here.
        //  It is creating a new ArrayList object with an unmodifiable list as an argument. Thus, the list pointed to by als is
        //  not unmodifiable. It is a regular ArrayList instance that contains the same three elements as the ones in the unmodifiable list.
        //  Next, a HashSet is created with the ArrayList pointed to by als as argument. This creates a HashSet with the same three three
        //  elements as the ArrayList. However, this HashSet is not dependent on the ArrayList. So, if you clear the ArrayList,
        //  the elements still remain in the HashSet.  That is why the output is 3.

        System.out.println("Question 3");
        var i = new int[ ][ ] { {1, 2, 3}, {4, 5, 6} } ;
        // var i[][]  = { { 1, 2 }, { 1 }, { }, { 1, 2, 3 } } ;
        // var i[ ] = new int[2] {1, 2} ;
        // var i[4] = new int[]{ 1, 2, 3, 4 } ;

        System.out.println("Question4:");
        List<String> strList = Arrays.asList("a", "aa", "aaa");
        Function<String, Integer> f = x->x.length();
        Consumer<Integer> c = x->System.out.print("Len:"+x+" ");
        Predicate<String> p = x->"".equals(x);
        // strList.forEach( *INSERT CODE HERE*  );

        // f c or p?
        // The forEach method expects a Consumer. Further, since strList is a list of Strings,
        // strList.forEach expects a Consumer<String>. Therefore, none of the given options can be passed to the forEach invocation.

    }
}
