package cheatShett.collections.map;

import java.util.Hashtable;
import java.util.Enumeration;

public class HashTableExample {


    public static void main(String[] args) {
        // Creating a Hashtable object
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // put() - Associates the specified value with the specified key in this hashtable
        hashtable.put(1, "One");
        System.out.println("1. " + hashtable); // {1=One} -> Associates the specified value with the specified key in this hashtable

        // putIfAbsent() - Associates the specified value with the specified key if it is not already associated with a value
        hashtable.putIfAbsent(2, "Two");
        System.out.println("2. " + hashtable); // {1=One, 2=Two} -> Associates the specified value with the specified key if it is not already associated with a value

        // get() - Returns the value to which the specified key is mapped
        String value = hashtable.get(1);
        System.out.println("3. " + value); // One -> Returns the value to which the specified key is mapped

        // remove() - Removes the mapping for the specified key from this hashtable if present
        hashtable.remove(1);
        System.out.println("4. " + hashtable); // {2=Two} -> Removes the mapping for the specified key from this hashtable if present

        // containsKey() - Returns true if this hashtable contains a mapping for the specified key
        boolean containsKey = hashtable.containsKey(2);
        System.out.println("5. " + containsKey); // true -> Returns true if this hashtable contains a mapping for the specified key

        // containsValue() - Returns true if this hashtable maps one or more keys to the specified value
        boolean containsValue = hashtable.containsValue("Two");
        System.out.println("6. " + containsValue); // true -> Returns true if this hashtable maps one or more keys to the specified value

        // keySet() - Returns a Set view of the keys contained in this hashtable
        System.out.println("7. " + hashtable.keySet()); // [2] -> Returns a Set view of the keys contained in this hashtable

        // values() - Returns a Collection view of the values contained in this hashtable
        System.out.println("8. " + hashtable.values()); // [Two] -> Returns a Collection view of the values contained in this hashtable

        // entrySet() - Returns a Set view of the mappings contained in this hashtable
        System.out.println("9. " + hashtable.entrySet()); // [2=Two] -> Returns a Set view of the mappings contained in this hashtable

        // size() - Returns the number of key-value mappings in this hashtable
        int size = hashtable.size();
        System.out.println("10. " + size); // 1 -> Returns the number of key-value mappings in this hashtable

        // isEmpty() - Returns true if this hashtable contains no key-value mappings
        boolean isEmpty = hashtable.isEmpty();
        System.out.println("11. " + isEmpty); // false -> Returns true if this hashtable contains no key-value mappings

        // clear() - Removes all of the mappings from this hashtable
        hashtable.clear();
        System.out.println("12. " + hashtable); // {} -> Removes all of the mappings from this hashtable

        // clone() - Returns a shallow copy of this hashtable
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        Hashtable<Integer, String> clonedHashtable = (Hashtable<Integer, String>) hashtable.clone();
        System.out.println("13. " + clonedHashtable); // {1=One, 2=Two} -> Returns a shallow copy of this hashtable

        // getOrDefault() - Returns the value to which the specified key is mapped, or defaultValue if this hashtable contains no mapping for the key
        String valueOrDefault = hashtable.getOrDefault(3, "Default");
        System.out.println("14. " + valueOrDefault); // Default -> Returns the value to which the specified key is mapped, or defaultValue if this hashtable contains no mapping for the key

        // Enumeration - Demonstrates enumerating through keys and values
        Enumeration<Integer> keys = hashtable.keys();
        Enumeration<String> values = hashtable.elements();
        System.out.print("15. Keys: ");
        while (keys.hasMoreElements()) {
            System.out.print(keys.nextElement() + " ");
        }
        System.out.println(); // Keys: 1 2 -> Enumerates through the keys

        System.out.print("16. Values: ");
        while (values.hasMoreElements()) {
            System.out.print(values.nextElement() + " ");
        }
        System.out.println(); // Values: One Two -> Enumerates through the values
    }

    /*
    1. {1=One}
    2. {2=Two, 1=One}
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
    13. {2=Two, 1=One}
    14. Default
    15. Keys: 2 1
    16. Values: Two One
     */
}
