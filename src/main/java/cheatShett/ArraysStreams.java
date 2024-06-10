package cheatShett;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ArraysStreams {

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 2};

        // Creating a stream from an array
        IntStream stream = Arrays.stream(array); // ➡️ Returns a sequential stream with the specified array as its source
        System.out.println("1. Stream from array: " + Arrays.toString(stream.toArray()));

        // Filtering elements
        stream = Arrays.stream(array); // Re-create stream since it can't be reused
        IntStream filteredStream = stream.filter(n -> n > 3); // ➡️ Returns a stream consisting of the elements of this stream that match the given predicate
        System.out.println("2. Filtered stream (elements > 3): " + Arrays.toString(filteredStream.toArray()));

        // Mapping elements
        stream = Arrays.stream(array); // Re-create stream since it can't be reused
        IntStream mappedStream = stream.map(n -> n * 2); // ➡️ Returns a stream consisting of the results of applying the given function to the elements of this stream
        System.out.println("3. Mapped stream (elements * 2): " + Arrays.toString(mappedStream.toArray()));

        // Reducing elements to a single value
        stream = Arrays.stream(array); // Re-create stream since it can't be reused
        int sum = stream.reduce(0, (a, b) -> a + b); // ➡️ Performs a reduction on the elements of this stream, using the provided identity and an associative accumulation function
        System.out.println("4. Sum of elements: " + sum);

        // Finding maximum element
        stream = Arrays.stream(array); // Re-create stream since it can't be reused
        OptionalInt max = stream.max(); // ➡️ Returns an OptionalInt describing the maximum element of this stream, or an empty OptionalInt if the stream is empty
        max.ifPresent(value -> System.out.println("5. Maximum element: " + value));

        // Finding minimum element
        stream = Arrays.stream(array); // Re-create stream since it can't be reused
        OptionalInt min = stream.min(); // ➡️ Returns an OptionalInt describing the minimum element of this stream, or an empty OptionalInt if the stream is empty
        min.ifPresent(value -> System.out.println("6. Minimum element: " + value));

        // Counting elements
        stream = Arrays.stream(array); // Re-create stream since it can't be reused
        long count = stream.count(); // ➡️ Returns the count of elements in this stream
        System.out.println("7. Count of elements: " + count);

        // Average of elements
        stream = Arrays.stream(array); // Re-create stream since it can't be reused
        OptionalDouble average = stream.average(); // ➡️ Returns an OptionalDouble describing the arithmetic mean of elements of this stream, or an empty OptionalDouble if this stream is empty
        average.ifPresent(value -> System.out.println("8. Average of elements: " + value));


        // Summarizing elements
        stream = Arrays.stream(array); // Re-create stream since it can't be reused
        int sumOfElements = stream.sum(); // ➡️ Returns the sum of elements in this stream
        System.out.println("9. Sum of elements (using sum method): " + sumOfElements);

        // Sorting elements
        stream = Arrays.stream(array); // Re-create stream since it can't be reused
        IntStream sortedStream = stream.sorted(); // ➡️ Returns a stream consisting of the elements of this stream, sorted
        System.out.println("10. Sorted stream: " + Arrays.toString(sortedStream.toArray()));

        // Distinct elements
        stream = Arrays.stream(array); // Re-create stream since it can't be reused
        IntStream distinctStream = stream.distinct(); // ➡️ Returns a stream consisting of the distinct elements (according to Object.equals(Object)) of this stream
        System.out.println("11. Distinct stream: " + Arrays.toString(distinctStream.toArray()));

        // Limiting elements
        stream = Arrays.stream(array); // Re-create stream since it can't be reused
        IntStream limitedStream = stream.limit(3); // ➡️ Returns a stream consisting of the elements of this stream, truncated to be no longer than maxSize in length
        System.out.println("12. Limited stream (first 3 elements): " + Arrays.toString(limitedStream.toArray()));

        // Skipping elements
        stream = Arrays.stream(array); // Re-create stream since it can't be reused
        IntStream skippedStream = stream.skip(2); // ➡️ Returns a stream consisting of the remaining elements of this stream after discarding the first n elements of the stream
        System.out.println("13. Skipped stream (skip first 2 elements): " + Arrays.toString(skippedStream.toArray()));

        // Converting stream to array
        stream = Arrays.stream(array); // Re-create stream since it can't be reused
        int[] newArray = stream.toArray(); // ➡️ Returns an array containing the elements of this stream
        System.out.println("14. New array from stream: " + Arrays.toString(newArray));

        // Creating a stream of indices and processing
        int[] processedArray = IntStream.range(0, array.length).map(i -> array[i] * 2).toArray(); // ➡️ Returns a sequential ordered IntStream from startInclusive (inclusive) to endExclusive (exclusive) by an incremental step of 1
        System.out.println("15. Processed array with doubled elements: " + Arrays.toString(processedArray));

        // Boxed stream
        stream = Arrays.stream(array); // Re-create stream since it can't be reused
        System.out.println("16. Boxed stream: " + Arrays.toString(stream.boxed().toArray(Integer[]::new))); // ➡️ Returns a Stream consisting of the elements of this stream, each boxed to an Integer
    }

    /*
        1. Stream from array: [5, 3, 8, 1, 2]
        2. Filtered stream (elements > 3): [5, 8]
        3. Mapped stream (elements * 2): [10, 6, 16, 2, 4]
        4. Sum of elements: 19
        5. Maximum element: 8
        6. Minimum element: 1
        7. Count of elements: 5
        8. Average of elements: 3.8
        9. Sum of elements (using sum method): 19
        10. Sorted stream: [1, 2, 3, 5, 8]
        11. Distinct stream: [5, 3, 8, 1, 2]
        12. Limited stream (first 3 elements): [5, 3, 8]
        13. Skipped stream (skip first 2 elements): [8, 1, 2]
        14. New array from stream: [5, 3, 8, 1, 2]
        15. Processed array with doubled elements: [10, 6, 16, 2, 4]
        16. Boxed stream: [5, 3, 8, 1, 2]

     */

}
