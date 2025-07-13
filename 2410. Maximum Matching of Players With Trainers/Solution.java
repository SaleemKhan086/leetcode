class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int n = players.length;
        int m = trainers.length;
        int i = 0;
        int j = 0;

        int count = 0;
        while(i<n && j<m){
            while(j<m && players[i]>trainers[j]){
                j++;
            }
            
            if(j<m) {
                count++;
                i++;
                j++;
            }
        }
        return count;
    }
}
