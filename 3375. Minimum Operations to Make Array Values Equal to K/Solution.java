class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> biggerCount = new HashMap<>();
        int biggerOrEqualTotalCount = 0;
        for(int i=0;i<n;i++){
            if(nums[i]>k){
                biggerCount.put(nums[i], biggerCount.getOrDefault(nums[i],0)+1);
            }
            if(nums[i]>=k){
                biggerOrEqualTotalCount++;
            }
        }
        if(biggerOrEqualTotalCount<n){
            return -1;
        }

        return biggerCount.size();
    }
}
