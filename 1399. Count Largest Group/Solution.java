class Solution {
    private int getSum(int n){
        int ans = 0;
        while(n>0){
            ans+= n%10;
            n/= 10;
        }
        return ans;
    }
    public int countLargestGroup(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        int maxCount = 0;
        for(int i=1;i<=n;i++){
            int sum = getSum(i);
            int count = map.getOrDefault(sum,0)+1;
            map.put(sum, count);
            maxCount = Math.max(count,maxCount);
        }

        int ans = 0;
        for(int val: map.values()){
            if(val==maxCount){
                ans++;
            }
        }
        return ans;
    }
}
