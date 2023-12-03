class Solution {
    private int abs(int n){
        return n>=0?n:-n;
    }
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for(int i=1;i<points.length;i++){
            int x1 = points[i-1][0];
            int y1 = points[i-1][1];
            int x2 = points[i][0];
            int y2 = points[i][1];

            //ans+= mn+(mx-mn) = mx
            ans+= Math.max(abs(x2-x1), abs(y2-y1));;
        }

        return ans;
    }
}
