
import java.util.*;

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();
        int[] maxCount = new int[26];

        for (String s2 : words2) {
            int[] count = new int[26];

            for (int k = 0; k < s2.length(); k++) {
                count[s2.charAt(k) - 'a']++;
            }

            for (int k = 0; k < 26; k++) {
                maxCount[k] = Math.max(maxCount[k], count[k]);
            }
        }

        for (String s1 : words1) {
            int[] count = new int[26];

            for (int k = 0; k < s1.length(); k++) {
                count[s1.charAt(k) - 'a']++;
            }

            int valid = 1;

            for (int k = 0; k < 26; k++) {
                if (count[k] < maxCount[k]) {
                    valid = 0;
                    break;
                }
            }

            if (valid == 1) {
                result.add(s1);
            }
        }

        return result;
    }
}