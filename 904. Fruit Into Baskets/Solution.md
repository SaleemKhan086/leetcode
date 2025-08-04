We have two baskets and each basket can hold only one type of fruits.
We have to pick fruit from each tree when we start moving. So when we reach a fruit which is not of type that fits into two of our baskets, thats when we stop.

So starting from any index i, we pick up till we have only two values.

So we need to find the subarrays which consist of max two values and return the maximum length of such subarray.

Time Complexity: $O(n)$
Space Complexity:$O(1)$