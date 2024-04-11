To have minimum number, we need to have the digits in ascending order.
So, we traverse the string and at every peek ie. where we see descending digits, we remove the larger digits.

We use stack datastructure. Keep pushing the elements while we are getting ascending order. When we get a digit smaller than the previous one.
We remove the previous element. Then we compare the current element with the next top element of stack and remove that as well if its bigger than the current element. At last when either the stack is empty or the top element of stack is not bigger than the current element, we push the current element into the stack.

After we process all the elements once. We check if we have removed `k` elements (by checking if k==0, because we keep decrementing k when removing an element)
If not we remove the elements from the top of the stack until the k becomes 0;

At the end the elements left in the stack is our answer.
We pop the elements into a string and reverse it (because stack pops in reverse order).
Return the resulting string.

Time Complexity : `O(n)`
Space Complexity: `O(n)`