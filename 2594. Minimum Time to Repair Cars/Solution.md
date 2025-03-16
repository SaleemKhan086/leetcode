The Max possible time will be when highest rank person repairs all the cars. ie. 
`max_time = Max(ranks[i])*cars^2`

The intent is to use binary search to find the minimum time in which all the cars can be repaired.

So we traverse the the range `(1, max_time)` in binary search and for each value of time check if the cars can be repaired in that much time. If yes, lower the search end(ie. end = mid-1), else higher the search start(ie. start = mid+1).

To check if cars can be repaired in a time `t`. Traverse the ranks array and for each mechanic, calculate the no. of cars he can repair in the time `t`.   
As per given in question, time taken by mechanic to repair c cars = r*c^2;   
so, no. of cars `c` that can be repaired in time `t` will be = Sqrt(`t/r`);   
Count the no of cars that can be repaired by all the mechanics,   
if the total count is greater than total no. of cars, return `true`, else `false`.


Time Complexity: `O(NlogT)` -> `N = ranks.length`, `T = max(ranks[i])*(cars^2)`   
Space Complexity: `O(1)`