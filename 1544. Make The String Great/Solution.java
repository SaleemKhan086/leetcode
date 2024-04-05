class Solution {
    boolean areBad(StringBuilder str, int i, int j){
        return (Character.isLowerCase(str.charAt(i)) && Character.toUpperCase(str.charAt(i))==str.charAt(j)) ||
        (Character.isLowerCase(str.charAt(j)) && Character.toUpperCase(str.charAt(j))==str.charAt(i));
    }

    int findBad(StringBuilder str){
        for(int i=0;i<str.length()-1;i++){
            if(areBad(str, i, i+1)){
                return i;
            }
        }
        return -1;
    }

    public String makeGood(String s) {
        StringBuilder str = new StringBuilder(s);
        boolean isGood = false;

        while(!isGood) {
            int badIndex = findBad(str);
            isGood = badIndex==-1;
            if(badIndex!=-1){
                str.delete(badIndex, badIndex+2);
            }
        }

        return str.toString();
    }
}
