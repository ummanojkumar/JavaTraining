package cheatShett.data_type;

import java.math.BigInteger;

public class BigIntegerMethods {

    public static void main(String[] args) {
        // Initializing BigInteger objects
        BigInteger bigInteger1 = new BigInteger("12345678901234567890");
        BigInteger bigInteger2 = new BigInteger("98765432109876543210");

        // 1. Addition
        BigInteger sum = bigInteger1.add(bigInteger2); // ➡️ Adds two BigIntegers
        System.out.println("1. Sum: " + sum);

        // 2. Subtraction
        BigInteger difference = bigInteger1.subtract(bigInteger2); // ➡️ Subtracts one BigInteger from another
        System.out.println("2. Difference: " + difference);

        // 3. Multiplication
        BigInteger product = bigInteger1.multiply(bigInteger2); // ➡️ Multiplies two BigIntegers
        System.out.println("3. Product: " + product);

        // 4. Division
        BigInteger quotient = bigInteger1.divide(bigInteger2); // ➡️ Divides one BigInteger by another
        System.out.println("4. Quotient: " + quotient);

        // 5. Remainder
        BigInteger remainder = bigInteger1.remainder(bigInteger2); // ➡️ Returns the remainder of the division of the first BigInteger by the second
        System.out.println("5. Remainder: " + remainder);

        // 6. Comparison
        int comparisonResult = bigInteger1.compareTo(bigInteger2); // ➡️ Compares two BigIntegers
        System.out.println("6. Comparison Result: " + comparisonResult);

        /*
        1. Sum: 111111111011111111100
        2. Difference: -86419753208641975320
        3. Product: 1219326311370217952237463801111263526900
        4. Quotient: 0
        5. Remainder: 12345678901234567890
        6. Comparison Result: -1
         */
    }

}
