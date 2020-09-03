package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {

   public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<String>();
       list.add("Chicago");
       list.add("Texas");
       list.add("London");

       List list2 = list;
       list2.remove(1);

       var words = new ArrayList<String>();
       words.add("banana");
       words.add("milk");

       var newWords = words;
       var myList = newWords; // ez is arrayList lesz, de ez így már követhetetlen

       //converting an array to a list
       String[] nums = { "one", "two", "three"};
       // objecteknek kell lenniük
       List<String> mySecondList = Arrays.asList(nums);

       // mySecondList.replaceAll();  --> will work, this comes from List
       // mySecondList.removeIf()  --> won't work, belongs to ArrayList

       ArrayList<String> myThirdList = new ArrayList<>(mySecondList);
       var myForthList = new ArrayList<String>();

       // shortcut:
       ArrayList<String> myFifthList = new ArrayList<>(Arrays.asList(nums));

       String[] days = {"monday", "tuesday", "saturday", "sunday"};
       // if it's only ArrayList daysArrayList, the elements are inside considered as objects
       // if we want to use string methods, ArrayList<String> generics has to be used
       ArrayList<String> daysArrayList = new ArrayList(Arrays.asList(days));

       for(var day: daysArrayList) {
           if (day.equals("sunday")) {
               System.out.println(day.toUpperCase());
               // prints: SUNDAY
               // but it doesn't modify the string!!!!
           } else {
               System.out.println(day);
           }
       }

       System.out.println(daysArrayList);
       // prints: [monday, tuesday, saturday, sunday]

       // MODIFYING THE LIST:
       // lambda expression in the argument
       daysArrayList.replaceAll(s -> s.toUpperCase());
       // prints: [MONDAY, TUESDAY, SATURDAY, SUNDAY]
       System.out.println(daysArrayList);
   }
}
