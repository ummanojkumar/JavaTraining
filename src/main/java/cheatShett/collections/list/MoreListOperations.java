package cheatShett.collections.list;

import java.util.ArrayList;
import java.util.List;

public class MoreListOperations {

    public static void main(String[] args) {

        // Sample list of strings
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Emily");

        // 1. forEach - Print all names
        System.out.println("1. Original names:");
        names.forEach(name -> System.out.println(name));

        // 2. removeIf - Remove names starting with 'D'
        names.removeIf(name -> name.startsWith("D"));
        System.out.println("\n2. After removing names starting with 'D':");
        names.forEach(name -> System.out.println(name));

        // 3. replaceAll - Convert names to uppercase
        names.replaceAll(name -> name.toUpperCase());
        System.out.println("\n3. After converting names to uppercase:");
        names.forEach(name -> System.out.println(name));
    }

    /*
    1. Original names:
    Alice
    Bob
    Charlie
    David
    Emily

    2. After removing names starting with 'D':
    Alice
    Bob
    Charlie
    Emily

    3. After converting names to uppercase:
    ALICE
    BOB
    CHARLIE
    EMILY

     */
}
