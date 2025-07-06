class FindSumPairs {
    int[] arr1;
    int[] arr2;
    Map<Integer,Integer> map;
    public FindSumPairs(int[] nums1, int[] nums2) {
        map = new HashMap<>();
        arr1 = new int[nums1.length];
        arr2 = new int[nums2.length];
        for(int i=0;i<nums1.length;i++){
            arr1[i] = nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            arr2[i] = nums2[i];
            map.put(nums2[i], map.getOrDefault(nums2[i],0)+1);
        }
    }
    
    public void add(int index, int val) {
        map.put(arr2[index], map.get(arr2[index])-1);
        arr2[index]+= val;
        map.put(arr2[index], map.getOrDefault(arr2[index],0)+1);
    }
    
    public int count(int tot) {
        int count = 0;
        for(int i=0;i<arr1.length;i++){
            count+= map.getOrDefault(tot-arr1[i],0);
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */
