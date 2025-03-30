Each charater can be part of only one partition, so the first and last occurence of any character has to be part of single partition. So we find out first and last occurences of all the characters. 

To find out the non-overlapping partitions, we merge the overlapping ones by using merge overlapping intervals method.

After merging the overlapping ones, we get the non-overlapping final partitions.
Return the list of size of each partition.

Time Complexity: $O(n)$

Space Complexity: $O(1)$    //`[O(26)==O(1)]`