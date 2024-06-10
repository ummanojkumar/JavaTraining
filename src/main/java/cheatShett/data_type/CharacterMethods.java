package cheatShett.data_type;

public class CharacterMethods {
    public static void main(String[] args) {
        char c = 'A';

        // Convert to Character object
        Character charObj = Character.valueOf(c); // ➡️ Converts primitive char to Character object
        System.out.println("1. Character object from char value: " + charObj);

        // Convert to primitive char
        char primitiveChar = charObj.charValue(); // ➡️ Converts Character object to primitive char
        System.out.println("2. Primitive char from Character object: " + primitiveChar);

        // Comparing two Character objects
        int compareResult = charObj.compareTo('B'); // ➡️ Compares two Character objects
        System.out.println("3. Comparing Character object with another char: " + compareResult);

        // Convert to string
        String charString = Character.toString(c); // ➡️ Converts primitive char to string
        System.out.println("4. String representation of char: " + charString);

        // Hash code of Character object
        int hashCode = charObj.hashCode(); // ➡️ Returns the hash code for this Character object
        System.out.println("5. Hash code of Character object: " + hashCode);
    }
        /*
            1. Character object from char value: A
            2. Primitive char from Character object: A
            3. Comparing Character object with another char: -1
            4. String representation of char: A
            5. Hash code of Character object: 65
         */

}
