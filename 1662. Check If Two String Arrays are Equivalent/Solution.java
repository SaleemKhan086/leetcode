class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n1 = word1.length;
        int n2 = word2.length;

        int index1 = 0;
        int index2 = 0;
        int i = 0;
        int j = 0;

        while(index1<n1 && index2<n2) {
            if(word1[index1].charAt(i)!=word2[index2].charAt(j)) {
                return false;
            }
            i++;
            j++;
            if(i==word1[index1].length()){
                i = 0;
                index1++;
            }
            if(j==word2[index2].length()){
                j = 0;
                index2++;
            }
        }

        return index1==n1 && index2==n2;
    }
}