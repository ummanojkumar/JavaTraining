package cheatShett.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class ArraysMethods {

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 2};
        int[] arrayCopy = Arrays.copyOf(array, array.length); // ➡️ Copies the specified array
        int[] arrayRangeCopy = Arrays.copyOfRange(array, 1, 3); // ➡️ Copies the specified range of the specified array into a new array
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7); // ➡️ Assigns the specified value to each element of the specified array

        // Sorting the array
        Arrays.sort(array); // ➡️ Sorts the specified array into ascending numerical order

        System.out.println("1. Sorted array: " + Arrays.toString(array));

        // Searching for a value in the sorted array
        int index = Arrays.binarySearch(array, 3); // ➡️ Searches the specified array for the specified value using the binary search algorithm
        System.out.println("2. Index of element 3: " + index);

        // Checking if two arrays are equal
        boolean isEqual = Arrays.equals(array, arrayCopy); // ➡️ Returns true if the two specified arrays of ints are equal to one another
        System.out.println("3. Are original and copied arrays equal?: " + isEqual);

        // Converting the array to a string
        System.out.println("4. String representation of array: " + Arrays.toString(array)); // ➡️ Returns a string representation of the contents of the specified array

        // Filling an array with a value
        System.out.println("5. Array filled with 7: " + Arrays.toString(filledArray));

        // Parallel sorting the array
        int[] arrayToParallelSort = {5, 3, 8, 1, 2};
        Arrays.parallelSort(arrayToParallelSort); // ➡️ Sorts the specified array into ascending numerical order using parallel sorting
        System.out.println("6. Parallel sorted array: " + Arrays.toString(arrayToParallelSort));

        // Comparing two arrays lexicographically
        int comparisonResult = Arrays.compare(array, arrayCopy); // ➡️ Compares two arrays lexicographically
        System.out.println("7. Lexicographical comparison result: " + comparisonResult);

        // Mismatch between two arrays
        int mismatchIndex = Arrays.mismatch(array, arrayCopy); // ➡️ Finds and returns the index of the first mismatch between two arrays
        System.out.println("8. Mismatch index: " + mismatchIndex);

        // Stream from array
        IntStream stream = Arrays.stream(array); // ➡️ Returns a sequential stream with the specified array as its source
        System.out.println("9. Stream from array: " + Arrays.toString(stream.toArray()));

        // Setting all elements to a specific value
        Arrays.setAll(filledArray, i -> i * 2); // ➡️ Sets all elements of the specified array, using a generator function to compute each element
        System.out.println("10. Array set all elements to double their indices: " + Arrays.toString(filledArray));

        // Sorting using a custom comparator
        Integer[] arrayToSortWithComparator = {5, 3, 8, 1, 2};
        Arrays.sort(arrayToSortWithComparator, Comparator.reverseOrder()); // ➡️ Sorts the specified array according to the order induced by the specified comparator
        System.out.println("11. Array sorted with custom comparator: " + Arrays.toString(arrayToSortWithComparator));

        // Spliterator
        System.out.println("12. Spliterator characteristics: " + Arrays.spliterator(array).characteristics()); // ➡️ Creates a Spliterator covering all of the specified array

        // Array hash code
        System.out.println("13. Array hash code: " + Arrays.hashCode(array)); // ➡️ Returns a hash code based on the contents of the specified array

        // Array deep hash code
        Integer[][] deepArray = {{1, 2}, {3, 4}};
        System.out.println("14. Deep array hash code: " + Arrays.deepHashCode(deepArray)); // ➡️ Returns a hash code based on the contents of the specified array, using deep contents for arrays within the array

        // Array deep equals
        Integer[][] anotherDeepArray = {{1, 2}, {3, 4}};
        System.out.println("15. Deep arrays equality: " + Arrays.deepEquals(deepArray, anotherDeepArray)); // ➡️ Returns true if the two specified arrays are deeply equal to one another

        // Array deep string
        System.out.println("16. Deep string representation: " + Arrays.deepToString(deepArray)); // ➡️ Returns a string representation of the "deep contents" of the specified array

        // Array parallel prefix
        int[] prefixArray = {1, 2, 3, 4, 5};
        Arrays.parallelPrefix(prefixArray, (left, right) -> left + right); // ➡️ Performs parallel prefix computation on the specified array
        System.out.println("17. Array after parallel prefix: " + Arrays.toString(prefixArray));

        // Array parallel set all
        int[] parallelSetAllArray = new int[5];
        Arrays.parallelSetAll(parallelSetAllArray, i -> i * 3); // ➡️ Initializes each element of the specified array, in parallel, using the provided generator function
        System.out.println("18. Array after parallel set all: " + Arrays.toString(parallelSetAllArray));

        // Array parallel sort
        int[] parallelSortArray = {5, 3, 8, 1, 2};
        Arrays.parallelSort(parallelSortArray); // ➡️ Sorts the specified array into ascending numerical order using parallel sorting
        System.out.println("19. Array after parallel sort: " + Arrays.toString(parallelSortArray));

        // Array spliterator
        System.out.println("20. Array spliterator: " + Arrays.spliterator(array).getExactSizeIfKnown()); // ➡️ Creates a Spliterator covering all of the specified array

        // Array hash code (deep)
        System.out.println("21. Array deep hash code: " + Arrays.deepHashCode(deepArray)); // ➡️ Returns a hash code based on the contents of the specified array, using deep contents for arrays within the array
    }

    /* output
    1. Sorted array: [1, 2, 3, 5, 8]
    2. Index of element 3: 2
    3. Are original and copied arrays equal?: false
    4. String representation of array: [1, 2, 3, 5, 8]
    5. Array filled with 7: [7, 7, 7, 7, 7]
    6. Parallel sorted array: [1, 2, 3, 5, 8]
    7. Lexicographical comparison result: -1
    8. Mismatch index: 0
    9. Stream from array: [1, 2, 3, 5, 8]
    10. Array set all elements to double their indices: [0, 2, 4, 6, 8]
    11. Array sorted with custom comparator: [8, 5, 3, 2, 1]
    12. Spliterator characteristics: 17488
    13. Array hash code: 29615300
    14. Deep array hash code: 32833
    15. Deep arrays equality: true
    16. Deep string representation: [[1, 2], [3, 4]]
    17. Array after parallel prefix: [1, 3, 6, 10, 15]
    18. Array after parallel set all: [0, 3, 6, 9, 12]
    19. Array after parallel sort: [1, 2, 3, 5, 8]
    20. Array spliterator: 5
    21. Array deep hash code: 32833
     */
}
