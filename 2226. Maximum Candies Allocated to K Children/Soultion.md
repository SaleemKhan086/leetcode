## Intuition:
As per the question, each child will get equal no. of candies(lets suppose `C`), we need to split the existing piles in such a way that at least `k` piles have at least `C` no. of candies. 

Now, we need to maximize `C`. 

## Solution:

Min possible value for `C` will be 1. (each kid gets 1 candy)
Max possible value for `C` will be the max of `candies[i]` (each kid gets max no. of candies)
To find the right value of `C` we apply binary search on all the possible values of `C`.

In binary search we check for each value of `C` if it is possible to distribute. 
If yes, we increase the values of `C` and check for that.
If no, we decrease the value of `C` and check for that.

The max value of `C` for which we can distribute the candies will be our ans.

**How do we calculate canDistribute?**   
We simply traverse the `candies` array and for each pile we check how many piles it can be split into the piles of size `c`(that will simply be `candies[i]/c`) and keep the count.
Then we check if the count is greater than or equal to `k`, that means we can distribute. Otherwise not.


## Complexity:
Time Complexity: `Nlog(N)`
Space Complexity: `O(1)`
