The player can only draw a piece only if both its neighbours are same. that means, 
Alice can only draw if there exists at least `"AAA"` substring.

Similarly,
Bob can only draw if there exists at least one `"BBB"` substring.

In the game, all A's which are together will never be eliminated, because at last when two A' remain (ie. `"AA"`), Alice can no longer draw.
Similar case is for B's.

Hence, we can divide the string into substrings consisting of only A's and only B's.
Both players will draw their turn from these substrings and keep doing that until they cannot widthraw anymore.
For alice that will be when all the substrings consisting of A's will have length<=2
For Bob that will be when all the substrings consisting of B's will have length<=2

So we simply check which one will reach the above condition first and that will be the loser because he can't draw his turn anymore.

Hence, to check the above the condition, we can just count no. drawable A's and no. of drawable B's

```
if(no. of drawable A's > no. of drawable B's)
	then alice wins;
else bob wins;
```
