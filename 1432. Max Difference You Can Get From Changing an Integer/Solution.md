To make max Diff, we need to make one max possible no' and one min possible no' from the existing num.

To make max possible no., the largest number will be formed if it starts will 9s. So we find the first non-nine digit and replace all its occurences with 9.

To make min possible no., the digits should be 1's(as the no. cannot be zero and cannot start with zero) or 0's. So we find the first digit greater than 1 and replace all its instances.
To replace, we replace with 1 if the num doesn't start with 1. And we replace with 0, if the no. starts with 1.

Reason being:
If the no. starts with 1, then it already starts with min possible digit, we can replace rest of the digits with 0's to make it minimum. So we find next digit greater than 1 and replace all its occurences with 0.

If no. doesn't start with 1, then we make it start with min possible digit (ie. 1), so we replace all occurences of first digit with 1.

Time Complexity: `O(logn)`
Space Complexity: `O(1)`
