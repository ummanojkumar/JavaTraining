package cheatShett.data_type;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String anotherStr = "hello, world!";

        // Basic Methods
        System.out.println("1 Character at index 1: " + str.charAt(1)); // 'e'
        System.out.println("2 Length of the string: " + str.length()); // 13
        System.out.println("3 Substring from index 7: " + str.substring(7)); // "World!"
        System.out.println("4 Substring from index 7 to 12: " + str.substring(7, 12)); // "World"
        System.out.println("5 Index of 'W': " + str.indexOf('W')); // 7
        System.out.println("6 Does it contain 'World'? " + str.contains("World")); // true
        System.out.println("7 Starts with 'Hello'? " + str.startsWith("Hello")); // true
        System.out.println("Ends with '!'? " + str.endsWith("!")); // true
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java")); // "Hello, Java!"
        System.out.println("8 Convert to lower case: " + str.toLowerCase()); // "hello, world!"
        System.out.println("9 Convert to upper case: " + str.toUpperCase()); // "HELLO, WORLD!"
        System.out.println("10 Trimmed string: " + "   Hello, World!   ".trim()); // "Hello, World!"
        System.out.println("11 Is empty: " + "".isEmpty()); // true
        System.out.println("12 Compare to 'hello, world!': " + str.compareTo(anotherStr)); // Compare lexicographically
        System.out.println("Compare to 'hello, world!' ignoring case: " + str.compareToIgnoreCase(anotherStr)); // 0 (ignores case)
        System.out.println("Equals 'hello, world!' ignoring case: " + str.equalsIgnoreCase(anotherStr)); // true
        System.out.println("13 Equals 'hello, world!': " + str.equals(anotherStr)); // false
        System.out.println("14 Hash code: " + str.hashCode()); // Unique hash code
        System.out.println("15 Concatenate ' How are you?': " + str.concat(" How are you?")); // "Hello, World! How are you?"
        System.out.println("16 Value of boolean true: " + String.valueOf(true)); // "true"
        System.out.println("17 Value of char 'a': " + String.valueOf('a')); // "a"
        System.out.println("18 Value of int 10: " + String.valueOf(10)); // "10"
        System.out.println("19 Value of double 10.5: " + String.valueOf(10.5)); // "10.5"

        // Advanced Methods
        System.out.println("10 Matches regex 'Hello, .*': " + str.matches("Hello, .*")); // true
        String[] splitStr = str.split(", ");
        System.out.println("Split by ', ':");
        for (String s : splitStr) {
            System.out.println(s); // "Hello" and "World!"
        }
        System.out.println("21 Join array elements: " + String.join(", ", splitStr)); // "Hello, World!"

        System.out.println("22 Replace first 'o' with 'O': " + str.replaceFirst("o", "O")); // "HellO, World!"
        System.out.println("23 Replace all 'o' with 'O': " + str.replaceAll("o", "O")); // "HellO, WOrld!"
        System.out.println("24 Region matches 'Hello': " + str.regionMatches(0, "Hello, Java!", 0, 5)); // true

        System.out.println("25 Interned string: " + str.intern()); // "Hello, World!"
        System.out.println("26 Code point at index 1: " + str.codePointAt(1)); // 101 (Unicode of 'e')
        System.out.println("27 Code point before index 1: " + str.codePointBefore(1)); // 72 (Unicode of 'H')
        System.out.println("28 Code point count from index 0 to 5: " + str.codePointCount(0, 5)); // 5

        char[] charArray = str.toCharArray();
        System.out.println("29 Convert to char array:");
        for (char c : charArray) {
            System.out.print(c + " "); // H e l l o ,   W o r l d !
        }
        System.out.println();

        char[] destinationArray = new char[5];
        str.getChars(0, 5, destinationArray, 0);
        System.out.println("30 Get chars from 0 to 5:");
        for (char c : destinationArray) {
            System.out.print(c + " "); // H e l l o
        }
        System.out.println();

        String s = "    ";
        System.out.println("31 Is string blank: " + s.isBlank()); // true
    }

    /* #output
        1 Character at index 1: e
        2 Length of the string: 13
        3 Substring from index 7: World!
        4 Substring from index 7 to 12: World
        5 Index of 'W': 7
        6 Does it contain 'World'? true
        7 Starts with 'Hello'? true
        Ends with '!'? true
        Replace 'World' with 'Java': Hello, Java!
        8 Convert to lower case: hello, world!
        9 Convert to upper case: HELLO, WORLD!
        10 Trimmed string: Hello, World!
        11 Is empty: true
        12 Compare to 'hello, world!': -32
        Compare to 'hello, world!' ignoring case: 0
        Equals 'hello, world!' ignoring case: true
        13 Equals 'hello, world!': false
        14 Hash code: 1498789909
        15 Concatenate ' How are you?': Hello, World! How are you?
        16 Value of boolean true: true
        17 Value of char 'a': a
        18 Value of int 10: 10
        19 Value of double 10.5: 10.5
        10 Matches regex 'Hello, .*': true
        Split by ', ':
        Hello
        World!
        21 Join array elements: Hello, World!
        22 Replace first 'o' with 'O': HellO, World!
        23 Replace all 'o' with 'O': HellO, WOrld!
        24 Region matches 'Hello': true
        25 Interned string: Hello, World!
        26 Code point at index 1: 101
        27 Code point before index 1: 72
        28 Code point count from index 0 to 5: 5
        29 Convert to char array:
        H e l l o ,   W o r l d !
        30 Get chars from 0 to 5:
        H e l l o
        31 Is string blank: true

     */
}
