Traverse the tree and for each leaf node, if its the left child, add to the sum.
In recursion, for each node, 
if its leaf node:
    if its left child:
        return its value
    else return 0

if its a non-leaf node:
    return the sum of recursive calls for its children

Time Complexity : `O(n)`
Space Complexity: `O(n)`
