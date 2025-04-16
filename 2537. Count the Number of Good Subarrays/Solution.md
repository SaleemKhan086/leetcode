Any integers satisfying `i < j` and `arr[i] == arr[j]` condition are basically two equal elements of the array. So, any element can pair with all its other occurences. So if there are already `f` occurences, then adding one more occurence will add `f` new good pairs.

We traverse the array and keep track of frequency of the elements, start index and end index. 

So if a subarray, starting with `i` and ending with `j` has `k` no. of good pairs, then we can consider all the subarrays starting with `i` and ending with indices `>=j`. Then we increment `i` till we have the pairs count `>=k` and keep adding the count similar way.


Time Complexity: $O(n)$

Space Complexity: $O(n)$