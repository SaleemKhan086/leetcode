class Solution {
    public int totalMoney(int n) {
        int lastMonday = 0;
        int ans = 0;
        for(int i=0;i<n;i++) {
            if(i%7==0) {
                ans+= lastMonday+1;
                lastMonday++;
            }
            else {
                ans+= lastMonday+(i%7);
            }
        }

        return ans;
    }
}
