The approach is to traverse through all the characters of every element in both arrays.
We traverse both the arrays simultaneously and keep comparing the characters.
If at any point the characters don't match, then just return `false`.

At the end of the loop we will have to check condition for the length of both the strings. We do this by checking if both the indexes reach the end of both arrays.
if yes, that means length is also equal so return `true` otherwise return `false`.