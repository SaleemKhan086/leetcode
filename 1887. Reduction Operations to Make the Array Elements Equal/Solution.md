###Approach:
In every step, we are choosing the largest element and making it equal to second largest element.
In this way if we keep repeating it, all the largest elements will become equal to the second largest element. 
Then we repeat the process for second largest elements and all of them become equal to third largest element.
And so on..

If we keep going with the process, At the end of the process, All the elements will be equal to smallest element.

So in order to calculate the no. of total steps till the end of process, we need to calculate no. steps required to convert each element. For eg.
We first calculate, no. of steps required to convert all the largest elements to second largets elements.
Then we calculate, no. of steps required to convert all the second largest elements to the third largest elements.
And so on... till we reach the smallest element of the Array.

lets say the largest elements in the array are `n1`, second largest elements are `n2`,... so on.
So, no. of steps to convert the largest elements is `n1`. Now we have `n1+n2` no. of second largest elements.
Now, no. of steps to convert the second largest elements is `n1+n2`.

Similarly keep going and keep adding the count of elements from largest to smallest.

###Code
in the while loop we keep moving the pointer till we have same element.
```
while(i>=0 && nums[i]==curr) {
    i--;
}
```
The bolow line gives us the count of current element plus the elements greater than the current.
`steps+= n-1-i;`

We sum all the counts and that is the answer.
