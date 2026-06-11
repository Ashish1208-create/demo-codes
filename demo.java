import java.util.*;

public class demo{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
   if (s == null || s.isEmpty() || t == null || t.isEmpty() || s.length() < t.length()) {
           System.out.println("");
           return;
        }

        // Create a hashmap to store the frequency of characters in string t
        Map<Character, Integer> tCount = new HashMap<>();
        for (char c : t.toCharArray()) {
            tCount.put(c, tCount.getOrDefault(c, 0) + 1);
        }

        int requiredChars = tCount.size();
        int formedChars = 0;

        // Create a hashmap to store the frequency of characters in the current window
        Map<Character, Integer> windowCounts = new HashMap<>();

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // Add the character to the window counts
            windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);

            // If the character is in tCount and its frequency in the window is equal to its frequency in tCount,
            // increment the formedChars count
            if (tCount.containsKey(c) && windowCounts.get(c).equals(tCount.get(c))) {
                formedChars++;
            }

            // While the window contains all the required characters and the left pointer is not at the start of the window
            while (left <= right && formedChars == requiredChars) {
                // Update the minimum length and start index if the current window is smaller
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                // Remove the character at the left pointer from the window counts
                char leftChar = s.charAt(left);
                windowCounts.put(leftChar, windowCounts.get(leftChar) - 1);

                // If the character is in tCount and its frequency in the window is less than its frequency in tCount,
                // decrement the formedChars count
                if (tCount.containsKey(leftChar) && windowCounts.get(leftChar) < tCount.get(leftChar)) {
                    formedChars--;
                }

                // Move the left pointer to the right
                left++;
            }
        }

        // Return the minimum window substring if it exists, otherwise return an empty string
       System.out.println(minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen));
       return;
    }
}