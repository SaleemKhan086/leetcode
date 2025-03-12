The array is sorted in non-decreasing order, So all the elements will be first negatives, then zeros and then positives.

To get the count of negative integers, find the position of the last occuring negative integer.    
So,   
count of negative integers will be = index of last occuring negative integer + 1;   
Similarly for positive integers,   
count of positive integers will be = n - index of first occuring positive integer;   

We use **binary search** to find the first positive integer and last negative integer.

Time Complexity: `O(log(n))`

Space Complexity: `O(1)`