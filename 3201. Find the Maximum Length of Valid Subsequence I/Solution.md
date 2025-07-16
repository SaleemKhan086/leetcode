As per the problem, the sums for every pair of numnbers shoud be either even or odd.
For any two numbers to have even sum, either both should be even or both should be odd.
For any two numebrs to have odd sum, one should be even and one should be odd.

So, for the condition to satisfy, 
if we take the case that the sum is even,
either all the elements of the subsequence should be even or all elements should be odd.
if we take the case that the sum is odd,
the elements of the subsequence should be alternate (odd,even,odd,even...).

So it comes to 3 cases to check:
1. all even
2. all odd
3. alternates

So calculate length for all 3 cases and return the maximum of all 3.

Time Complexity: $O(n)$
Space Compexity: $O(1)$
