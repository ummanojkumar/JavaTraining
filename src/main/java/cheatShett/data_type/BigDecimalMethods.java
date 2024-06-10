package cheatShett.data_type;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalMethods {

    public static void main(String[] args) {
        // Initializing BigDecimal objects
        BigDecimal bigDecimal1 = new BigDecimal("123.456");
        BigDecimal bigDecimal2 = new BigDecimal("789.012");

        // 1. Addition
        BigDecimal sum = bigDecimal1.add(bigDecimal2); // ➡️ Adds two BigDecimals
        System.out.println("1. Sum: " + sum);

        // 2. Subtraction
        BigDecimal difference = bigDecimal1.subtract(bigDecimal2); // ➡️ Subtracts one BigDecimal from another
        System.out.println("2. Difference: " + difference);

        // 3. Multiplication
        BigDecimal product = bigDecimal1.multiply(bigDecimal2); // ➡️ Multiplies two BigDecimals
        System.out.println("3. Product: " + product);

        // 4. Division
        BigDecimal quotient = bigDecimal1.divide(bigDecimal2, 4, RoundingMode.HALF_UP); // ➡️ Divides one BigDecimal by another, with rounding
        System.out.println("4. Quotient: " + quotient);

        // 5. Comparison
        int comparisonResult = bigDecimal1.compareTo(bigDecimal2); // ➡️ Compares two BigDecimals
        System.out.println("5. Comparison Result: " + comparisonResult);
    }
    /*
    1. Sum: 912.468
    2. Difference: -665.556
    3. Product: 97408.265472
    4. Quotient: 0.1565
    5. Comparison Result: -1
     */

}
