class Solution {
    private char flip(char c){
        return c=='0'?'1':'0';
    }
    private long getLen(int n) {
        long ans = 1;
        for(int i=1;i<n;i++){
            ans = (ans*2) + 1;
        }
        return ans;
    }
    public char findKthBit(int n, int k) {
        long lenCurr = getLen(n);
        long lenPrev = (lenCurr-1)/2; //length of string S(n-1)
        long midIndex = lenPrev+1;

        if(n==1){
            return '0';
        }
        if(k==midIndex){
            return '1';
        } else if(k<midIndex) {
            return findKthBit(n-1, k);
        } else {
            long kFromBack = lenCurr-k+1;
            int indexInPrevString = (int)(kFromBack); //prev string is reversed so kth index from back
            
            return flip(findKthBit(n-1, indexInPrevString));
        }

    }
}
