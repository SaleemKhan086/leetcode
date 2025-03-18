For an array, if any two elements' bitwise AND is 0, that means no two elements in the array have same bits as 1.

Hence, max size of the "nice" subarray can be 32 because there can only be 32 different bits as 1.


So we traverse the array. Starting from each index `i`, we check for next 32 elements till the "nice" property is met.

For checking the "nice" property, we maintain a int variable bits - to track the 1 bits for the subarray elements. 

If for an element bitwise AND `bits & num` is 0, ie. all the 1's in the bits and num are at different positions. Hence "nice" property is not broken. So we set the 1 bits into the variable `bits`, update `ans` variable and continue.

if for an element bitwise AND `bits & num` is not 0, that means the "nice" property is broken and we break the loop.

Time Complexity: `O(n)`
Space Complexity: `O(1)`
