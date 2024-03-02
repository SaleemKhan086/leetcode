Find the index of first element which is >=0. Now start two pointers from this element.
On the starting ofthe loop,
`i` will point to the last negative element.
`j` will point to the first non-negative element (>=0).

Now compare the absolute value of both and insert the square of `min(abs(nums[i]), nums[j])` into the ans array and move the pointer further (`i--` or `j++`) . Repeat the process until all the elements are done.

Time Complexity : `O(n)`
Space Complexity: `O(1)`