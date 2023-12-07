An odd number ends with an odd digit.
So we find the longest substring ending with an odd digit. That will be the string starting with index 0 and ending with the last odd digit found in the string.

So we traverse the string from the end and find the first occurring odd digit from the end.
Then get the substring from index 0 till the above found index. That is the answer.
