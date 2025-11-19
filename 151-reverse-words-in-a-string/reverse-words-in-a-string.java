class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            // Skip trailing spaces
            while (i >= 0 && s.charAt(i) == ' ') i--;

            if (i < 0) break;

            // Locate the word boundaries
            int j = i;
            while (j >= 0 && s.charAt(j) != ' ') j--;

            // Append space only if sb already has content
            if (sb.length() > 0) sb.append(' ');
            sb.append(s, j + 1, i + 1);

            // Move to the next word
            i = j - 1;
        }

        return sb.toString();
    }
}
