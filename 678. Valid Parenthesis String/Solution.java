class Solution {
    public boolean checkValidString(String s) {
        
        int stars = 0;
        int open = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open++;
            }
            else if(s.charAt(i)=='*'){
                stars++;
            }
            else {
                if(open>0){
                    open--;
                }
                else if(stars>0){
                    stars--;
                }
                else return false;
            }
        }

        int close = 0;
        stars = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==')'){
                close++;
            }
            else if(s.charAt(i)=='*'){
                stars++;
            }
            else {
                if(close>0){
                    close--;
                }
                else if(stars>0){
                    stars--;
                }
                else return false;
            }
        }

        return true;
    }
}
