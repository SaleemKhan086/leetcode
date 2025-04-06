class Solution {
    private List<Integer> traceback(int[] nums, int[] maxLens, int[] lastElements, int index){
        List<Integer> ans = new ArrayList<>();
        while(index>=0){
            ans.add(nums[index]);
            index = lastElements[index];
        }
        return ans;
    }
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        
        int[] maxLens = new int[n];
        int[] lastElements = new int[n];
        
        int maxLength = 0;
        int maxEndIndex = -1;

        for(int i=0;i<n;i++){
            int maxLen = 0;
            int lastElement = -1;
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 && maxLens[j]>maxLen){
                    maxLen = maxLens[j];
                    lastElement = j;
                }
            }
            maxLens[i] = maxLen+1;
            lastElements[i] = lastElement;
            if(maxLens[i]>maxLength){
                maxLength = maxLens[i];
                maxEndIndex = i;
            }
        }
        return traceback(nums, maxLens, lastElements, maxEndIndex);
    }
}
