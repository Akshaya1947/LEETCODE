

class Solution {
    public int maximumLength(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                if (j > i && s.charAt(j) != s.charAt(i)) {
                    break;
                }
                sb.append(s.charAt(j));
                String str = sb.toString();
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }
        int ans = -1;
        for (String str : map.keySet()) {
            if (map.get(str) >= 3) {
                ans = Math.max(ans, str.length());
            }
        }
        return ans;
    }
}