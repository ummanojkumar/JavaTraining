package cheatShett.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        // Creating a PriorityQueue object
        Queue<String> priorityQueue = new PriorityQueue<>();

        // add() - Inserts the specified element into this queue
        priorityQueue.add("One");
        System.out.println("1. " + priorityQueue); // [One] -> Inserts the specified element into this queue

        // offer() - Inserts the specified element into this queue
        priorityQueue.offer("Two");
        System.out.println("2. " + priorityQueue); // [One, Two] -> Inserts the specified element into this queue

        // peek() - Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty
        String peek = priorityQueue.peek();
        System.out.println("3. " + peek); // One -> Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty

        // poll() - Retrieves and removes the head of this queue, or returns null if this queue is empty
        String poll = priorityQueue.poll();
        System.out.println("4. " + poll); // One -> Retrieves and removes the head of this queue, or returns null if this queue is empty
        System.out.println("5. " + priorityQueue); // [Two] -> Updated queue after poll operation

        // remove() - Retrieves and removes the head of this queue
        String remove = priorityQueue.remove();
        System.out.println("6. " + remove); // Two -> Retrieves and removes the head of this queue
        System.out.println("7. " + priorityQueue); // [] -> Updated queue after remove operation

        // isEmpty() - Returns true if this queue contains no elements
        boolean isEmpty = priorityQueue.isEmpty();
        System.out.println("8. " + isEmpty); // true -> Returns true if this queue contains no elements

        // size() - Returns the number of elements in this queue
        int size = priorityQueue.size();
        System.out.println("9. " + size); // 0 -> Returns the number of elements in this queue

        // clear() - Removes all the elements from this queue
        priorityQueue.clear();
        System.out.println("10. " + priorityQueue); // [] -> Removes all of the elements from this queue
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
