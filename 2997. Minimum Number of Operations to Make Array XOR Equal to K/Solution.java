class Solution {
    public int minOperations(int[] nums, int k) {
        int xor = nums[0];
        for(int i=1;i<nums.length;i++){
            xor = xor^nums[i];
        }

        int count = 0;
        while(k>0){
            int lastBitXor = xor&1;
            int lastBitK = k&1;
            if(lastBitXor!=lastBitK){
                count++;
            }

            xor = xor>>1;
            k = k>>1;
        }

        while(xor>0){
            int lastBitXor = xor&1;
            if(lastBitXor==1){
                count++;
            }
            xor = xor>>1;
        }

        return count;
    }
}
