Traverse the array and count the plantable elements, for any current element i, `i` is plantable if `(i-1)==0`  and `(i+1)==0` and last element was not planted.

If the plantable count>=n return true.

Time Complexity : `O(n)`
Space Complexity: `O(1)`
