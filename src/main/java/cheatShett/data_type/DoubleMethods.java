package cheatShett.data_type;

public class DoubleMethods {
    public static void main(String[] args) {
        double d1 = 10.5;
        double d2 = 20.5;

        // Convert to Double object
        Double doubleObj1 = Double.valueOf(d1); // ➡️ Converts primitive double to Double object
        Double doubleObj2 = Double.valueOf("20.5"); // ➡️ Converts string to Double object
        System.out.println("1. Double object from double value: " + doubleObj1);
        System.out.println("2. Double object from string: " + doubleObj2);

        // Convert to primitive double
        double primitiveDouble = doubleObj1.doubleValue(); // ➡️ Converts Double object to primitive double
        System.out.println("3. Primitive double from Double object: " + primitiveDouble);

        // Comparing two Double objects
        int compareResult = doubleObj1.compareTo(doubleObj2); // ➡️ Compares two Double objects
        System.out.println("4. Comparing two Double objects: " + compareResult);

        // Parse string to double
        double parsedDouble = Double.parseDouble("30.5"); // ➡️ Parses string to primitive double
        System.out.println("5. Parsed double from string: " + parsedDouble);

        // Convert to string
        String doubleString = Double.toString(d1); // ➡️ Converts primitive double to string
        System.out.println("6. String representation of double: " + doubleString);

        // Hash code of Double object
        int hashCode = doubleObj1.hashCode(); // ➡️ Returns the hash code for this Double object
        System.out.println("7. Hash code of Double object: " + hashCode);

        // Maximum and Minimum values
        System.out.println("8. Double Max Value: " + Double.MAX_VALUE); // ➡️ Maximum value a double can have
        System.out.println("9. Double Min Value: " + Double.MIN_VALUE); // ➡️ Minimum value a double can have

        // Double size in bits
        System.out.println("10. Double size in bits: " + Double.SIZE); // ➡️ Size of double in bits

        // Double size in bytes
        System.out.println("11. Double size in bytes: " + Double.BYTES); // ➡️ Size of double in bytes

        // Double binary representation
        System.out.println("12. Double binary representation: " + Long.toBinaryString(Double.doubleToLongBits(d1))); // ➡️ Binary string representation of a double
    }

    /*
    1. Double object from double value: 10.5
    2. Double object from string: 20.5
    3. Primitive double from Double object: 10.5
    4. Comparing two Double objects: -1
    5. Parsed double from string: 30.5
    6. String representation of double: 10.5
    7. Hash code of Double object: 1076166656
    8. Double Max Value: 1.7976931348623157E308
    9. Double Min Value: 4.9E-324
    10. Double size in bits: 64
    11. Double size in bytes: 8
    12. Double binary representation: 100000000100101000000000000000000000000000000000000000000000000

     */

}
