class Solution {
    public int maximumLength(int[] nums) {
        int odds = 0;
        int evens = 0;
        int alternate = 0;
        boolean lastEven = false;

        for(int i=0;i<nums.length;i++){
            if(i==0){
                alternate++;
                lastEven = nums[i]%2 == 0;
            } else {
                if(lastEven && nums[i]%2==1){
                    alternate++;
                    lastEven = false;
                } else if(!lastEven && nums[i]%2==0){
                    alternate++;
                    lastEven = true;
                }
            }
            if(nums[i]%2==0){
                evens++;
            } else {
                odds++;
            }

        }
        return Math.max(Math.max(evens,odds), alternate);   
    }
}
