
/*public class EqualSubstring {
    public static int findEqualSubstrings(String s) {
        int count = 0;
        int n = s.length();
        
        for(int i = 0; i < n; i++) {
            int a = 0, b = 0, c = 0;
            for(int j = i; j < n; j++) {
                if(s.charAt(j) == 'a') a++;
                else if(s.charAt(j) == 'b') b++;
                else if(s.charAt(j) == 'c') c++;
                
                if(a == b && b == c) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String test = "aabbcccaab"; abcabc
        System.out.println("Number of substrings with equal a,b,c: " + findEqualSubstrings(test));
    }
}
*/
import java.util.Scanner;

import java.util.*;

public class EqualSubstringPrefix {
    public static int findEqualSubstrings(String s) {
        int n = s.length();
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        
        // Initialize counts for a, b, c
        int a = 0, b = 0, c = 0;
        
        // Add initial state to map
        map.put("0#0#0", 1);
        
        for(int i = 0; i < n; i++) {
            // Update counts
            if(s.charAt(i) == 'a') a++;
            else if(s.charAt(i) == 'b') b++;
            else if(s.charAt(i) == 'c') c++;
            
            // Create key as difference between counts
            String key = (a-b) + "#" + (b-c) + "#" + (a-c);
            
            // Add count from map
            count += map.getOrDefault(key, 0);
            
            // Update map
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        
        return count;
    }

    public static void main(String[] args) {
        String test = "abcabc";
        System.out.println("Number of substrings with equal a,b,c: " + findEqualSubstrings(test));
    }
}
 


 /*You are given an array nums of length n and a positive integer k.

A subarray of nums is called good if the absolute difference between its first and last element is exactly k, in other words, the subarray nums[i..j] is good if |nums[i] - nums[j]| == k.

Return the maximum sum of a good subarray of nums. If there are no good subarrays, return 0.

  */

