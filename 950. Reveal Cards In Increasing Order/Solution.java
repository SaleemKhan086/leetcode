class Solution {
    int next(int[] arr, int j){
        while(j<arr.length && arr[j]!=0){
            j++;
        }
        if(j==arr.length){
            j = 0;
        }
        while(j<arr.length && arr[j]!=0){
            j++;
        }
        return j;
    }
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int[] ans = new int[n];
        Arrays.sort(deck);

        int count = 0;
        int i = 0;
        int j = 0;
        while(count<n){
            ans[j] = deck[i];
            i++;
            j = next(ans, j);
            if(count<n-1){
                j = next(ans, j+1);
            }
            count++;
        }

        return ans;
    }
}
