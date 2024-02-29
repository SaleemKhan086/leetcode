Do the level order traversal of the tree. 
For each level keep checking the conditions, 
even level -> values should be odd and strictly increasing
odd level -> values should be even and strictly decreasing

If at any level, for any element the conditions don't meet, return false.

If the full traversal is done without violating the conditions, return true.
