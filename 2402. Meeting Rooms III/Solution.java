class Solution {
    public int mostBooked(int n, int[][] meetings) {
        long rooms[] = new long[n];
        int counter[] = new int[n];
        
        Arrays.sort(meetings, new Comparator<int[]>(){
            public int compare(int[] arr1, int[] arr2){
                if(arr1[0]==arr2[0]){
                    return Integer.compare(arr1[1],arr2[1]);
                }
                return Integer.compare(arr1[0], arr2[0]);
            }
        });

        for(int i=0;i<meetings.length;i++){
            int start = meetings[i][0];
            int end = meetings[i][1];
            long min = rooms[0];
            int minIndex = 0;
            boolean assigned = false;
            for(int j=0;j<n;j++){
                if(rooms[j]<=start){
                    rooms[j] = end;
                    counter[j]++;
                    assigned = true;
                    break;
                }
                if(rooms[j]<min){
                    min = rooms[j];
                    minIndex = j;
                }
            }
            if(!assigned){
                rooms[minIndex]+= (end-start);
                counter[minIndex]++;
            }
        }
        int max = 0;
        int maxIndex = 0;
        for(int i=0;i<n;i++){
            if(counter[i]>max){
                max = counter[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
