package cheatShett.data_type;

public class ShortMethods {
    public static void main(String[] args) {
        short s1 = 100;
        short s2 = 200;

        // Convert to Short object
        Short shortObj1 = Short.valueOf(s1); // ➡️ Converts primitive short to Short object
        Short shortObj2 = Short.valueOf("200"); // ➡️ Converts string to Short object
        System.out.println("1. Short object from short value: " + shortObj1);
        System.out.println("2. Short object from string: " + shortObj2);

        // Convert to primitive short
        short primitiveShort = shortObj1.shortValue(); // ➡️ Converts Short object to primitive short
        System.out.println("3. Primitive short from Short object: " + primitiveShort);

        // Comparing two Short objects
        int compareResult = shortObj1.compareTo(shortObj2); // ➡️ Compares two Short objects
        System.out.println("4. Comparing two Short objects: " + compareResult);

        // Parse string to short
        short parsedShort = Short.parseShort("300"); // ➡️ Parses string to primitive short
        System.out.println("5. Parsed short from string: " + parsedShort);

        // Convert to string
        String shortString = Short.toString(s1); // ➡️ Converts primitive short to string
        System.out.println("6. String representation of short: " + shortString);

        // Hash code of Short object
        int hashCode = shortObj1.hashCode(); // ➡️ Returns the hash code for this Short object
        System.out.println("7. Hash code of Short object: " + hashCode);

        // Maximum and Minimum values
        System.out.println("8. Short Max Value: " + Short.MAX_VALUE); // ➡️ Maximum value a short can have (32767)
        System.out.println("9. Short Min Value: " + Short.MIN_VALUE); // ➡️ Minimum value a short can have (-32768)

        // Short size in bits
        System.out.println("10. Short size in bits: " + Short.SIZE); // ➡️ Size of short in bits (16)

        // Short size in bytes
        System.out.println("11. Short size in bytes: " + Short.BYTES); // ➡️ Size of short in bytes (2)

        // Short binary representation
        System.out.println("12. Short binary representation: " + Integer.toBinaryString(s1 & 0xFFFF)); // ➡️ Binary string representation of a short
    }
    /*
    1. Short object from short value: 100
    2. Short object from string: 200
    3. Primitive short from Short object: 100
    4. Comparing two Short objects: -100
    5. Parsed short from string: 300
    6. String representation of short: 100
    7. Hash code of Short object: 100
    8. Short Max Value: 32767
    9. Short Min Value: -32768
    10. Short size in bits: 16
    11. Short size in bytes: 2
    12. Short binary representation: 1100100

     */
}
