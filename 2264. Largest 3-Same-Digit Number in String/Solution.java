class Solution {
    private String getString(char c) {
        return c=='$'?"":""+c+c+c;
    }
    public String largestGoodInteger(String num) {
        char ans = '$';
        for(int i=0;i<num.length()-2;i++){
            char c = num.charAt(i);
            if(c == num.charAt(i+1) && c == num.charAt(i+2)) {
                if(ans=='$' || ans<c){
                    ans = c;
                }
            }
        }

        return getString(ans);
    }
}
