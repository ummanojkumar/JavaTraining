package cheatShett.data_type;

public class BooleanMethods {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        // Convert to Boolean object
        Boolean boolObj1 = Boolean.valueOf(b1); // ➡️ Converts primitive boolean to Boolean object
        Boolean boolObj2 = Boolean.valueOf("false"); // ➡️ Converts string to Boolean object
        System.out.println("1. Boolean object from boolean value: " + boolObj1);
        System.out.println("2. Boolean object from string: " + boolObj2);

        // Convert to primitive boolean
        boolean primitiveBool = boolObj1.booleanValue(); // ➡️ Converts Boolean object to primitive boolean
        System.out.println("3. Primitive boolean from Boolean object: " + primitiveBool);

        // Comparing two Boolean objects
        boolean isEqual = boolObj1.equals(boolObj2); // ➡️ Compares two Boolean objects
        System.out.println("4. Comparing two Boolean objects: " + isEqual);

        // Convert to string
        String boolString = Boolean.toString(b1); // ➡️ Converts primitive boolean to string
        System.out.println("5. String representation of boolean: " + boolString);

        // Hash code of Boolean object
        int hashCode = boolObj1.hashCode(); // ➡️ Returns the hash code for this Boolean object
        System.out.println("6. Hash code of Boolean object: " + hashCode);
    }

        /*
        1. Boolean object from boolean value: true
        2. Boolean object from string: false
        3. Primitive boolean from Boolean object: true
        4. Comparing two Boolean objects: false
        5. String representation of boolean: true
        6. Hash code of Boolean object: 1231
         */
}
