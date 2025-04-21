class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int n = differences.length;
        long min = 0;
        long max = 0;
        long sum = 0;

        for(int i=0;i<n;i++){
            sum+= differences[i];
            min = Math.min(min,sum);
            max = Math.max(max,sum);
        }

        long lowerCount = lower-min;
        long upperCount = upper-max;
        int ans = (int)(upperCount-lowerCount+1);

        return ans<0?0:ans;
    }
}
