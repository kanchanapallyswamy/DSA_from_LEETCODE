import java.util.*;

class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character, Integer> mp = new HashMap<>();
        List<String> l = new ArrayList<>();

        // Count frequency of each character in the first word
        for (char p : words[0].toCharArray()) {
            mp.put(p, 1 + mp.getOrDefault(p, 0));
        }

        // Store unique characters from the first word
        Set<Character> st = new HashSet<>();
        for (char i : words[0].toCharArray()) {
            st.add(i);
        }

        // Check each character for minimum frequency across all words
        for (char i : st) {
            int minFreq = mp.get(i);
            for (int k = 1; k < words.length; k++) {
                int freq = 0;
                for (char ch : words[k].toCharArray()) {
                    if (ch == i) freq++;
                }
                minFreq = Math.min(minFreq, freq);
            }
            // If character appears in all words (minFreq > 0), add to result
            while (minFreq-- > 0) {
                l.add(i + "");
            }
        }

        return l;
    }
}
