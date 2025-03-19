Iterate throught the array, if a 0 is encountered, do the flip operation on the 3 elements starting with the current element and continue with the loop.

By doing this, we will make all the elements till index `n-3` to 1. So at last we check for the last elements, if they are set to 1, then we return the count of operations performed. Else there is no way to set them to 1, so we return -1.


Time Complexity : $O(n)$   
Space Complexity : $O(1)$