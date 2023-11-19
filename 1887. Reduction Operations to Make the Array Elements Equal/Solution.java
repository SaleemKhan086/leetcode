class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = n-1;
        int smallest = nums[0];
        
        int steps = 0;
        
        while(i>=0 && nums[i]>smallest) {
            int curr = nums[i];
            while(i>=0 && nums[i]==curr) {
                i--;
            }
            steps+= n-1-i;
        }
        
        return steps;
    }
}
