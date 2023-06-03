package week3day4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//int[] data = {4,3,6,8,29,1,2,4,7,8};

/*
 * Problem Statement : Print only duplicate values
 * Expected output: 4 and 8
 * 
 * How to solve?
 * 1) Regular for loop
 * 2) Using Set
 * 
 * Using Set 
 * 
 * a) Add every element into Set
 * b) If it is already there in the Set -> Print duplicate
 * 
 */

public class PrintDuplicateNumberUsingSET {

	public static void main(String[] args) {
        // Sample array with duplicate elements
        int[] data = {4,3,6,8,29,1,2,4,7,8};

        // Create a Set to store unique elements
        Set<Integer> uniqueSet = new LinkedHashSet<Integer>();

        // Create a Set to store duplicate elements
        Set<Integer> duplicateSet = new HashSet<Integer>();

        // Iterate through the array
        for (int i = 0; i < data.length; i++) {
           

            // Check if the element is already present in the unique set
            if (!uniqueSet.add(data[i])) {
                // If it is already present, add it to the duplicate set
                duplicateSet.add(data[i]);
            }
        }

        // Print the duplicate elements
        System.out.println("Duplicate elements: " + duplicateSet);
    }

}
