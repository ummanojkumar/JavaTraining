package cheatShett.data_type;

public class LongMethods {
    public static void main(String[] args) {
        long l1 = 100000L;
        long l2 = 200000L;

        // Convert to Long object
        Long longObj1 = Long.valueOf(l1); // ➡️ Converts primitive long to Long object
        Long longObj2 = Long.valueOf("200000"); // ➡️ Converts string to Long object
        System.out.println("1. Long object from long value: " + longObj1);
        System.out.println("2. Long object from string: " + longObj2);

        // Convert to primitive long
        long primitiveLong = longObj1.longValue(); // ➡️ Converts Long object to primitive long
        System.out.println("3. Primitive long from Long object: " + primitiveLong);

        // Comparing two Long objects
        int compareResult = longObj1.compareTo(longObj2); // ➡️ Compares two Long objects
        System.out.println("4. Comparing two Long objects: " + compareResult);

        // Parse string to long
        long parsedLong = Long.parseLong("300000"); // ➡️ Parses string to primitive long
        System.out.println("5. Parsed long from string: " + parsedLong);

        // Convert to string
        String longString = Long.toString(l1); // ➡️ Converts primitive long to string
        System.out.println("6. String representation of long: " + longString);

        // Hash code of Long object
        int hashCode = longObj1.hashCode(); // ➡️ Returns the hash code for this Long object
        System.out.println("7. Hash code of Long object: " + hashCode);

        // Maximum and Minimum values
        System.out.println("8. Long Max Value: " + Long.MAX_VALUE); // ➡️ Maximum value a long can have
        System.out.println("9. Long Min Value: " + Long.MIN_VALUE); // ➡️ Minimum value a long can have

        // Long size in bits
        System.out.println("10. Long size in bits: " + Long.SIZE); // ➡️ Size of long in bits

        // Long size in bytes
        System.out.println("11. Long size in bytes: " + Long.BYTES); // ➡️ Size of long in bytes

        // Long binary representation
        System.out.println("12. Long binary representation: " + Long.toBinaryString(l1)); // ➡️ Binary string representation of a long
    }

    /*
    1. Long object from long value: 100000
    2. Long object from string: 200000
    3. Primitive long from Long object: 100000
    4. Comparing two Long objects: -1
    5. Parsed long from string: 300000
    6. String representation of long: 100000
    7. Hash code of Long object: 100000
    8. Long Max Value: 9223372036854775807
    9. Long Min Value: -9223372036854775808
    10. Long size in bits: 64
    11. Long size in bytes: 8
    12. Long binary representation: 11000011010100000
     */

}
