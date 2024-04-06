class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder str = new StringBuilder();
        
        Stack<Integer> openIndexes = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                str.append(s.charAt(i));
                openIndexes.push(str.length()-1);
            }
            else if(s.charAt(i)==')'){
                if(!openIndexes.empty()){
                    str.append(s.charAt(i));
                    openIndexes.pop();
                }
            }
            else{
                str.append(s.charAt(i));
            }
        }

        while(!openIndexes.empty()){
            str.deleteCharAt(openIndexes.pop());
        }

        return str.toString();
    }
}
