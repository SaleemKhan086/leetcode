No bag is empty, so basically, we need to divide the marbles into `k` groups. If the `i`th marble and `j`th marble are in a bag, then all marbles with an index between the `i`th and `j`th indices should also be in that same bag. That means each group has adjascent marbles. 

Hence we need to divide the array into `k` subarrays. In other words, we need to make `k-1` cuts into the array. 

For scores, for `i` to `j` group, `score = weights[i] + weights[j]`. So at every cut, if the cut is made between some `index` and `index+1`, `weights[index]` and `weights[index+1]` both will add to the score.

So we just need to find the `k-1` cuts positions so that the sum of `weights[index]` and `weights[index+1]` is `minimum` for min score . And its `maximum` for max score. 
Return the difference between two.


First we iterate through the weights and get all the possible cuts positions and their contributions to the score. 

We can cut at any index, so cut can be made at position `0,1,...n-1`. And for every cut, its contribution to the score will be the sum of adjascent elements. ie. for cut at position `0`, the contribution will be `weights[0]+weights[1]`... and so on. We store the contributions into the `cuts` array.

Then we need to find the k-1 min contributions to get the min score, and
we need to find the k-1 max contributions to get the max score.

**size of cuts array is n-1 because for an array of size n, there are n-1 possible cuts**

`min_score = sum of k-1 min cuts + cuts[0] + cuts[n-2]`
`max_score = sum of k-1 max cuts + cuts[0] + cuts[n-2]`

But at the end we need to return `max_score-min_score`, so `cuts[0]+cuts[n-2]` will cancel out, so we can just calculate `sum of k-1 min cuts` and 
`sum of k-1 max cuts`.


We sort the `cuts` array and calculate sum of `k-1` min and max contributions.

Return the difference between max and min.

Time Complexity: $O(nlog(n))$

Space Complexity: $O(n)$