package cheatShett.data_type;

public class FloatMethods {
    public static void main(String[] args) {
        float f1 = 10.5f;
        float f2 = 20.5f;

        // Convert to Float object
        Float floatObj1 = Float.valueOf(f1); // ➡️ Converts primitive float to Float object
        Float floatObj2 = Float.valueOf("20.5"); // ➡️ Converts string to Float object
        System.out.println("1. Float object from float value: " + floatObj1);
        System.out.println("2. Float object from string: " + floatObj2);

        // Convert to primitive float
        float primitiveFloat = floatObj1.floatValue(); // ➡️ Converts Float object to primitive float
        System.out.println("3. Primitive float from Float object: " + primitiveFloat);

        // Comparing two Float objects
        int compareResult = floatObj1.compareTo(floatObj2); // ➡️ Compares two Float objects
        System.out.println("4. Comparing two Float objects: " + compareResult);

        // Parse string to float
        float parsedFloat = Float.parseFloat("30.5"); // ➡️ Parses string to primitive float
        System.out.println("5. Parsed float from string: " + parsedFloat);

        // Convert to string
        String floatString = Float.toString(f1); // ➡️ Converts primitive float to string
        System.out.println("6. String representation of float: " + floatString);

        // Hash code of Float object
        int hashCode = floatObj1.hashCode(); // ➡️ Returns the hash code for this Float object
        System.out.println("7. Hash code of Float object: " + hashCode);

        // Maximum and Minimum values
        System.out.println("8. Float Max Value: " + Float.MAX_VALUE); // ➡️ Maximum value a float can have
        System.out.println("9. Float Min Value: " + Float.MIN_VALUE); // ➡️ Minimum value a float can have

        // Float size in bits
        System.out.println("10. Float size in bits: " + Float.SIZE); // ➡️ Size of float in bits

        // Float size in bytes
        System.out.println("11. Float size in bytes: " + Float.BYTES); // ➡️ Size of float in bytes

        // Float binary representation
        System.out.println("12. Float binary representation: " + Integer.toBinaryString(Float.floatToIntBits(f1))); // ➡️ Binary string representation of a float
    }

    /*
        1. Float object from float value: 10.5
        2. Float object from string: 20.5
        3. Primitive float from Float object: 10.5
        4. Comparing two Float objects: -1
        5. Parsed float from string: 30.5
        6. String representation of float: 10.5
        7. Hash code of Float object: 1093140480
        8. Float Max Value: 3.4028235E38
        9. Float Min Value: 1.4E-45
        10. Float size in bits: 32
        11. Float size in bytes: 4
        12. Float binary representation: 1000001001010000000000000000000

     */

}
