class Solution {
    boolean performAnd(List<Boolean> list) {
        boolean ans = list.get(0);
        for(int i=1;i<list.size();i++){
            ans = ans&list.get(i);
        }
        return ans;
    }
    boolean performOr(List<Boolean> list) {
        boolean ans = list.get(0);
        for(int i=1;i<list.size();i++){
            ans = ans|list.get(i);
        }
        return ans;
    }
    int skip(String expression, int start) {
        int count = 1;
        int i = start+1;
        while(i<expression.length() && count>0){
            if(expression.charAt(i)=='('){
                count++;
            }
            else if(expression.charAt(i)==')'){
                count--;
            }
            i++;
        }
        return i;
    }
    List<Boolean> evaluateBracket(String expression, int start) {
        List<Boolean> ans = new ArrayList<>();
        int i = start+1;
        int count = 1;
        char curr = '(';
        while(count!=0 && curr!=')') {
            curr = expression.charAt(i);
            if(curr=='t') {
                ans.add(true);
                i++;
            } 
            else if(curr=='f'){
                ans.add(false);
                i++;
            }
            else if(curr==')'){
                count--;
                i++;
            }
            else if(curr=='&'){
                ans.add(performAnd(evaluateBracket(expression, i+1)));
                i = skip(expression, i+1);
            }
            else if(curr=='|'){
                ans.add(performOr(evaluateBracket(expression, i+1)));
                i = skip(expression, i+1);
            }
            else if(curr=='!'){
                ans.add(!(evaluateBracket(expression, i+1)).get(0));
                i = skip(expression, i+1);
            }
            else {
                i++;
            }
        }
        return ans;
    }
    public boolean parseBoolExpr(String expression) {
        char curr = expression.charAt(0);
        if(curr=='&'){
            return performAnd(evaluateBracket(expression, 1));
        }
        else if(curr=='|'){
            return performOr(evaluateBracket(expression, 1));
        }
        else if(curr=='!'){
            return !(evaluateBracket(expression, 1).get(0));
        }
        return false;
    }
}
