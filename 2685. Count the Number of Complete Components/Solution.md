Get the connected components using simply DFS. In one connected component, store all the elements in the connected component, into a set. Then, to check it he connected component is a complete connected component, do the following: 

As per the question, the connected component will be a complete connected component if there is an edge between all pairs of its nodes. That means, in the adjascency metrics, corresponding to every node, the connected nodes list will contain all the elements present in the set. So the size of the `adj[node] == set.size()-1`, -1 is because the set contains the `node` element also but `adj[node]` doesn't contain the `node` element. Hence set size will be 1 more than the adj[node] size.

Time Complexity: $$O(V+E)$$

Space Complexity: $$O(V+E)$$