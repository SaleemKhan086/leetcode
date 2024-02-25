class Solution {
    // return true if s is a divisor of str;
    boolean isDivisor(String str, String s) {
        int i = 0;
        int n = str.length();
        int l = s.length();
        if(n%l != 0){
            return false;
        }
        while(i<n) {
            String substr = str.substring(i, i+l);
            if(!substr.equals(s)){
                return false;
            }
            i+= l;
        }

        return true;
    }

    public String gcdOfStrings(String str1, String str2) {
        int l = Math.min(str1.length(),str2.length());
        
        int curr_l = 1;
        String ans = "";
        while(curr_l <= l) {
            String subStr = str1.substring(0, curr_l);
            if(isDivisor(str1, subStr) && isDivisor(str2, subStr)){
                ans = subStr;
            }
            curr_l++;
        }

        return ans;
    }
}
