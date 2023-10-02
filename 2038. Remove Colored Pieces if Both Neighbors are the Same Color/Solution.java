class Solution {
    
    private boolean countsForChar(String colors, int i, char ch) {
        if(i<=0 || i>=colors.length()-1) {
            return false;
        }
        return colors.charAt(i)==ch
            && colors.charAt(i-1)==ch
            && colors.charAt(i+1)==ch;
    }
    
    public boolean winnerOfGame(String colors) {
        if(colors.length()<=2) {
            return false;
        }
        
        int countA = 0;
        int countB = 0;
        
        for(int i=1;i<colors.length()-1;i++) {
            if(countsForChar(colors, i, 'A')) {
                countA++;
            }
            else if(countsForChar(colors, i, 'B')) {
                countB++;
            }
        }
        
        return countA>countB;
    }
}
