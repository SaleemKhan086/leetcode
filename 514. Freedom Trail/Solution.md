We have to set ring elements equal to `key[i]` for every `i` in key.

So for every `i` in key, we find all the matches in ring (there can be duplicates in ring) and set it to the top (12:00 position).
The press the button and move on the next key element that is `i+1`.

So steps for each `i` will be = Min(steps for first match in ring, steps for second match in ring, so on...)

Steps for any occurence = steps to set the element to the top(12:00 position) + 1(to press the button) + steps for remaining elements


`n==ring.length` and `m==key.length`
Time Complexity : `O(n*m)`
Space Complexity: `O(n*m)`