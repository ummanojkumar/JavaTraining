package cheatShett.collections.set;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetExample {

    public static void main(String[] args) {
        // Creating a TreeSet object
        TreeSet<String> treeSet = new TreeSet<>();

        // add() - Adds the specified element to this set if it is not already present
        treeSet.add("One");
        System.out.println("1. " + treeSet); // [One] -> Adds the specified element to this set if it is not already present

        // addAll() - Adds all the elements in the specified collection to this set
        treeSet.addAll(Arrays.asList("Two", "Three"));
        System.out.println("2. " + treeSet); // [One, Three, Two] -> Adds all of the elements in the specified collection to this set

        // remove() - Removes the specified element from this set if it is present
        treeSet.remove("Two");
        System.out.println("3. " + treeSet); // [One, Three] -> Removes the specified element from this set if it is present

        // contains() - Returns true if this set contains the specified element
        boolean contains = treeSet.contains("Three");
        System.out.println("4. " + contains); // true -> Returns true if this set contains the specified element

        // size() - Returns the number of elements in this set
        int size = treeSet.size();
        System.out.println("5. " + size); // 2 -> Returns the number of elements in this set

        // isEmpty() - Returns true if this set contains no elements
        boolean isEmpty = treeSet.isEmpty();
        System.out.println("6. " + isEmpty); // false -> Returns true if this set contains no elements

        // iterator() - Returns an iterator over the elements in this set
        Iterator<String> iterator = treeSet.iterator();
        System.out.print("7. ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(); // One Three -> Returns an iterator over the elements in this set

        // first() - Returns the first (lowest) element currently in this set
        String first = treeSet.first();
        System.out.println("8. " + first); // One -> Returns the first (lowest) element currently in this set

        // last() - Returns the last (highest) element currently in this set
        String last = treeSet.last();
        System.out.println("9. " + last); // Three -> Returns the last (highest) element currently in this set

        // clear() - Removes all the elements from this set
        treeSet.clear();
        System.out.println("10. " + treeSet); // [] -> Removes all of the elements from this set
    }
    /*
    1. [One]
    2. [One, Three, Two]
    3. [One, Three]
    4. true
    5. 2
    6. false
    7. One Three
    8. One
    9. Three
    10. []

     */
}
