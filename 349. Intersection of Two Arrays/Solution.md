Traverse the first array and store the elements in a map with key as the element and value as `1`.
Traverse the second array and if the element `nums2[i]` already exists in the map with `value = 1`, that means it exists in `nums1` as well. So change the value in map to `2` and increment `size++`.

At the end of the loop, we will have:
size = no. of common elements ie. its the required size of the ans array.
HashMap will contain `value = 2` for the common elements.

Finally, initialize an ans array of size =  `size`.
Traverse the map and put the keys with value=2, into the ans array. That will give us the intersection array.

Time Complexity : `O(n)`
Space Complexity: `O(n)`