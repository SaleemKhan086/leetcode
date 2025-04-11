class Solution {
    private boolean isSymmetric(int n){
        int digits = 0;
        int sum = 0;
        int temp = n;
        while(temp>0){
            digits++;
            sum+= temp%10;
            temp/= 10;
        }
        if(digits%2!=0 || sum%2!=0){
            return false;
        }

        temp = n;
        digits/= 2;
        int sum1 = 0;
        while(digits>0){
            sum1+= temp%10;
            digits--;
            temp/= 10;
        }
        return sum1==sum/2;
    }
    public int countSymmetricIntegers(int low, int high) {
        int ans = 0;
        for(int i=low;i<=high;i++){
            ans+= isSymmetric(i)?1:0;
        }
        return ans;
    }
}
