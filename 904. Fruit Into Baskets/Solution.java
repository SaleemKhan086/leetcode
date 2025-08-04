class Solution {
    public int totalFruit(int[] fruits) {
        int i = 0;
        int j = 0;
        int n = fruits.length;

        int firstType = 0;
        int secondType = 0;
        int count = 0;
        int maxCount = 0;
        firstType = fruits[i];
        while(j<n && fruits[j]==firstType){
            j++;
        }
        if(j<n){
            secondType = fruits[j];
        } 
        count = j-i;
        maxCount = Math.max(count, maxCount);

        while(j<n){
            if(fruits[j]==firstType || fruits[j]==secondType){
                j++;
            } else {
                count = j-i;
                maxCount = Math.max(count, maxCount);
                int temp = j-1;
                while(fruits[temp]==fruits[j-1]){
                    temp--;
                }
                i = temp+1;
                firstType = fruits[i];
                secondType = fruits[j];
            }
        }
        count = j-i;
        maxCount = Math.max(count, maxCount);
        return maxCount;
    }
}
