Traverse the string and keep track of the open paranthesis indexes in the new string.
To keep track of open paranthesis in the correct order, we use stack.

Now traverse the string, 
    for every open paranthesis, push the index into stack. 
    for every closed paranthesis, if no open paranthesis exists, that means its extra closed paranthesis, so skip that. Otherwise, pop one open parenthesis.
    for every alphabetical character, just insert into the resulting string.

At the end of the iteration, we will have the stack containing extra open paranthesis. So remove all those from the resulting string.

Return the final string.