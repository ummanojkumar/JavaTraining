package cheatShett.others;

public class MathExample {


    public static void main(String[] args) {
        // 1. abs - absolute value
        int absValue = Math.abs(-10);
        System.out.println("1. abs - absolute value: " + absValue); // Output: 10

        // 2. max - maximum of two values
        int maxValue = Math.max(5, 10);
        System.out.println("2. max - maximum of two values: " + maxValue); // Output: 10

        // 3. min - minimum of two values
        int minValue = Math.min(5, 10);
        System.out.println("3. min - minimum of two values: " + minValue); // Output: 5

        // 4. sqrt - square root
        double sqrtValue = Math.sqrt(16);
        System.out.println("4. sqrt - square root: " + sqrtValue); // Output: 4.0

        // 5. pow - power of a number
        double powerValue = Math.pow(2, 3);
        System.out.println("5. pow - power of a number: " + powerValue); // Output: 8.0

        // 6. round - round a number
        long roundedValue = Math.round(4.6);
        System.out.println("6. round - round a number: " + roundedValue); // Output: 5

        // 7. ceil - ceiling of a number
        double ceilValue = Math.ceil(4.1);
        System.out.println("7. ceil - ceiling of a number: " + ceilValue); // Output: 5.0

        // 8. floor - floor of a number
        double floorValue = Math.floor(4.9);
        System.out.println("8. floor - floor of a number: " + floorValue); // Output: 4.0

        // 9. random - random number between 0.0 and 1.0
        double randomValue = Math.random();
        System.out.println("9. random - random number between 0.0 and 1.0: " + randomValue); // Output: (example output, actual output may vary)

        // 10. exp - exponent of a number
        double expValue = Math.exp(1);
        System.out.println("10. exp - exponent of a number: " + expValue); // Output: 2.718281828459045

        // 11. log - natural logarithm of a number
        double logValue = Math.log(2.718281828459045);
        System.out.println("11. log - natural logarithm of a number: " + logValue); // Output: 1.0

        // 12. sin - sine of an angle
        double sinValue = Math.sin(Math.toRadians(30));
        System.out.println("12. sin - sine of an angle: " + sinValue); // Output: 0.5

        // 13. cos - cosine of an angle
        double cosValue = Math.cos(Math.toRadians(60));
        System.out.println("13. cos - cosine of an angle: " + cosValue); // Output: 0.5

        // 14. tan - tangent of an angle
        double tanValue = Math.tan(Math.toRadians(45));
        System.out.println("14. tan - tangent of an angle: " + tanValue); // Output: 1.0

        // 15. asin - arc sine of a value
        double asinValue = Math.toDegrees(Math.asin(0.5));
        System.out.println("15. asin - arc sine of a value: " + asinValue); // Output: 30.0

        // 16. acos - arc cosine of a value
        double acosValue = Math.toDegrees(Math.acos(0.5));
        System.out.println("16. acos - arc cosine of a value: " + acosValue); // Output: 60.0

        // 17. atan - arc tangent of a value
        double atanValue = Math.toDegrees(Math.atan(1));
        System.out.println("17. atan - arc tangent of a value: " + atanValue); // Output: 45.0

        // 18. sinh - hyperbolic sine of a value
        double sinhValue = Math.sinh(1);
        System.out.println("18. sinh - hyperbolic sine of a value: " + sinhValue); // Output: 1.1752011936438014

        // 19. cosh - hyperbolic cosine of a value
        double coshValue = Math.cosh(1);
        System.out.println("19. cosh - hyperbolic cosine of a value: " + coshValue); // Output: 1.5430806348152437

        // 20. tanh - hyperbolic tangent of a value
        double tanhValue = Math.tanh(1);
        System.out.println("20. tanh - hyperbolic tangent of a value: " + tanhValue); // Output: 0.7615941559557649
    }
    /*
    1. abs - absolute value: 10
    2. max - maximum of two values: 10
    3. min - minimum of two values: 5
    4. sqrt - square root: 4.0
    5. pow - power of a number: 8.0
    6. round - round a number: 5
    7. ceil - ceiling of a number: 5.0
    8. floor - floor of a number: 4.0
    9. random - random number between 0.0 and 1.0: 0.02988300848039316
    10. exp - exponent of a number: 2.718281828459045
    11. log - natural logarithm of a number: 1.0
    12. sin - sine of an angle: 0.49999999999999994
    13. cos - cosine of an angle: 0.5000000000000001
    14. tan - tangent of an angle: 0.9999999999999999
    15. asin - arc sine of a value: 30.000000000000004
    16. acos - arc cosine of a value: 60.00000000000001
    17. atan - arc tangent of a value: 45.0
    18. sinh - hyperbolic sine of a value: 1.1752011936438014
    19. cosh - hyperbolic cosine of a value: 1.543080634815244
    20. tanh - hyperbolic tangent of a value: 0.7615941559557649
     */
}
