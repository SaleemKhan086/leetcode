The approach is to find the steps for visiting every consecutive points and sum will be the answer.
eg. 
```
ans = steps from points[0] to points[1] + steps from points[1] to points[2] + ... + steps from points[n-2] to points[n-1];
```

for any i, steps from i-1 to i = max(difference in x-coordinates, difference in y-coordinates);

How?
point1  = (x1,y1);
point2 = (x2,y2);

diffX = abs(x1-x2);
diffY = abs(y1-y2);

While going from point1 to point2, we will go diagonally till we reach x2 or y2 and after that cover the remaining distance in straight line.

eg. point1 = (1,1)
point2 = (3,5)

we start from (1,1) go diagonally till (3,3) and then straight line from (3,3) to (3,5).

So,
no. of steps = min(diffX, diffY) + (max(diffX, diffY) - min(diffX,diffY));
             = max(diffX, diffY);
             