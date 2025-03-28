class Solution {
    public int[] maxPoints(int[][] grid, int[] queries) {
        int k = queries.length;
        int n = grid.length;
        int m = grid[0].length;
        Map<Integer,List<Integer>> map = new HashMap<>();
        
        for(int i=0;i<k;i++){
            List<Integer> list = map.getOrDefault(queries[i],new ArrayList<>());
            list.add(i);
            map.put(queries[i],list);
        }
        Arrays.sort(queries);

        boolean[][] visited = new boolean[n][m];
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>((a,b)-> a.get(0)-b.get(0));
        pq.add(List.of(grid[0][0],0,0));
        visited[0][0] = true;

        int[] points = new int[k];
        int pts = 0;
        for(int i=0;i<k;i++){
            while(!pq.isEmpty() && pq.peek().get(0)<queries[i]){
                List<Integer> list = pq.remove();
                int r = list.get(1);
                int c = list.get(2);
                pts++;
                if(r-1>=0 && !visited[r-1][c]){
                    pq.add(List.of(grid[r-1][c],r-1,c));
                    visited[r-1][c] = true;
                }
                if(r+1<n && !visited[r+1][c]){
                    pq.add(List.of(grid[r+1][c],r+1,c));
                    visited[r+1][c] = true;
                }
                if(c-1>=0 && !visited[r][c-1]){
                    pq.add(List.of(grid[r][c-1],r,c-1));
                    visited[r][c-1] = true;
                }
                if(c+1<m && !visited[r][c+1]){
                    pq.add(List.of(grid[r][c+1],r,c+1));
                    visited[r][c+1] = true;
                }
            }
            points[i] = pts;
        }

        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            List<Integer> indexes = map.get(queries[i]);
            for(int index: indexes){
                ans[index] = points[i];
            }
            map.put(queries[i],new ArrayList<>());
        }

        return ans;
    }
}
