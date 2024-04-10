In the process of revealing cards, we reveal every alternate card (reveal one card and put the next card at bottom).
So we put the smallest element at 0th index. Then next smallest element at the next index to be revealed and so on..

For eg. 
first index to be revealed is 0th, so we put the smallest element at index 0;
second index to be revealed is 2nd, so we put the next smallest element at index 2;
... and so on.

So, until we reveal all the cards (ie. `count<n`), in each iteration, we find the next index to be revealed (`j`) and put the next smallest element(`deck[i]`), at that index.

Time Complexity : `O(n)`
Space Complexity: `O(n)`
