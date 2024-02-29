class Solution {
    private int getVal(int[] flowerbed, int i){
        if(i<0){
            return 0;
        }
        if(i>=flowerbed.length){
            return 0;
        }
        return flowerbed[i];
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length<n){
            return false;
        }
        int count = 0;
        boolean prevPlanted = false;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                if(getVal(flowerbed, i-1)==0 && getVal(flowerbed, i+1)==0 && !prevPlanted){
                    count++;
                    prevPlanted = true;
                }
                else {
                    prevPlanted = false;
                }
            }
            else {
                prevPlanted = false;
            }
        }

        return count>=n;
    }
}