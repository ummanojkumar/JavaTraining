package cheatShett.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {


    public static void main(String[] args) {
        // Creating a LinkedList object
        Queue<String> queue = new LinkedList<>();

        // add() - Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions
        queue.add("One");
        System.out.println("1. " + queue); // [One] -> Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions

        // offer() - Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions
        queue.offer("Two");
        System.out.println("2. " + queue); // [One, Two] -> Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions

        // peek() - Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty
        String peek = queue.peek();
        System.out.println("3. " + peek); // One -> Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty

        // poll() - Retrieves and removes the head of this queue, or returns null if this queue is empty
        String poll = queue.poll();
        System.out.println("4. " + poll); // One -> Retrieves and removes the head of this queue, or returns null if this queue is empty
        System.out.println("5. " + queue); // [Two] -> Updated queue after poll operation

        // remove() - Retrieves and removes the head of this queue
        String remove = queue.remove();
        System.out.println("6. " + remove); // Two -> Retrieves and removes the head of this queue
        System.out.println("7. " + queue); // [] -> Updated queue after remove operation

        // isEmpty() - Returns true if this queue contains no elements
        boolean isEmpty = queue.isEmpty();
        System.out.println("8. " + isEmpty); // true -> Returns true if this queue contains no elements

        // size() - Returns the number of elements in this queue
        int size = queue.size();
        System.out.println("9. " + size); // 0 -> Returns the number of elements in this queue

        // clear() - Removes all the elements from this queue
        queue.clear();
        System.out.println("10. " + queue); // [] -> Removes all of the elements from this queue
    }
    /*
    1. [One]
    2. [One, Two]
    3. One
    4. One
    5. [Two]
    6. Two
    7. []
    8. true
    9. 0
    10. []
     */
}
