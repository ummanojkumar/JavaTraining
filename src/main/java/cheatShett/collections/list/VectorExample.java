package cheatShett.collections.list;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        // Creating a Vector object
        Vector<String> vector = new Vector<>();

        // add() - Adds an element to the end of the vector
        vector.add("Element 1");
        System.out.println("1. " + vector); // [Element 1] -> Adds an element to the end of the vector

        // addElement() - Adds an element to the end of the vector
        vector.addElement("Element 2");
        System.out.println("2. " + vector); // [Element 1, Element 2] -> Adds an element to the end of the vector

        // add(index, element) - Inserts the element at the specified position
        vector.add(1, "Element 3");
        System.out.println("3. " + vector); // [Element 1, Element 3, Element 2] -> Inserts the element at the specified position

        // addAll(Collection) - Adds all the elements in the specified collection to the end of the vector
        Vector<String> newElements = new Vector<>();
        newElements.add("Element 4");
        newElements.add("Element 5");
        vector.addAll(newElements);
        System.out.println("4. " + vector); // [Element 1, Element 3, Element 2, Element 4, Element 5] -> Adds all the elements in the specified collection to the end of the vector

        // addAll(index, Collection) - Inserts all the elements in the specified collection into the vector at the specified position
        vector.addAll(2, newElements);
        System.out.println("5. " + vector); // [Element 1, Element 3, Element 4, Element 5, Element 2, Element 4, Element 5] -> Inserts all the elements in the specified collection into the vector at the specified position

        // get() - Returns the element at the specified position
        String element = vector.get(3);
        System.out.println("6. " + element); // Element 5 -> Returns the element at the specified position

        // set() - Replaces the element at the specified position with the specified element
        vector.set(3, "Element 6");
        System.out.println("7. " + vector); // [Element 1, Element 3, Element 4, Element 6, Element 2, Element 4, Element 5] -> Replaces the element at the specified position with the specified element

        // remove() - Removes the element at the specified position
        vector.remove(2);
        System.out.println("8. " + vector); // [Element 1, Element 3, Element 6, Element 2, Element 4, Element 5] -> Removes the element at the specified position

        // remove(Object) - Removes the first occurrence of the specified element from this vector
        vector.remove("Element 2");
        System.out.println("9. " + vector); // [Element 1, Element 3, Element 6, Element 4, Element 5] -> Removes the first occurrence of the specified element from this vector

        // removeElementAt() - Removes the element at the specified position
        vector.removeElementAt(1);
        System.out.println("10. " + vector); // [Element 1, Element 6, Element 4, Element 5] -> Removes the element at the specified position

        // removeAll() - Removes all of the elements from this vector
        vector.clear();
        System.out.println("11. " + vector); // [] -> Removes all of the elements from this vector

        // contains() - Returns true if this vector contains the specified element
        vector.add("Element 7");
        boolean contains = vector.contains("Element 7");
        System.out.println("12. " + contains); // true -> Returns true if this vector contains the specified element

        // indexOf() - Returns the index of the first occurrence of the specified element in this vector
        int index = vector.indexOf("Element 7");
        System.out.println("13. " + index); // 0 -> Returns the index of the first occurrence of the specified element in this vector

        // size() - Returns the number of elements in this vector
        int size = vector.size();
        System.out.println("14. " + size); // 1 -> Returns the number of elements in this vector

        // isEmpty() - Returns true if this vector contains no elements
        boolean isEmpty = vector.isEmpty();
        System.out.println("15. " + isEmpty); // false -> Returns true if this vector contains no elements

        // capacity() - Returns the current capacity of this vector
        int capacity = vector.capacity();
        System.out.println("16. " + capacity); // 10 -> Returns the current capacity of this vector

        // ensureCapacity() - Increases the capacity of this vector, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument
        vector.ensureCapacity(20);
        System.out.println("17. " + vector.capacity()); // 20 -> Increases the capacity of this vector, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument

        // trimToSize() - Trims the capacity of this vector to be the vector's current size
        vector.trimToSize();
        System.out.println("18. " + vector.capacity()); // 1 -> Trims the capacity of this vector to be the vector's current size

        // elementAt() - Returns the component at the specified index
        String elementAt = vector.elementAt(0);
        System.out.println("19. " + elementAt); // "Element 7" -> Returns the component at the specified index

        // firstElement() - Returns the first component (the item at index 0) of this vector
        String firstElement = vector.firstElement();
        System.out.println("20. " + firstElement); // "Element 7" -> Returns the first component (the item at index 0) of this vector

        // lastElement() - Returns the last component of the vector
        String lastElement = vector.lastElement();
        System.out.println("21. " + lastElement); // "Element 7" -> Returns the last component of the vector
    }
    /*
    1. [Element 1]
    2. [Element 1, Element 2]
    3. [Element 1, Element 3, Element 2]
    4. [Element 1, Element 3, Element 2, Element 4, Element 5]
    5. [Element 1, Element 3, Element 4, Element 5, Element 2, Element 4, Element 5]
    6. Element 5
    7. [Element 1, Element 3, Element 4, Element 6, Element 2, Element 4, Element 5]
    8. [Element 1, Element 3, Element 6, Element 2, Element 4, Element 5]
    9. [Element 1, Element 3, Element 6, Element 4, Element 5]
    10. [Element 1, Element 6, Element 4, Element 5]
    11. []
    12. true
    13. 0
    14. 1
    15. false
    16. 10
    17. 20
    18. 1
    19. Element 7
    20. Element 7
    21. Element 7
     */

}
