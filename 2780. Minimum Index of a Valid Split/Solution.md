For each index, we check if we can split at that index. If yes, simply return that index because that is the first one (min one) we can split one. Otherwise continue the loop.

If no split index is found then return -1.


To check for any index, we need the majority element and the count of majority element. So we first find these.

Find the majority element using Moore's voting algorithm. 
Then find the count of the majority element found in the previous step.

Then loop through the array and check for each index `i` if array can be split on the index `i`.

To check if the array can be split at any index `i`, we check,   
if the count of majority element till i is still a majority and count of majority element in the remaining array(after i) is still a majority

Time Complexity: $O(n)$

Space Complexity: $O(1)$