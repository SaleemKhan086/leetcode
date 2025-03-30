class Solution {
    private List<List<Integer>> mergeOverLapping(List<List<Integer>> inputList) {
        List<List<Integer>> list = inputList.stream().filter(l -> l.size()>0).collect(Collectors.toList());
        int n = list.size();
        list.sort((a,b) -> {
            return a.get(0)-b.get(0);
        });

        List<List<Integer>> merged = new ArrayList<>();
        for(int i=0;i<n;){
            int start = list.get(i).get(0);
            int end = list.get(i).get(1);
            int j = i+1;
            while(j<n && list.get(j).get(0)<end){
                end = Math.max(end, list.get(j).get(1));
                j++;
            }
            merged.add(List.of(start,end));
            i = j;
        }
        return merged;
    }
    public List<Integer> partitionLabels(String s) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<26;i++){
            list.add(new ArrayList<>());
        }

        for(int i=0;i<s.length();i++){
            int index = s.charAt(i)-'a';
            List<Integer> l = list.get(index);
            while(l.size()<2){
                l.add(i);
            }
            l.set(1,i);
        }

        List<List<Integer>> merged = mergeOverLapping(list);

        List<Integer> sizes = new ArrayList<>();
        for(List<Integer> interval: merged){
            sizes.add(interval.get(1)-interval.get(0)+1);
        }
        return sizes;
    }
}
