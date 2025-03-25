class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        //sort by starting x index
        Arrays.sort(rectangles, Comparator.comparingInt(row -> row[0]));

        int gaps = 0;
        int maxEndX = rectangles[0][0];
        for(int i=0;i<rectangles.length;i++){
            int startx = rectangles[i][0];
            int endx = rectangles[i][2];
            if(startx>=maxEndX) {//there is gap
                maxEndX = endx;
                gaps++;
            } else {
                maxEndX = Math.max(maxEndX, endx);
            }
            if(gaps>=3){
                return true;
            }
        }

        //sort by starting y index
        Arrays.sort(rectangles, Comparator.comparingInt(row -> row[1]));

        gaps = 0;
        int maxEndY = rectangles[0][1];
        for(int i=0;i<rectangles.length;i++){
            int starty = rectangles[i][1];
            int endy = rectangles[i][3];
            if(starty>=maxEndY) {//there is gap
                maxEndY = endy;
                gaps++;
            } else {
                maxEndY = Math.max(maxEndY, endy);
            }
            if(gaps>=3){
                return true;
            }
        }

        return false;
    }
}
