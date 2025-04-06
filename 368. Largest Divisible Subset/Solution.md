The problem is to find longest subsequece with condition that any `(i,j)` in the subsequence, holds this condition: `nums[i]%nums[j]==0 or nums[j]%nums[i]==0`. In simple words, every element either divides or is divisible by every other element in our chosen subsequence.

To hold the above condition, the largest element in the subsequence will be divisible by all other elements.

So for an existing subsequence, if we want to check for a new element if it satisfy the condition, we can check if it divides or divisible by all the other elements of the exisitng subsequence. 

If we sort the input array, it becomes even simpler, we know that the new element is greater than all the existing ones so we can just check if it is divisible by all the exising elements. Now, if we combine it with the fact that the largest element in the existing subsequence is divisible by all other exising elements, then if the new element is divisible by the larget existing element, that means it is divisible by all other existing elements.

So the final condition that needs to be checked becomes :
`new_element % largest_existing_element == 0`

**Implementation:**    
First we sort the input array.    
Then we traverse the array -> for each element, we check all the smaller elements if that divides the current element, means that the current element can be added to the subsequence ending there. (because we are checking for the larget elements only).

So we keep track of the max length of the subsequence found for each element.

We need to return the elements of the final subsequence, so to re-generate the longest subsequence satisfying our condition, we also keep track of the last element in the subsequence.

At the end we retrace the longest subsequence starting with the maximum length index and traversing the `lastElements` array.


Time Complexity: $O(n^2)$

Space Complexity: $O(n)$