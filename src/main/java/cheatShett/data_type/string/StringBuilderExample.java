package cheatShett.data_type.string;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Creating a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // append()
        sb.append(" World");
        System.out.println("1. " + sb); // "Hello World" -> Appends the specified string to this character sequence

        // insert()
        sb.insert(6, "Beautiful ");
        System.out.println("2. " + sb); // "Hello Beautiful World" -> Inserts the specified string at the specified position

        // replace()
        sb.replace(6, 15, "Amazing");
        System.out.println("3. " + sb); // "Hello Amazing World" -> Replaces the characters in a substring of this sequence with characters in the specified String

        // delete()
        sb.delete(5, 13);
        System.out.println("4. " + sb); // "Hello World" -> Removes the characters in a substring of this sequence

        // deleteCharAt()
        sb.deleteCharAt(5);
        System.out.println("5. " + sb); // "HelloWorld" -> Removes the character at the specified position

        // reverse()
        sb.reverse();
        System.out.println("6. " + sb); // "dlroWolleH" -> Reverses the sequence of characters

        // setCharAt()
        sb.setCharAt(0, 'H');
        System.out.println("7. " + sb); // "HlroWolleH" -> Sets the character at the specified position

        // charAt()
        char ch = sb.charAt(1);
        System.out.println("8. " + ch); // 'l' -> Returns the char value at the specified index

        // length()
        int len = sb.length();
        System.out.println("9. " + len); // 10 -> Returns the length of the character sequence

        // capacity()
        int cap = sb.capacity();
        System.out.println("10. " + cap); // 26 (initially 16 + length of "Hello") -> Returns the current capacity of the StringBuilder

        // ensureCapacity()
        sb.ensureCapacity(50);
        System.out.println("11. " + sb.capacity()); // 50 -> Ensures that the capacity is at least equal to the specified minimum

        // trimToSize()
        sb.trimToSize();
        System.out.println("12. " + sb.capacity()); // 10 -> Trims the capacity to the current length

        // substring()
        String substr = sb.substring(0, 5);
        System.out.println("13. " + substr); // "HlroW" -> Returns a new String that contains a subsequence of characters currently contained in this character sequence

        // indexOf()
        int index = sb.indexOf("o");
        System.out.println("14. " + index); // 3 -> Returns the index within this string of the first occurrence of the specified substring

        // lastIndexOf()
        int lastIndex = sb.lastIndexOf("l");
        System.out.println("15. " + lastIndex); // 8 -> Returns the index within this string of the last occurrence of the specified substring
    }

    /*
    1. Hello World
    2. Hello Beautiful World
    3. Hello Amazing World
    4. Hello World
    5. HelloWorld
    6. dlroWolleH
    7. HlroWolleH
    8. l
    9. 10
    10. 21
    11. 50
    12. 10
    13. HlroW
    14. 3
    15. 7

     */

}
