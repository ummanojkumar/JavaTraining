package cheatShett.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeQueueExample {

    public static void main(String[] args) {
        // Creating an ArrayDeque object
        Deque<String> deque = new ArrayDeque<>();

        // add() - Inserts the specified element at the end of this deque
        deque.add("One");
        System.out.println("1. " + deque); // [One] -> Inserts the specified element at the end of this deque

        // offer() - Inserts the specified element at the end of this deque
        deque.offer("Two");
        System.out.println("2. " + deque); // [One, Two] -> Inserts the specified element at the end of this deque

        // addFirst() - Inserts the specified element at the front of this deque
        deque.addFirst("Zero");
        System.out.println("3. " + deque); // [Zero, One, Two] -> Inserts the specified element at the front of this deque

        // addLast() - Inserts the specified element at the end of this deque
        deque.addLast("Three");
        System.out.println("4. " + deque); // [Zero, One, Two, Three] -> Inserts the specified element at the end of this deque

        // peek() - Retrieves, but does not remove, the head of this deque
        String peek = deque.peek();
        System.out.println("5. " + peek); // Zero -> Retrieves, but does not remove, the head of this deque

        // peekFirst() - Retrieves, but does not remove, the first element of this deque
        String peekFirst = deque.peekFirst();
        System.out.println("6. " + peekFirst); // Zero -> Retrieves, but does not remove, the first element of this deque

        // peekLast() - Retrieves, but does not remove, the last element of this deque
        String peekLast = deque.peekLast();
        System.out.println("7. " + peekLast); // Three -> Retrieves, but does not remove, the last element of this deque

        // poll() - Retrieves and removes the head of this deque
        String poll = deque.poll();
        System.out.println("8. " + poll); // Zero -> Retrieves and removes the head of this deque
        System.out.println("9. " + deque); // [One, Two, Three] -> Updated deque after poll operation

        // pollFirst() - Retrieves and removes the first element of this deque
        String pollFirst = deque.pollFirst();
        System.out.println("10. " + pollFirst); // One -> Retrieves and removes the first element of this deque
        System.out.println("11. " + deque); // [Two, Three] -> Updated deque after pollFirst operation

        // pollLast() - Retrieves and removes the last element of this deque
        String pollLast = deque.pollLast();
        System.out.println("12. " + pollLast); // Three -> Retrieves and removes the last element of this deque
        System.out.println("13. " + deque); // [Two] -> Updated deque after pollLast operation

        // remove() - Retrieves and removes the head of this deque
        String remove = deque.remove();
        System.out.println("14. " + remove); // Two -> Retrieves and removes the head of this deque
        System.out.println("15. " + deque); // [] -> Updated deque after remove operation

        // isEmpty() - Returns true if this deque contains no elements
        boolean isEmpty = deque.isEmpty();
        System.out.println("16. " + isEmpty); // true -> Returns true if this deque contains no elements

        // size() - Returns the number of elements in this deque
        int size = deque.size();
        System.out.println("17. " + size); // 0 -> Returns the number of elements in this deque

        // clear() - Removes all the elements from this deque
        deque.clear();
        System.out.println("18. " + deque); // [] -> Removes all of the elements from this deque
    }
    /*
    1. [One]
    2. [One, Two]
    3. [Zero, One, Two]
    4. [Zero, One, Two, Three]
    5. Zero
    6. Zero
    7. Three
    8. Zero
    9. [One, Two, Three]
    10. One
    11. [Two, Three]
    12. Three
    13. [Two]
    14. Two
    15. []
    16. true
    17. 0
    18. []

     */
}
