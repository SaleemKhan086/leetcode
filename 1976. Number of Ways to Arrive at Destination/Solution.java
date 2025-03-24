class Solution {
    private class Node{
        int dest;
        int time;
        public Node(int dest, int time){
            this.dest = dest;
            this.time = time;
        }
        public String toString(){
            return this.dest+ " " + this.time;
        }
    }
    
private void printArr(long[] arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
    }
    System.out.println("");
}
    private int minDistance(long dist[], boolean processed[])
    {
        long min = 1000000000000l;
        int min_index = -1;
        for (int v = 0; v < dist.length; v++){
            if (processed[v] == false && dist[v] < min) {
                min = dist[v];
                min_index = v;
            }
        }
        return min_index;
    }

    public int countPaths(int n, int[][] roads) {
        final int MOD = 1000000000+7;
        List<List<Node>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<roads.length;i++){
            int src = roads[i][0];
            int dest = roads[i][1];
            int time = roads[i][2];
            adj.get(src).add(new Node(dest,time));
            adj.get(dest).add(new Node(src, time));
        }
        long[] dist = new long[n];
        boolean processed[] = new boolean[n];
        int[] ways = new int[n];
        for (int i=0; i<n; i++) {
            dist[i] = 1000000000000l;
            processed[i] = false;
            ways[i] = 0;
        }

        dist[0] = 0;
        ways[0] = 1;

        for (int count = 0; count<n-1; count++){
            int u = minDistance(dist, processed);
            processed[u] = true;
            for (int i = 0; i < adj.get(u).size(); i++){
                int v = adj.get(u).get(i).dest;
                if (!processed[v] && dist[u] != Integer.MAX_VALUE
                    && dist[u] + adj.get(u).get(i).time <= dist[v]){
                        if(dist[u] + adj.get(u).get(i).time < dist[v]){
                            ways[v] = ways[u];
                        } else {
                            ways[v] = (ways[u]%MOD + ways[v]%MOD)%MOD;
                        }
                        dist[v] = dist[u] + adj.get(u).get(i).time;
                }
            }
        }
        
        return ways[n-1];
    }
}
