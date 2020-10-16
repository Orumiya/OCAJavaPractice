package text_date_time_numeric_objects;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MethodChainingTest {
    public MethodChainingTest() {
        System.out.println("Method chaining test");
        String h1 = "Hello";
        String h2 = h1.concat("World").toUpperCase().substring(3,7).concat(" ");
        System.out.println(h2);

        BigDecimal price = BigDecimal.valueOf(100.456);
        BigDecimal taxRate = BigDecimal.valueOf(0.27);
        BigDecimal tax = price.multiply(taxRate);
        BigDecimal brPrice = price.add(tax).setScale(2, RoundingMode.HALF_DOWN);
        System.out.println(brPrice);
    }
}
