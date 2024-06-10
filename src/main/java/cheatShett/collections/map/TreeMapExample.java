package cheatShett.collections.map;

import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        // Creating a TreeMap object
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // put() - Associates the specified value with the specified key in this map
        treeMap.put(1, "One");
        System.out.println("1. " + treeMap); // {1=One} -> Associates the specified value with the specified key in this map

        // putIfAbsent() - Associates the specified value with the specified key if it is not already associated with a value
        treeMap.putIfAbsent(2, "Two");
        System.out.println("2. " + treeMap); // {1=One, 2=Two} -> Associates the specified value with the specified key if it is not already associated with a value

        // get() - Returns the value to which the specified key is mapped
        String value = treeMap.get(1);
        System.out.println("3. " + value); // One -> Returns the value to which the specified key is mapped

        // remove() - Removes the mapping for the specified key from this map if present
        treeMap.remove(1);
        System.out.println("4. " + treeMap); // {2=Two} -> Removes the mapping for the specified key from this map if present

        // containsKey() - Returns true if this map contains a mapping for the specified key
        boolean containsKey = treeMap.containsKey(2);
        System.out.println("5. " + containsKey); // true -> Returns true if this map contains a mapping for the specified key

        // containsValue() - Returns true if this map maps one or more keys to the specified value
        boolean containsValue = treeMap.containsValue("Two");
        System.out.println("6. " + containsValue); // true -> Returns true if this map maps one or more keys to the specified value

        // keySet() - Returns a Set view of the keys contained in this map
        System.out.println("7. " + treeMap.keySet()); // [2] -> Returns a Set view of the keys contained in this map

        // values() - Returns a Collection view of the values contained in this map
        System.out.println("8. " + treeMap.values()); // [Two] -> Returns a Collection view of the values contained in this map

        // entrySet() - Returns a Set view of the mappings contained in this map
        System.out.println("9. " + treeMap.entrySet()); // [2=Two] -> Returns a Set view of the mappings contained in this map

        // size() - Returns the number of key-value mappings in this map
        int size = treeMap.size();
        System.out.println("10. " + size); // 1 -> Returns the number of key-value mappings in this map

        // isEmpty() - Returns true if this map contains no key-value mappings
        boolean isEmpty = treeMap.isEmpty();
        System.out.println("11. " + isEmpty); // false -> Returns true if this map contains no key-value mappings

        // clear() - Removes all of the mappings from this map
        treeMap.clear();
        System.out.println("12. " + treeMap); // {} -> Removes all of the mappings from this map

        // firstKey() - Returns the first (lowest) key currently in this map
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        int firstKey = treeMap.firstKey();
        System.out.println("13. " + firstKey); // 1 -> Returns the first (lowest) key currently in this map

        // lastKey() - Returns the last (highest) key currently in this map
        int lastKey = treeMap.lastKey();
        System.out.println("14. " + lastKey); // 3 -> Returns the last (highest) key currently in this map

        // higherKey() - Returns the least key strictly greater than the given key, or null if there is no such key
        int higherKey = treeMap.higherKey(1);
        System.out.println("15. " + higherKey); // 3 -> Returns the least key strictly greater than the given key

        // lowerKey() - Returns the greatest key strictly less than the given key, or null if there is no such key
        Integer lowerKey = treeMap.lowerKey(3);
        System.out.println("16. " + lowerKey); // 1 -> Returns the greatest key strictly less than the given key
    }
    /*
    1. {1=One}
    2. {1=One, 2=Two}
    3. One
    4. {2=Two}
    5. true
    6. true
    7. [2]
    8. [Two]
    9. [2=Two]
    10. 1
    11. false
    12. {}
    13. 1
    14. 3
    15. 3
    16. 1
     */

}
