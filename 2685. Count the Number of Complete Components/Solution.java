class Solution {
    private void traverse(int curr, List<List<Integer>> adj, boolean[] visited, Set<Integer> componentNodes){
        if(visited[curr]){
            return;
        }
        visited[curr] = true;
        componentNodes.add(curr);
        List<Integer> nodes = adj.get(curr);
        for(int i=0;i<nodes.size();i++){
            traverse(nodes.get(i), adj, visited, componentNodes);
        }
        return;
    }

    private boolean checkComplete(Set<Integer> nodes, List<List<Integer>> adj){
        boolean ans = true;
        for(int node: nodes){
            if(adj.get(node).size() != nodes.size()-1){
                return false;
            }
        }
        return true;
    }

    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int src = edges[i][0];
            int dest = edges[i][1];
            adj.get(src).add(dest);
            adj.get(dest).add(src);
        }
        
        int completeComponents = 0;
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                Set<Integer> componentNodes = new HashSet<>();
                traverse(i, adj, visited, componentNodes);
                boolean isComplete = checkComplete(componentNodes, adj);
                if(isComplete){
                    completeComponents++;
                }
            }   
        }

        return completeComponents;
    }
}
