package cheatShett.data_type;

public class ByteMethods {

    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;

        // Convert to Byte object
        Byte byteObj1 = Byte.valueOf(b1); // ➡️ Converts primitive byte to Byte object
        Byte byteObj2 = Byte.valueOf("20"); // ➡️ Converts string to Byte object
        System.out.println("1. Byte object from byte value: " + byteObj1);
        System.out.println("2. Byte object from string: " + byteObj2);

        // Convert to primitive byte
        byte primitiveByte = byteObj1.byteValue(); // ➡️ Converts Byte object to primitive byte
        System.out.println("3. Primitive byte from Byte object: " + primitiveByte);

        // Comparing two Byte objects
        int compareResult = byteObj1.compareTo(byteObj2); // ➡️ Compares two Byte objects
        System.out.println("4. Comparing two Byte objects: " + compareResult);

        // Parse string to byte
        byte parsedByte = Byte.parseByte("30"); // ➡️ Parses string to primitive byte
        System.out.println("5. Parsed byte from string: " + parsedByte);

        // Convert to string
        String byteString = Byte.toString(b1); // ➡️ Converts primitive byte to string
        System.out.println("6. String representation of byte: " + byteString);

        // Hash code of Byte object
        int hashCode = byteObj1.hashCode(); // ➡️ Returns the hash code for this Byte object
        System.out.println("7. Hash code of Byte object: " + hashCode);

        // Maximum and Minimum values
        System.out.println("8. Byte Max Value: " + Byte.MAX_VALUE); // ➡️ Maximum value a byte can have (127)
        System.out.println("9. Byte Min Value: " + Byte.MIN_VALUE); // ➡️ Minimum value a byte can have (-128)

        // Byte size in bits
        System.out.println("10. Byte size in bits: " + Byte.SIZE); // ➡️ Size of byte in bits (8)

        // Byte size in bytes
        System.out.println("11. Byte size in bytes: " + Byte.BYTES); // ➡️ Size of byte in bytes (1)

        // Byte binary representation
        System.out.println("12. Byte binary representation: " + Integer.toBinaryString(b1 & 0xFF)); // ➡️ Binary string representation of a byte
    }

    /*
        1. Byte object from byte value: 10
        2. Byte object from string: 20
        3. Primitive byte from Byte object: 10
        4. Comparing two Byte objects: -10
        5. Parsed byte from string: 30
        6. String representation of byte: 10
        7. Hash code of Byte object: 10
        8. Byte Max Value: 127
        9. Byte Min Value: -128
        10. Byte size in bits: 8
        11. Byte size in bytes: 1
        12. Byte binary representation: 1010

     */

}
