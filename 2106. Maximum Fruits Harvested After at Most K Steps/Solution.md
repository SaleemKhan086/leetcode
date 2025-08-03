# Intuition
We can go 4 possible ways: 
1) all right
2) all left
3) some left then right
4) some right then left.

All right and all left cases can be covered in case 3 & 4 respectively. (case1  = case 3 when some left = 0 and similarly case 2 is covered in case 4)
So we calculate for case 3 and case 4 and return the max.

# Approach
First we create a map for position to amount to efficiently get the amount of fruits on a position.

Calculate and Store the total amount of fruites collected if we walk `i` steps towards a direction. (we store one array for left direction and another one for right direction)

Then we calculate the above mentioned Case 3 & case 4.
To calculate the cases, for eg.3,
In the first direction we increment the steps by 2 everytime because steps for return will also count. If we have counted `steps` steps in first direction, that means we have collected fruits till `steps/2` in that direction. And we can go the remaining steps in the other direction so `k-steps` in the other direction.

Keep track of the max.

# Complexity
- Time complexity: $O(n)$

- Space complexity: $O(n)$
