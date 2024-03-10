class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i], 1);
        }
        
        int size = 0;
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])!=2){
                map.put(nums2[i],2);
                size++;
            }
        }

        int ans[] = new int[size];
        int i = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==2){
                ans[i++] = entry.getKey();
            }
        }
        return ans;
    }
}
