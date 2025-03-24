class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));

        int freeDays = 0;
        freeDays+= meetings[0][0]-1;
        int maxEnd = meetings[0][0];
        for(int i=0;i<meetings.length;i++){
            int start = meetings[i][0];
            int end = meetings[i][1];
            if(start<=maxEnd){
                maxEnd = Math.max(maxEnd, end);
            } else {
                freeDays+= start-maxEnd-1;
                maxEnd = end;
            }
        }

        freeDays+= days-maxEnd;

        return freeDays;
    }
}
