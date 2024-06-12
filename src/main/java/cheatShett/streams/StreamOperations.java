package cheatShett.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamOperations {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "apple", "avocado", "blueberry");

        // filter() - Filters elements that start with 'a'
        List<String> filteredWords = words.stream()
                .filter(word -> word.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println("1. Filtered words: " + filteredWords); // [apple, apple, avocado]

        // map() - Transforms each word to its uppercase form
        List<String> uppercasedWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("2. Transformed words: " + uppercasedWords); // [APPLE, BANANA, CHERRY, APPLE, AVOCADO, BLUEBERRY]

        // flatMap() - Flattens nested lists into a single stream of words
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("avocado", "blueberry")
        );
        List<String> flattenedWords = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("3. Flattened list: " + flattenedWords); // [apple, banana, avocado, blueberry]

        // distinct() - Removes duplicate elements
        List<String> distinctWords = words.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("4. Distinct words: " + distinctWords); // [apple, banana, cherry, avocado, blueberry]

        // sorted() - Sorts the elements in natural order
        List<String> sortedWords = words.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("5. Sorted words: " + sortedWords); // [apple, apple, avocado, banana, blueberry, cherry]

        // peek() - Logs each element
        List<String> peekedWords = words.stream()
                .peek(word -> System.out.println("6. Processing word: " + word))
                .collect(Collectors.toList());
        System.out.println("Processed words: " + peekedWords); // [apple, banana, cherry, apple, avocado, blueberry]

        // limit() - Limits the number of elements to 2
        List<String> limitedWords = words.stream()
                .limit(2)
                .collect(Collectors.toList());
        System.out.println("7. Limited words: " + limitedWords); // [apple, banana]

        // skip() - Skips the first 2 elements
        List<String> skippedWords = words.stream()
                .skip(2)
                .collect(Collectors.toList());
        System.out.println("8. Skipped words: " + skippedWords); // [cherry, apple, avocado, blueberry]

        // forEach() - Prints each element
        words.stream()
                .forEach(word -> System.out.println("9. Word: " + word));

        // collect() - Collects elements into a set to remove duplicates
        Set<String> collectedWords = words.stream()
                .collect(Collectors.toSet());
        System.out.println("10. Collected words: " + collectedWords); // [banana, cherry, avocado, blueberry, apple]

        // reduce() - Sums the elements
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("11. Sum: " + sum); // 15

        // allMatch() - Checks if all elements are even
        List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8, 10);
        boolean allEven = evenNumbers.stream()
                .allMatch(n -> n % 2 == 0);
        System.out.println("12. All even: " + allEven); // true

        // anyMatch() - Checks if any element is odd
        boolean anyOdd = evenNumbers.stream()
                .anyMatch(n -> n % 2 != 0);
        System.out.println("13. Any odd: " + anyOdd); // false

        // noneMatch() - Checks if no element is greater than 10
        boolean noneGreaterThanTen = evenNumbers.stream()
                .noneMatch(n -> n > 10);
        System.out.println("14. None greater than 10: " + noneGreaterThanTen); // true
    }


    /*
    1. Filtered words: [apple, apple, avocado]
    2. Transformed words: [APPLE, BANANA, CHERRY, APPLE, AVOCADO, BLUEBERRY]
    3. Flattened list: [apple, banana, avocado, blueberry]
    4. Distinct words: [apple, banana, cherry, avocado, blueberry]
    5. Sorted words: [apple, apple, avocado, banana, blueberry, cherry]
    6. Processing word: apple
    6. Processing word: banana
    6. Processing word: cherry
    6. Processing word: apple
    6. Processing word: avocado
    6. Processing word: blueberry
    Processed words: [apple, banana, cherry, apple, avocado, blueberry]
    7. Limited words: [apple, banana]
    8. Skipped words: [cherry, apple, avocado, blueberry]
    9. Word: apple
    9. Word: banana
    9. Word: cherry
    9. Word: apple
    9. Word: avocado
    9. Word: blueberry
    10. Collected words: [banana, apple, cherry, avocado, blueberry]
    11. Sum: 15
    12. All even: true
    13. Any odd: false
    14. None greater than 10: true
     */

}
