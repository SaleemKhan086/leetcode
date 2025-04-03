We need to return the triplet `i<j<k`, such that `(nums[i] - nums[j]) * nums[k]` is maximum.

If we think about any element `j`, `nums[i]-nums[j]` should be maximum and `nums[k]` should be maximum.

1) `nums[i]-nums[j]` will be maximum, when `nums[i]` is maximum. So `nums[i]` is basically the max element of the array with `i<j`
2) `nums[k]` to be maximum, the `nums[k]` will be the max element of the array with `k>j`

Hence, for any element `j`, we can find the leftMax and rightMax in the array.That will be the `nums[i]` and `nums[k]` for the current element `nums[j]`.

In order to efficiently calculate maxLeft, we traverse the array from left to right, keeping track of the max element seen so far. That maxSoFar will be the maxLeft for current array. Similarly, we calculate rightMax by traversing the array right to left. 

Calculate the value for each possible `j` and return the max value.

Time Complexity: $O(n)$

Space Complexity: $O(n)$