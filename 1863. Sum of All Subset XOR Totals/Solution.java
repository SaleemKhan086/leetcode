class Solution {
    private int f(int[] nums, int curr, int xor){
        int n = nums.length;
        if(curr==n){
            return xor;
        }

        //dont take it
        int sumDontTakeit = f(nums, curr+1, xor);

        //takeit
        int sumTakeit = f(nums, curr+1, xor^nums[curr]);

        return sumTakeit+sumDontTakeit;
    }
    public int subsetXORSum(int[] nums) {
        return f(nums,0,0);
    }
}
