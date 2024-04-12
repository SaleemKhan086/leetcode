Total water collected = sum of water collected on top of each elevation.

On the top of any elevation, water will be collected by its left and right elevations. So,

`Water collected on any elevation = min(max height on its left, max height on its right) - height of the elvation`

We find the water collected on each elevation and the sum will be our answer.

To implement this, 
We iterate the array and keep storing left maximum of each of the elevation. (which will be equal to max elevation found so far)
Then we iterate the array from the last and keep track of right maximum. For each elevation, once we have the left maximum and right maximum, we can find the water collected on top of it using the above formula. Add the water collected to the answer.

Time Complexity : `O(n)`
Space Complexity: `O(n)`
