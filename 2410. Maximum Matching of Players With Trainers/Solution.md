A player can be matched with any trainer who has capacity greater than or equal to the player's ability.
So for any player, if at least one trainer exists who has greater capacity and is not matched yet, that means the current player can be matched.

If min of the unmatched players cannot be matched, that means no other player can be matched.

So we sort both the arrays, and traverse from min to max. We increament the count whenever, for player `i`, we find a trainer `j` who is not matched yet.

Time Complexity : $nlog(n)$
Space Complexity: $O(1)$
