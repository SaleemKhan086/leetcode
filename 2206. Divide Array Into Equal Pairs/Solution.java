class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(int val: map.values()){
            if(val%2 == 1){
                return false;
            }
        }

        return true;
    }
}
