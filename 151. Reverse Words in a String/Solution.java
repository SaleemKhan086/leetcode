class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        List<String> words = new ArrayList<>();
        int i = 0;
        while(i<s.length()) {
            StringBuilder word = new StringBuilder();
            while(i<s.length() && s.charAt(i)==' '){
                i++;
            }
            while(i<s.length() && s.charAt(i)!=' ') {
                word.append(s.charAt(i));
                i++;
            }
            if(word.length()>0){
                words.add(word.toString());
            }
        }
        for(int j=words.size()-1;j>=0;j--){
            str.append(words.get(j));
            if(j>0){
                str.append(" ");
            }  
        }

        return str.toString();
    }
}
