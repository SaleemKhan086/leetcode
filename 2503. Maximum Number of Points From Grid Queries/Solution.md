According to the problem, For each query, we need to find the no. of nodes we can visit with BFS starting from `(0,0)` that are strictly less than the query.

If we follow the naive approach we can run BFS for each query and find out our answer for each query separately. But that will cause TLE, so we need to optimize it.

If we try to see correlation between the query runs to minimize the no. of times we run the BFS. We can see that if for a particular query `q1` the ans is lets say `n1`, then for any query `q2` bigger than that, the ans will be `n1+something`. Reason being that all the nodes smaller than `q1` will also be smaller than `q2` as `q2>q1`.

So, when we calculate nodes for `q2`, we don't need to recalculate the no. nodes we already calculated for `q1`. 

To implement this, we process the queries in the sorted order. So, we store the original indexes of the queries elements and sort the queries array for processing in sorted order.

Next, we do BFS, but **one thing to notice here** is that, during BFS, we need to process elements in sorted order.  If we don't process the elements in sorted order, we might end up quitting our processing earlier when we encounter an `element >= queries[i]`. Hence it becomes necessary to process elements in the queue in sorted order.

To acheive this, instead of simple queue, we use priority queue.

Then simply run the BFS using priority queue and keep counting the elements (as points) and store the points for each query into an array.

Once done, then build the `ans` array according to the original indexes of the queries.

Time Complexity: $O(n*m*log(n*m) + k*log(k))$   
Space Complexity: $O(n*m + k)$
