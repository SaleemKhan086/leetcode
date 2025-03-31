class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        int[] cuts = new int[n-1];
        for(int i=0;i<n-1;i++){
            cuts[i] = weights[i]+weights[i+1];
        }
        Arrays.sort(cuts);
        long min = 0;
        long max = 0;
        for(int i=0;i<k-1;i++){
            min = min+cuts[i];
            max = max+cuts[n-2-i];
        }
        return max-min;
    }
}
