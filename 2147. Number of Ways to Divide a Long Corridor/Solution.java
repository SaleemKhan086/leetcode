class Solution {
    int findFirstSeat(String corridor) {
        for(int i=0;i<corridor.length();i++) {
            if(corridor.charAt(i)=='S') {
                return i;
            }
        }
        return corridor.length();
    }

    public int numberOfWays(String corridor) {
        int MOD = 1000000007;
        long ans = 1;
        int n = corridor.length();
        int prev = findFirstSeat(corridor);
        int i = prev+1;
        int count = 1;

        while(i<n) {

            while(i<n && corridor.charAt(i)!='S'){
                i++;
            }
            if(i==n){
                break;
            }
            if(count == 0) {
                ans = ((ans%MOD)*(i-prev))%MOD;
                prev = i;
                count++;
            } else {
                count = 0;
                prev = i;
            }
            i++;
        }

        return count==1?0:(int)ans;

    }

}