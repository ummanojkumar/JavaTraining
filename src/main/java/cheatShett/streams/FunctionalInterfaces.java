package cheatShett.streams;

import java.util.function.*;

public class FunctionalInterfaces {


    public static void main(String[] args) {
        // Predicate<T>
        Predicate<String> isLengthGreaterThan5 = s -> s.length() > 5;
        System.out.println("1. Is 'Hello' length > 5: " + isLengthGreaterThan5.test("Hello")); // false
        System.out.println("2. Is 'HelloWorld' length > 5: " + isLengthGreaterThan5.test("HelloWorld")); // true

        // Function<T, R>
        Function<String, Integer> stringLength = String::length; //s -> s.length();
        System.out.println("3. Length of 'Hello': " + stringLength.apply("Hello")); // 5
        System.out.println("4. Length of 'HelloWorld': " + stringLength.apply("HelloWorld")); // 10

        // Consumer<T>
        Consumer<String> printUpperCase = s -> System.out.println("5. Upper case: " + s.toUpperCase());
        printUpperCase.accept("hello"); // HELLO

        // Supplier<T>
        Supplier<String> helloSupplier = () -> "Hello, World!";
        System.out.println("6. Supplier result: " + helloSupplier.get()); // Hello, World!

        // UnaryOperator<T>
        UnaryOperator<String> addExclamation = s -> s + "!";
        System.out.println("7. Unary operator result: " + addExclamation.apply("Hello")); // Hello!

        // BinaryOperator<T>
        BinaryOperator<Integer> add = Integer::sum; //(a, b) -> a + b;
        System.out.println("8. Binary operator result: " + add.apply(5, 3)); // 8

        // BiPredicate<T, U>
        BiPredicate<String, String> isEqual = String::equals; //(s1, s2) -> s1.equals(s2);
        System.out.println("9. Are 'test' and 'test' equal: " + isEqual.test("test", "test")); // true
        System.out.println("10. Are 'test' and 'Test' equal: " + isEqual.test("test", "Test")); // false

        // BiFunction<T, U, R>
        BiFunction<String, String, Integer> combinedLength = (s1, s2) -> s1.length() + s2.length(); //(s1, s2) -> s1.length() + s2.length();
        System.out.println("11. Combined length of 'Hello' and 'World': " + combinedLength.apply("Hello", "World")); // 10

        // BiConsumer<T, U>
        BiConsumer<String, String> printConcatenated = (s1, s2) -> System.out.println("12. Concatenated: " + s1 + s2);
        printConcatenated.accept("Hello", "World"); // HelloWorld
    }

    /*
    1. Is 'Hello' length > 5: false
    2. Is 'HelloWorld' length > 5: true
    3. Length of 'Hello': 5
    4. Length of 'HelloWorld': 10
    5. Upper case: HELLO
    6. Supplier result: Hello, World!
    7. Unary operator result: Hello!
    8. Binary operator result: 8
    9. Are 'test' and 'test' equal: true
    10. Are 'test' and 'Test' equal: false
    11. Combined length of 'Hello' and 'World': 10
    12. Concatenated: HelloWorld

     */
}
