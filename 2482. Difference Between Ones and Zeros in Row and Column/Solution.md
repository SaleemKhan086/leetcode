Rewrite the formula:
from : `diff[i][j] = onesRowi + onesColj - zerosRowi - zerosColj`
to : `diff[i][j] = onesRowi - zerosRowi +  onesColj - zerosColj`

So we traverse the grid. For every row, we calculate (count of ones - count of zeros) and update it in diff in all the cells in current row.
This way we have calculated first half of the formula and its stored in the diff matrix.

Now we traverse the grid by columns, for every column, we calculate the (count of ones - count of zeros), and add the result for to exisit value in the diff matrix in all the cells in current column.
We calculate the second half of the formula in this second iteration and complete the calculation by adding it to the existing diff values from previous iteration.

The final diff matrix after these two iterations is the answer.

Time complexity : O(m*n)
Space complexity : O(1)
