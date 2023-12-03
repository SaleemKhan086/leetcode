class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer> charCount = new HashMap<>();
        for(int i=0; i<chars.length(); i++) {
            char c = chars.charAt(i);
            charCount.put(c, charCount.getOrDefault(c,0)+1);
        }

        int ans = 0;
        for(int i=0;i<words.length;i++) {
            String str = words[i];
            Map<Character,Integer> currCount = new HashMap<>();
            boolean goodString = true;
            for(int j=0; j<str.length(); j++) {
                char c = str.charAt(j);
                currCount.put(c, currCount.getOrDefault(c,0)+1);
                if(currCount.get(c) > charCount.getOrDefault(c,0)) {
                    goodString = false;
                    break;
                }
            }
            
            if(goodString) {
                ans+= str.length();
            }
        }

        return ans;
    }
}
