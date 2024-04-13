First, create and integer array from the char array.
Then, in every row, count the no. of continuous 1's starting with current cell and store it into the `dp` array.
Then, we calculate column-wise,
For each column, run an `n^2` loop, to calculate the for each pair of rows. 
For any colum `c`, from row `s` to row `e`, the area of max rectangle will be its `height*width`.
height = `e-s+1`
width = min among all the values from `dp[s][c]` till `dp[e][c]`
So `area = height*width`

Keep track of max area. At the end of the loop, we have our maximum area.


Complexity where n = no. of rows and m = no. of colums
Time Complexity : `O(n*n*m)`
Space Complexity: `O(n*m)`