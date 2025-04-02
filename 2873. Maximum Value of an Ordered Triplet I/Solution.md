We need to maximize `(nums[i]-nums[j])*nums[k]`, So the `nums[k]` will be always maximum possible value that occurs after the index `j`. So we store the `maxTillHere` for all the elements, to avoid traversing the array for finding `k` which is the max value after the index `j`.

Then we check for all the pairs of `i` and `j` and calculate the maxValue.

Time Complexity: $O(n^2)$

Space Complexity: $O(n)$