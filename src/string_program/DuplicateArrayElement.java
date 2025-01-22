package string_program;

import java.util.HashMap;

public class DuplicateArrayElement {

    public static void main(String[] args) {
        int ar[] = {1, 2, 2, 4, 5, 6, 5, 1};

        // Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate through the array to count the frequency of each element
        for (int i = 0; i < ar.length; i++) {
            frequencyMap.put(ar[i], frequencyMap.getOrDefault(ar[i], 0) + 1);
        }

        // Iterate through the map to print duplicates and their frequencies
        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) > 1) {  // Check if the element is a duplicate
                System.out.println("Duplicate number is: " + key + ", Frequency: " + frequencyMap.get(key));
            }
        }
    }
}
