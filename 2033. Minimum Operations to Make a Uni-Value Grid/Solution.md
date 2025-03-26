We need to make all the elements equal, so we choose one element and make all elements equal to it. But first we need to check if its possible or not to make all the elements equal. 

As per the problem, we can only add or subtract `x` from any element. So,   
element (+ or -) k.x = target;   

So, (element - target) should be a multiple of x.   
hence, (element - target)%x = 0;   
ie. element%x = target%x;   
This should be true for any element, So all the elements remainder should be equal.

So if any element has different remainder, its not possible to make all elements equal and we return -1.

Now, if its possible to make all elements equal, we need to choose a target. We take median because median minimizes the distance from all the elements of the array. To find median, we store all the elements in a 1-D array, sort it and take the middle element.

Then we just iterate through the given array and count the no. of operations needed to make each element equal to the target element.

Time Complexity: $O(m.nlog(m.n))$
Space Complexity: $O(m.n)$
