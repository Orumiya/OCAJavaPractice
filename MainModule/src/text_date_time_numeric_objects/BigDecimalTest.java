package text_date_time_numeric_objects;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {
    public BigDecimalTest() {
        System.out.println("Big Decimal (immutable object)");
        BigDecimal price = BigDecimal.valueOf(12.23);
        BigDecimal taxRate = BigDecimal.valueOf(0.27);
        BigDecimal tax = price.multiply(taxRate);
        System.out.println("tax: " + tax); // tax: 3.3021
        BigDecimal priceRound = price.add(tax).setScale(2, RoundingMode.HALF_UP);
        System.out.println("price: 2, (RoundingMode.HALF_UP)" + priceRound); // price: 15.53
        priceRound = price.add(tax).setScale(2, RoundingMode.HALF_DOWN);
        System.out.println("price: 2, (RoundingMode.HALF_DOWN)" + priceRound); // price: 15.53
        // priceRound = price.add(tax).setScale(3); // ArithmeticException: Rounding necessary
        priceRound = price.add(tax).setScale(3, RoundingMode.FLOOR);
        System.out.println("price: 3, (RoundingMode.FLOOR)" + priceRound);

        // further arithmetic operations:
        price = price.multiply(tax);
        price = price.divide(tax);
        price = price.subtract(tax);
        price = price.remainder(tax);

    }
}
