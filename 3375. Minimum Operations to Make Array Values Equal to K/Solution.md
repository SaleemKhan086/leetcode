The valid values will be second-largest element to largest element - 1 

So we choose second largest element because we need to reduce the values of elements in lesser no. of steps.

After performing the operation once, the chosen valid value (or second largest element) becomes the largest element of the array. So we repeat the process untill we reach k.

Hence we perform `count` no. of steps if there are `count` no. of elements greater than `k`. As per the problem, we have to make all the elements equal to `k`, so all elements have to be greater than `k`, otherwise it would be impossible.

So, to implement this:   
We keep count of unique elements greater than `k` and return the no. of unique elements (ie. no. of keys in map)

Time Complexity: $O(n)$

Space Complexity: $O(n)$
