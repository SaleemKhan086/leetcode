class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Character> stk = new Stack<>();
        for(int i=0;i<num.length();i++){
            char c = num.charAt(i);
            while(!stk.empty() && stk.peek()>c && k>0){
                stk.pop();
                k--;
            }

            if(stk.empty()){
                if(c!='0'){
                    stk.push(c);
                }
            }else{
                stk.push(c);
            }
        }

        while(!stk.empty() && k>0){
            stk.pop();
            k--;
        }

        StringBuilder str = new StringBuilder();
        while(!stk.empty()){
            str.append(stk.pop());
        }
        if(str.length()==0){
            str.append('0');
        }
        return str.reverse().toString();

    }
}
