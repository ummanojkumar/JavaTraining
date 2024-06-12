package cheatShett.collections.collection;

import java.util.*;

public class CollectionsExample {


    public static void main(String[] args) {
        // 1. addAll
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c");
        System.out.println("1. addAll: " + list); // Output: [a, b, c]

        // 2. binarySearch
        List<Integer> sortedList = Arrays.asList(1, 2, 3, 4, 5);
        int index = Collections.binarySearch(sortedList, 3);
        System.out.println("2. binarySearch: " + index); // Output: 2

        // 3. copy
        List<String> src = Arrays.asList("a", "b", "c");
        List<String> dest = new ArrayList<>(Arrays.asList("x", "y", "z"));
        Collections.copy(dest, src);
        System.out.println("3. copy: " + dest); // Output: [a, b, c]

        // 4. disjoint
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<String> list2 = Arrays.asList("x", "y", "z");
        boolean disjoint = Collections.disjoint(list1, list2);
        System.out.println("4. disjoint: " + disjoint); // Output: true

        // 5. fill
        List<String> fillList = new ArrayList<>(Arrays.asList("a", "b", "c"));
        Collections.fill(fillList, "x");
        System.out.println("5. fill: " + fillList); // Output: [x, x, x]

        // 6. frequency
        List<String> freqList = Arrays.asList("a", "b", "a", "c", "a");
        int freq = Collections.frequency(freqList, "a");
        System.out.println("6. frequency: " + freq); // Output: 3

        // 7. max
        List<Integer> maxList = Arrays.asList(1, 2, 3, 4, 5);
        int max = Collections.max(maxList);
        System.out.println("7. max: " + max); // Output: 5

        // 8. min
        List<Integer> minList = Arrays.asList(1, 2, 3, 4, 5);
        int min = Collections.min(minList);
        System.out.println("8. min: " + min); // Output: 1

        // 9. reverse
        List<String> reverseList = new ArrayList<>(Arrays.asList("a", "b", "c"));
        Collections.reverse(reverseList);
        System.out.println("9. reverse: " + reverseList); // Output: [c, b, a]

        // 10. shuffle
        List<String> shuffleList = new ArrayList<>(Arrays.asList("a", "b", "c"));
        Collections.shuffle(shuffleList);
        System.out.println("10. shuffle: " + shuffleList); // Output: (example output, actual output may vary)

        // 11. sort
        List<Integer> sortList = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5));
        Collections.sort(sortList);
        System.out.println("11. sort: " + sortList); // Output: [1, 1, 3, 4, 5]

        // 12. swap
        List<String> swapList = new ArrayList<>(Arrays.asList("a", "b", "c"));
        Collections.swap(swapList, 0, 2);
        System.out.println("12. swap: " + swapList); // Output: [c, b, a]

        // 13. unmodifiableCollection
        Collection<String> collection = new ArrayList<>(Arrays.asList("a", "b", "c"));
        Collection<String> unmodifiableCollection = Collections.unmodifiableCollection(collection);
        System.out.println("13. unmodifiableCollection: " + unmodifiableCollection); // Output: [a, b, c]

        // 14. unmodifiableList
        List<String> unmodifiableList = Collections.unmodifiableList(list);
        System.out.println("14. unmodifiableList: " + unmodifiableList); // Output: [a, b, c]

        // 15. unmodifiableMap
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(map);
        System.out.println("15. unmodifiableMap: " + unmodifiableMap); // Output: {key1=value1, key2=value2}

        // 16. unmodifiableSet
        Set<String> set = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> unmodifiableSet = Collections.unmodifiableSet(set);
        System.out.println("16. unmodifiableSet: " + unmodifiableSet); // Output: [a, b, c]

        // 17. singleton
        Set<String> singletonSet = Collections.singleton("a");
        System.out.println("17. singleton: " + singletonSet); // Output: [a]

        // 18. emptyList
        List<String> emptyList = Collections.emptyList();
        System.out.println("18. emptyList: " + emptyList); // Output: []

        // 19. emptyMap
        Map<String, String> emptyMap = Collections.emptyMap();
        System.out.println("19. emptyMap: " + emptyMap); // Output: {}

        // 20. emptySet
        Set<String> emptySet = Collections.emptySet();
        System.out.println("20. emptySet: " + emptySet); // Output: []
    }
    /*
    1. addAll: [a, b, c]
    2. binarySearch: 2
    3. copy: [a, b, c]
    4. disjoint: true
    5. fill: [x, x, x]
    6. frequency: 3
    7. max: 5
    8. min: 1
    9. reverse: [c, b, a]
    10. shuffle: [a, b, c]
    11. sort: [1, 1, 3, 4, 5]
    12. swap: [c, b, a]
    13. unmodifiableCollection: [a, b, c]
    14. unmodifiableList: [a, b, c]
    15. unmodifiableMap: {key1=value1, key2=value2}
    16. unmodifiableSet: [a, b, c]
    17. singleton: [a]
    18. emptyList: []
    19. emptyMap: {}
    20. emptySet: []
     */
}
