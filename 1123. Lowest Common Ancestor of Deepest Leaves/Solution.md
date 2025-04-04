We traverse the tree 3 times. First to get the height of the tree(ie. the max depth of the tree).

Second iteration, we traverse the tree and for each node, we store the count of deepest nodes under that node into the map.

In the third iteration, we find out the least common ancestor by processing the nodes which have deepdestNodeCount== totalDeepestNodesCount.

Time Complexity: $O(n)$

Space Complexity: $O(n)$