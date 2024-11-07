package Hasing;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        // Like an Object in js
        // key value pairs key are unique

        // creations of HashMapS
        // country= key, population= value
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        System.out.println(map);

        // insert
        map.put("Bangladesh", 16);
        map.put("Pak", 10);
        map.put("Pakistan", 10);
        map.put("Pak", 10); // dubplication not allowed
        System.out.println(map);

        // Search LoopUp
        String name = "Bangladesh";
        if (map.containsKey(name)) {
            System.out.println("Key exists");

        } else {
            System.out.println("Key not found");
        }

        System.out.println(map.get(name)); // Return value
        System.out.println(map.get("Indonesian")); // Return value null

        // for (String key : map.keySet()) {
        // System.out.println(key);
        // }

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
