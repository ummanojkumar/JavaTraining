package cheatShett.collections.map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        // Creating a LinkedHashMap object
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // put() - Associates the specified value with the specified key in this map
        linkedHashMap.put(1, "One");
        System.out.println("1. " + linkedHashMap); // {1=One} -> Associates the specified value with the specified key in this map

        // putIfAbsent() - Associates the specified value with the specified key if it is not already associated with a value
        linkedHashMap.putIfAbsent(2, "Two");
        System.out.println("2. " + linkedHashMap); // {1=One, 2=Two} -> Associates the specified value with the specified key if it is not already associated with a value

        // get() - Returns the value to which the specified key is mapped
        String value = linkedHashMap.get(1);
        System.out.println("3. " + value); // One -> Returns the value to which the specified key is mapped

        // remove() - Removes the mapping for the specified key from this map if present
        linkedHashMap.remove(1);
        System.out.println("4. " + linkedHashMap); // {2=Two} -> Removes the mapping for the specified key from this map if present

        // containsKey() - Returns true if this map contains a mapping for the specified key
        boolean containsKey = linkedHashMap.containsKey(2);
        System.out.println("5. " + containsKey); // true -> Returns true if this map contains a mapping for the specified key

        // containsValue() - Returns true if this map maps one or more keys to the specified value
        boolean containsValue = linkedHashMap.containsValue("Two");
        System.out.println("6. " + containsValue); // true -> Returns true if this map maps one or more keys to the specified value

        // keySet() - Returns a Set view of the keys contained in this map
        System.out.println("7. " + linkedHashMap.keySet()); // [2] -> Returns a Set view of the keys contained in this map

        // values() - Returns a Collection view of the values contained in this map
        System.out.println("8. " + linkedHashMap.values()); // [Two] -> Returns a Collection view of the values contained in this map

        // entrySet() - Returns a Set view of the mappings contained in this map
        System.out.println("9. " + linkedHashMap.entrySet()); // [2=Two] -> Returns a Set view of the mappings contained in this map

        // size() - Returns the number of key-value mappings in this map
        int size = linkedHashMap.size();
        System.out.println("10. " + size); // 1 -> Returns the number of key-value mappings in this map

        // isEmpty() - Returns true if this map contains no key-value mappings
        boolean isEmpty = linkedHashMap.isEmpty();
        System.out.println("11. " + isEmpty); // false -> Returns true if this map contains no key-value mappings

        // clear() - Removes all the mappings from this map
        linkedHashMap.clear();
        System.out.println("12. " + linkedHashMap); // {} -> Removes all of the mappings from this map

        // accessOrder - Demonstrates access order
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        linkedHashMap.get(1); // Access "One"
        linkedHashMap.put(3, "Three");
        System.out.println("13. " + linkedHashMap); // {2=Two, 1=One, 3=Three} -> Demonstrates access order
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
    13. {1=One, 2=Two, 3=Three}
     */
}
