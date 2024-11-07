package Hasing;

import java.util.HashSet;

public class hashset {

    // Its best for time complexity 0(1)
    // Arrary insertion O(1)

    public static void main(String[] args) {
        System.out.println("Started...");

        // Create a Hashset
        HashSet<Integer> set = new HashSet<Integer>();
        // Insertion
 
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(30); // Duplicates values are not allowed
        System.out.println(set);

        // Searching
        if (set.contains(90)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println(set.isEmpty());
    }

}
