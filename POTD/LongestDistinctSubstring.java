import java.util.*;

public class LongestDistinctSubstring {

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0; // Edge case: Empty string
        }
        
        Map<Character, Integer> charIndexMap = new HashMap<>(); // Stores the most recent index of each character
        int maxLength = 0; // Stores the length of the longest substring
        int left = 0; // Start of the sliding window
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character is already in the map and its index is within the current window, move `left`
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= left) {
                left = charIndexMap.get(currentChar) + 1;
            }
            
            // Update the character's index in the map
            charIndexMap.put(currentChar, right);
            
            // Update the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        System.out.println(lengthOfLongestSubstring(s1)); // Output: 7 ("eksforg")

        String s2 = "aaa";
        System.out.println(lengthOfLongestSubstring(s2)); // Output: 1 ("a")

        String s3 = "abcdefabcbb";
        System.out.println(lengthOfLongestSubstring(s3)); // Output: 6 ("abcdef")
    }
}
