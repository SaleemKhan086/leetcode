class Solution {
    private boolean isVowel(char c) {
        return c=='a' ||
        c=='e' ||
        c=='i' ||
        c=='o' ||
        c=='u' ||
        c=='A' ||
        c=='E' ||
        c=='I' ||
        c=='O' ||
        c=='U';
    }
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length()-1;

        StringBuilder str = new StringBuilder(s);
        while(i<j){
            while(i<j && !isVowel(s.charAt(i))){
                i++;
            }
            while(i<j && !isVowel(s.charAt(j))){
                j--;
            }

            char temp = str.charAt(i);
            str.setCharAt(i,str.charAt(j));
            str.setCharAt(j,temp);
            i++;
            j--;
        }
        return str.toString();
    }
}