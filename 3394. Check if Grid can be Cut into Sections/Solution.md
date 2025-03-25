The idea is, we can divide the space into 3 sections -> ie. we can make 2 cuts, if we find that there are (atleast)2 gaps between the ending point and starting point of the rectangles.

For eg. if we are checking for horizontal split, that means we are making cuts on x-direction, so we check if there are at least two gaps in between the ending-x point and starting-x point of the rectangles. Similarly, for vertical cuts, we check for y-direction.

**Note: We only need 2 gaps, but still in our code, we check for gaps>=3 (not 2).
That is because the way we have intialized the maxEndX and maxEndY variables and loop starts from 0. So while processing the first element, it will always increment the gaps variable. Hence to compensate that, we check for gaps>=3.**

Time Complexity: $O(nlog(n))$

Space Complexity: $O(log(n))$  // because in java sort function is implemented using quick sort.
