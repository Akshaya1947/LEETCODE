class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            Map<Integer, Integer> freq = new HashMap<>();

            // Count frequencies in the current window
            for (int j = i; j < i + k; j++) {
                freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            }

            // Store (frequency, value) pairs
            List<int[]> list = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                list.add(new int[]{entry.getValue(), entry.getKey()});
            }

            // Sort by frequency descending, then value descending
            Collections.sort(list, (a, b) -> {
                if (a[0] != b[0]) return b[0] - a[0];
                return b[1] - a[1];
            });

            // Calculate x-sum
            int sum = 0;
            for (int j = 0; j < Math.min(x, list.size()); j++) {
                sum += list.get(j)[0] * list.get(j)[1];
            }

            ans[i] = sum;
        }

        return ans;
    }
}