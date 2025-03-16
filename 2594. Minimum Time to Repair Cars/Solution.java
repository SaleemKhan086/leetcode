class Solution {
    private boolean canBeRepairedInTime(int[] ranks, int cars, long time) {
        int count = 0;
        for(int i=0;i<ranks.length;i++){
            long nSquare = time/ranks[i];
            int carsRepaired = (int)Math.sqrt(nSquare);
            count+= carsRepaired;
            if(count>=cars){
                return true;
            }
        }
        return count>=cars;
    }
    
    public long repairCars(int[] ranks, int cars) {
        int n = ranks.length;
        long max = ranks[0];
        for(int i=0;i<n;i++){
            max = Math.max(max, ranks[i]);
        }

        long start = 1;
        long end = (max*cars)*cars;
        long ans = 0;
        while(start<=end){
            long mid = (start+end)/2;
            if(canBeRepairedInTime(ranks, cars, mid)) {
                ans = mid;
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return ans;
    }
}
