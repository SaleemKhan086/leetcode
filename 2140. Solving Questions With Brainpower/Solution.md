For every element, consider both the cases `solve it` or `not solve it` and recursively calculate the answer. Return the max of both cases answers.

To avoid repeated recursion calls, we use `dp` array to store the result for `i`th index and return it from the `dp` array, if already calculated.

Time Complexity: $O(n)$

Space Complexity: $O(n)$