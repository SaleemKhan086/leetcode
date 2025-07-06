Store the freq of no's of larger array in a map.

For add operation: We need to add to nums2, so we decrement the count of old value from map, update the value in the array and increment the count of new value in the map.

For Count operation: We will traverse nums1(shorter array), and add the value of `tot-nums1[i]` from map. Return the total count.

lets say `m` = length of shorter array, `n` = length of longer array
`q` = no. of queries.

Time Complexity : $O(q*m)$
Space Complexity: $O(m+n)$
