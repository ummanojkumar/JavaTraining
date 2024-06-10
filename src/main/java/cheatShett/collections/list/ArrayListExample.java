package cheatShett.collections.list;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding Elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("After adding elements in list: " + list);

        // Creating another ArrayList to add multiple elements
        List<String> anotherList = new ArrayList<>();
        anotherList.add("Grapes");
        anotherList.add("Mango");
        anotherList.add("Pineapple");
        System.out.println("After adding elements in anotherList : " + list);

        // Adding multiple elements using addAll() method
        list.addAll(anotherList);
        System.out.println("After adding multiple elements using addAll(): " + list);

        // Accessing Elements
        String element = list.get(1);
        System.out.println("Element at index 1: " + element);

        // Updating Elements
        list.set(0, "Grapes");
        System.out.println("After updating element at index 0: " + list);

        // Checking Size and Emptiness
        System.out.println("Size of the list: " + list.size());
        System.out.println("Is the list empty? " + list.isEmpty());

        // Searching and Querying
        System.out.println("Does the list contain 'Orange'? " + list.contains("Orange"));
        System.out.println("Index of 'Orange' in the list: " + list.indexOf("Orange"));

        // Iterating through Elements
        System.out.println("Iterating through the elements:");
        for (String item : list) {
            System.out.println(item);
        }

        // Iterating through elements using Iterator
        System.out.println("Iterating through elements using Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterating through elements using ListIterator
        System.out.println("Iterating through elements using ListIterator:");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Reversing the list
        System.out.println("Reversing the list:");
        List<String> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        System.out.println(reversedList);

//----------------------remove operations in list----------------------------------------------------------------------------------
        System.out.println();
        // Creating a list
        List<String> myList = new ArrayList<>();

        // Adding elements
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Banana");
        myList.add("Grapes");
        System.out.println("Original list: " + myList);

        // 1. Remove by Index
        // Remove the element at index 2
        myList.remove(2);
        System.out.println("After removing element at index 2: " + myList);

        // 2. Remove by Object
        // Remove the first occurrence of "Banana"
        myList.remove("Banana");
        System.out.println("After removing the first occurrence of 'Banana': " + myList);

        // 3. Remove All Occurrences
        // Remove all occurrences of "Banana"
        while (myList.contains("Banana")) {
            myList.remove("Banana");
        }
        System.out.println("After removing all occurrences of 'Banana': " + myList);

        // 4. Remove All Elements
        // Clear the list
        myList.clear();
        System.out.println("After clearing the list: " + myList);

        // Adding elements again for further operations
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Banana");
        myList.add("Grapes");

        // 5. Remove using Iterator
        // Remove elements containing 'a'
        Iterator<String> iteratorRemove = myList.iterator();
        while (iteratorRemove.hasNext()) {
            String elementRemove = iteratorRemove.next();
            if (elementRemove.contains("a")) {
                iteratorRemove.remove();
            }
        }
        System.out.println("After removing elements containing 'a': " + myList);

    }

}
