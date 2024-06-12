package cheatShett.collections.stack;

import java.util.Stack;

public class StackExample {


    public static void main(String[] args) {
        // Creating a Stack object
        Stack<String> stack = new Stack<>();

        // push() - Pushes an item onto the top of this stack
        stack.push("One");
        System.out.println("1. " + stack); // [One] -> Pushes an item onto the top of this stack

        // push() - Pushes another item onto the top of this stack
        stack.push("Two");
        System.out.println("2. " + stack); // [One, Two] -> Pushes another item onto the top of this stack

        // pop() - Removes the object at the top of this stack and returns that object as the value of this function
        String pop = stack.pop();
        System.out.println("3. " + pop); // Two -> Removes the object at the top of this stack and returns that object as the value of this function
        System.out.println("4. " + stack); // [One] -> Updated stack after pop operation

        // peek() - Looks at the object at the top of this stack without removing it from the stack
        String peek = stack.peek();
        System.out.println("5. " + peek); // One -> Looks at the object at the top of this stack without removing it from the stack

        // search() - Returns the 1-based position where an object is on this stack
        int position = stack.search("One");
        System.out.println("6. " + position); // 1 -> Returns the 1-based position where an object is on this stack

        // isEmpty() - Tests if this stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("7. " + isEmpty); // false -> Tests if this stack is empty

        // size() - Returns the number of elements in this stack
        int size = stack.size();
        System.out.println("8. " + size); // 1 -> Returns the number of elements in this stack

        // clear() - Removes all of the elements from this stack
        stack.clear();
        System.out.println("9. " + stack); // [] -> Removes all of the elements from this stack

        // push() - Pushes new items onto the stack for further operations
        stack.push("Three");
        stack.push("Four");
        System.out.println("10. " + stack); // [Three, Four] -> Pushes new items onto the stack for further operations

        // contains() - Returns true if this stack contains the specified element
        boolean contains = stack.contains("Three");
        System.out.println("11. " + contains); // true -> Returns true if this stack contains the specified element

        // get() - Returns the element at the specified position in this stack (index-based, with 0 being the bottom of the stack)
        String element = stack.get(0);
        System.out.println("12. " + element); // Three -> Returns the element at the specified position in this stack

        // set() - Replaces the element at the specified position in this stack with the specified element
        stack.set(0, "Five");
        System.out.println("13. " + stack); // [Five, Four] -> Replaces the element at the specified position in this stack with the specified element
    }
    /*
    1. [One]
    2. [One, Two]
    3. Two
    4. [One]
    5. One
    6. 1
    7. false
    8. 1
    9. []
    10. [Three, Four]
    11. true
    12. Three
    13. [Five, Four]
     */
}
