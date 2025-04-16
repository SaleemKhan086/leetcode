class Solution {
    public long countGood(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> counts = new HashMap<>();
        int i = 0;
        int j = 0;
        long ans = 0;
        long count = 0;
        while (j < n) {
            int existingCount = counts.getOrDefault(nums[j], 0);
            counts.put(nums[j], existingCount + 1);
            count = count + existingCount;

            if (count >= k) {
                while (count >= k) {
                    ans = ans + n - j;
                    counts.put(nums[i], counts.get(nums[i]) - 1);
                    count = count - counts.get(nums[i]);
                    i++;
                }
            }
            j++;
        }
        return ans;
    }
}
