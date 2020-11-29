package hackerrank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<Integer>(List.of(3,4,5,5,6,6));
        int result = birthdayCakeCandles(candles);
        System.out.println(result);
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int maxCount = 0;
        if(candles.size() > 1) {
            candles.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer integer, Integer t1) {
                    return integer.compareTo(t1);
                }
            });
            int max = candles.get(candles.size()-1);

            int i= candles.size()-1;
            while( i >=0 && candles.get(i).equals(max)) {
                maxCount++;
                i--;
            }
        } else if(candles.size() > 0) {
            maxCount = 1;
        }
        return maxCount;
    }
}
