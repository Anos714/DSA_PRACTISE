package JCF.Module3;

/*
                                Map
                                 | (implements)
   ------------------------------------------------------
   |        |           |           |               |
HashMap  TreeMap     EnumMap  LinkedHashMap   WeakHashMap


 // Types of Map:-
 // HashMap
// Stores key-value pairs with unique keys.
// Does not maintain insertion or sorting order.
// Allows one null key and multiple null values.
// Best for fast lookup, insertion, and deletion (O(1) average).

// LinkedHashMap
// Maintains insertion order (or access order if configured).
// Slightly slower than HashMap due to linked list maintenance.
// Allows one null key and multiple null values.

// TreeMap
// Stores entries in sorted order based on keys (natural order or Comparator).
// Does not allow null keys (allows null values).
// Operations take O(log n) time.

// Hashtable
// Legacy synchronized implementation of Map.
// Thread-safe but slower than HashMap.
// Does not allow null keys or null values.

// ConcurrentHashMap
// Thread-safe Map designed for concurrent access.
// Faster than Hashtable in multithreaded environments.
// Does not allow null keys or null values.

// WeakHashMap
// Stores keys as weak references.
// Entries are automatically removed when keys are no longer referenced.
// Allows one null key and multiple null values.

// IdentityHashMap
// Compares keys using == (reference equality) instead of equals().
// Useful when object identity matters.
// Allows null keys and null values.

// EnumMap
// Specialized Map for enum keys.
// Very fast and memory efficient.
// Does not allow null keys (allows null values).


 // map stores in key value pair
 //Definition:- it is a collection of key value pair
 // example:-
 key->value
 us->United States
 br->Brazil
 in->India

 // Map Methods:-
// put(K key, V value)
// Adds a key-value pair or updates the value if the key already exists.

// putAll(Map<? extends K, ? extends V> m)
// Copies all key-value pairs from another map.

// get(Object key)
// Returns the value associated with the specified key.

// remove(Object key)
// Removes the key-value pair for the specified key.

// size()
// Returns the total number of key-value pairs in the map.

// clear()
// Removes all key-value pairs from the map.

// putIfAbsent(K key, V value)
// Adds the key-value pair only if the key is not already present.

// getOrDefault(Object key, V defaultValue)
// Returns the value of the key, or the default value if the key doesn't exist.

// containsKey(Object key)
// Checks whether the specified key exists in the map.

// containsValue(Object value)
// Checks whether the specified value exists in the map.

// replace(K key, V value)
// Replaces the value of the specified key if it exists.

// replace(K key, V oldValue, V newValue)
// Replaces the value only if the current value matches the old value.

// keySet()
// Returns a Set containing all keys in the map.

// values()
// Returns a Collection containing all values in the map.

// entrySet()
// Returns a Set containing all key-value pairs as Map.Entry objects.

 */


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
    static void main() {
        //     creation of map
        Map<String,String> cc = new HashMap<>();
        Map<String,String> mp=new HashMap<>();

//     put() method
        cc.put("in","India");
        cc.put("us","United States");
        cc.put("br","Brazil");
        cc.put("cn","China");
        cc.put("ru","Russia");

        System.out.println(cc);

    //     putAll() method
        mp.putAll(cc);
        System.out.println(mp);

    //     get() method
        System.out.println(cc.get("in"));

    //remove() method
        mp.remove("br");
        System.out.println(mp);

    // size() method
        System.out.println(mp.size());

    //     clear() method
        mp.clear();
        System.out.println(mp);

    //     putIfAbsent() method
        cc.putIfAbsent("cn","China3");
        System.out.println(cc);

    //     getOrDefault() method
        System.out.println(cc.getOrDefault("en","None"));

    //containsKey() method
        System.out.println(cc.containsKey("en"));//false
        System.out.println(cc.containsKey("cn"));//true

    // containsValue() method
        System.out.println(cc.containsValue("China"));//true
        System.out.println(cc.containsValue("Japan"));//false

    //replace() method
        cc.replace("in","Bharat");
        System.out.println(cc);

    //replace() method
        cc.replace("in","Bharat","India");
        System.out.println(cc);

    //keySet() method
        Set<String> st=cc.keySet();
        System.out.println(st);

    //values() method
        Collection<String>col=cc.values();
        System.out.println(col);

    //entrySet() method
        Set<Map.Entry<String,String>> entrySt=cc.entrySet();
        System.out.println(entrySt);

    // iterating over a Map
        for(Map.Entry<String,String> entry:entrySt){
            System.out.println("Key: %s, Value: %s".formatted(entry.getKey(),entry.getValue()));
        }


    }
}
