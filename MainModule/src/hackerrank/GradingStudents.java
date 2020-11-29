package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {

        Integer[] gradeArray = {36, 56, 78, 87, 74, 72, 91, 94};
        List<Integer> grades = Arrays.asList(gradeArray);
        gradingStudents(grades);
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedList = new ArrayList<>();
        grades.forEach(item -> {
            if(item < 38) {
                roundedList.add(item);
            }else if((item % 5) >= 3 && ((item + 1) % 5 == 0|| (item + 2) % 5 == 0) ){
                Integer rounded = (item + 1) % 5 == 0 ? item + 1 : item + 2;
                roundedList.add(rounded);
            } else {
                roundedList.add(item);
            }
        });
        roundedList.forEach(System.out::println);
        return roundedList;
    }
}
