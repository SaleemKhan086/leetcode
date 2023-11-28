The no. of ways to put the divider between any two seats = no. of plants between them + 1
Reason: 
lets say there are k plants between any two seats,
the divider can be put before the first plant (between first seat and first plant) (1 way)
or between any of the plants  (k-1 ways)
or after the last plant (between last plant and the second seat) (1 way)

Hence for k plants between any two seats, the no. of ways for divider will be
= 1 + k-1 + 1 = k+1
= no. of plants + 1;

Now, The idea is to put the divider after every two seats.
So, we will put the divider between every even no. and odd no. chair. eg: 
between 2nd and 3rd chair,
then between 4th and 5th chair.
and so on...

We calculate all the no. of ways to put divider between all the even chair - odd chair pair and multiply them to get the total no. of ways (ie. the answer).


Note: we always have to have even chairs between dividers, so if there are odd no. of chairs, we return 0