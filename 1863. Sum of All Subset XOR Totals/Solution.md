Traverse through all the subset combinations of the array recursively.

To do that, for each element of the array, consider both cases, its taken into subset or its not taken. And calculate the sum of xor recursively. Return addition of both cases.

Time Complexity: $O(n^2)$

Space Complexity: $O(n)$ //for recursion stack