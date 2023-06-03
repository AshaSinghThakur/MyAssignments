package week3day4;

import java.util.HashSet;
import java.util.Set;

/*PrintUniqueCharacter

 * Problem
 * 
 * a) Take your name as input
 * b) Print all unique characters only (any order)
 * 
 * Input:  babu
 * Output: a u 
 * 
 */

/*
 * Psuedocode
 * 
 * a) Convert String to Character array
 * b) Create a new Set -> HashSet
 * c) Add each character to the Set and if it is already there, remove it
 * d) Finally, print the set
 */
public class PrintUniqueCharUsingSET {
	public static void main(String[] args) {
        String input = "babu";

        // Create a Set to store unique characters
        Set<Character> uniqueChars = new HashSet<Character>();

        // Iterate through the string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if the character is a letter or digit
            if ((currentChar >= 'a' && currentChar <= 'z') || (currentChar >= 'A' && currentChar <= 'Z')
                    || (currentChar >= '0' && currentChar <= '9')) {
                // Add the character to the uniqueChars set
                uniqueChars.add(currentChar);
            }
        }
        System.out.println("Input String is :"+input);
        // Print the unique characters
        System.out.println("Unique characters: " + uniqueChars);
    }

}
