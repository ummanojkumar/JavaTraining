package cheatShett.collections.set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        // Creating a LinkedHashSet object
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // add() - Adds the specified element to this set if it is not already present
        linkedHashSet.add("One");
        System.out.println("1. " + linkedHashSet); // [One] -> Adds the specified element to this set if it is not already present

        // addAll() - Adds all the elements in the specified collection to this set
        linkedHashSet.addAll(Arrays.asList("Two", "Three"));
        System.out.println("2. " + linkedHashSet); // [One, Two, Three] -> Adds all of the elements in the specified collection to this set

        // remove() - Removes the specified element from this set if it is present
        linkedHashSet.remove("Two");
        System.out.println("3. " + linkedHashSet); // [One, Three] -> Removes the specified element from this set if it is present

        // contains() - Returns true if this set contains the specified element
        boolean contains = linkedHashSet.contains("Three");
        System.out.println("4. " + contains); // true -> Returns true if this set contains the specified element

        // size() - Returns the number of elements in this set
        int size = linkedHashSet.size();
        System.out.println("5. " + size); // 2 -> Returns the number of elements in this set

        // isEmpty() - Returns true if this set contains no elements
        boolean isEmpty = linkedHashSet.isEmpty();
        System.out.println("6. " + isEmpty); // false -> Returns true if this set contains no elements

        // iterator() - Returns an iterator over the elements in this set
        Iterator<String> iterator = linkedHashSet.iterator();
        System.out.print("7. ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(); // One Three -> Returns an iterator over the elements in this set

        // clear() - Removes all of the elements from this set
        linkedHashSet.clear();
        System.out.println("8. " + linkedHashSet); // [] -> Removes all of the elements from this set
    }
    /*
    1. [One]
    2. [One, Two, Three]
    3. [One, Three]
    4. true
    5. 2
    6. false
    7. One Three
    8. []

     */
}
