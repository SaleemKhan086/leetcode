class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        int count = 0;
        int majority = 0;
        // find majority element
        for(int i=0;i<n;i++){
            if(count==0){
                count++;
                majority = nums.get(i);
            } else {
                count+= majority==nums.get(i)?1:-1;
            }
        }

        // get count of majority element
        count = 0;
        for(int i=0;i<n;i++){
            if(nums.get(i)==majority){
                count++;
            }
        }

        // find partition index
        int countSoFar = 0;
        for(int i=0;i<n-1;i++){
            if(majority==nums.get(i)){
                countSoFar++;
            }
            if(countSoFar>(i+1)/2 && (count-countSoFar)>(n-1-i)/2){
                return i;
            }
        }
        return -1;
    }
}
