# 1160. Find Words That Can Be Formed by Characters

Appraoch is to find for every string, if its a good string or not.
In order to find if a string is a good string, we have stored count of all the characters available in `chars`

Then in every string we check if the count of any character present in the string exceeds the count of available characters.
If any character count exceeds that means that the string cannot be formed from the available charaters hence its not a good string.
