For the hidden sequence, lets say we start with an element x. So lets consider the first element is x. The next element will be:
```
arr[1]-x = diff[0];
arr[1] = diff[0]+x;
```
similarly:
```
arr[2] -arr[1] = diff[1];
arr[2] = diff[1]+arr[1];
arr[2] = diff[1]+diff[0]+x;

and so on...
arr[i] = diff[i-1]+..diff[0] + x;
```

But all the elements have to be in range `[lower, upper]`. So any `arr[i]` needs to be in range `[lower,upper]`.

So, at any i , the `sum of diff[i] + x` has to be in the given range. we can calculate the sum of diff[i] and find out possible values of `x` for which it stays within the range.

**Implementation:**   
We loop through the diff array and find out minimum and maximum possible values of `sum of diff[i]`. Now, we work with the calculated `min` and `max`, the `min+x` and `max+x`, both has to be in the range. So we calculate possible lower and upper values,

$min+x>=lower$

$x>=lower-min$

and,

$max+x<=upper$ 

$x<=upper-max$

This gives us, a range of possible values for `x` that we denoted as `lowerCount` and `upperCount`.

```
long lowerCount = lower-min;
long upperCount = upper-max;
```

return the count of possible values, ie. `upperCount-lowerCount+1`. Keep in mind that if it comes negative, then return 0;

Time Complexity: $O(n)$

Space Complexity: $O(1)$