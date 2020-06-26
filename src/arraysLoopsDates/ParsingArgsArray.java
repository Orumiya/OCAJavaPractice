package arraysLoopsDates;

public class ParsingArgsArray {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("not enough parameters");
        } else {
            System.out.println("argument 1: " + args[0]);
            // COMMAND LINE:
            // JAVAC TestClass.java  --> TestClass.class
            // java Testclass arg1 arg2
            System.out.println("without parse: " + args[0] + args[1]);
            int arg1 = Integer.parseInt(args[0]);
            int arg2 = Integer.parseInt(args[1]);
            System.out.println("result: " + (arg1 + arg2));
        }
    }
}
