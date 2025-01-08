package stringclasses;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public void checkAnagram()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("::Anagram checking::");
        System.out.print("Enter String 1:");
        String s1 = sc.next();
        System.out.print("Enter String 2:");
        String s2 = sc.next();

        // Convert both strings to lowercase and remove spaces
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Check if lengths are equal
        if (s1.length() != s2.length()) {
            System.out.println("The strings are not anagrams (different lengths).");
            return;
        }

        // Convert strings to character arrays and sort them
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        
    }
}
