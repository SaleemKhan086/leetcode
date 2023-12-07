class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        int oddIndex = -1;
        for(int i=n-1;i>=0;i--) {
            if(Character.getNumericValue(num.charAt(i))%2 == 1){
                oddIndex = i;
                break;
            }
        }

        return num.substring(0,oddIndex+1);
    }
}
