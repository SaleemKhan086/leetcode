Check for all the substrings starting with length 1 till length min(str1.length(), str2.length())
For every substring, if it is a divisor of both str1 and str2, then update the value in ans.

At the end of loop, the ans will contain the max length substring that divides both str1 and str2.

Time Complexity: `O(n^2)`
Space Complexity: `O(n)`
