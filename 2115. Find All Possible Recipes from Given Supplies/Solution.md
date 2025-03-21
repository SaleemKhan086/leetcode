We iterate the recipes array, For each recipe, we try to prepare it. If we do it successfully, add it to ans array.

To prepare a recipe, iterate through its ingredients and
for each ingredient, if its not present in supplies and its also not a recipe, then simply return `false`, because the ingredient is available nowhere.

 If ingredient is present in the supplies or already prepared recipes (aka `doneRecipes`). that means the ingredient is available and we can use that, so continue to the process the next ingredient.

If the above cases are not met for an ingredient, that means it is a recipe which is not prepared yet, so we prepare that recipe, if successfully prepared, means the ingredient has become available and we can use it. Otherwise return false because this ingredient is not available and can't be prepared.

For efficient access of the elements, we maintain set of supplies and set of doneRecipes and map of recipe to ingredients.

So if are able to get or prepare all the ingedients, that means we can prepare the recipe, so return `true` in that case.

**To avoid running into infinite loop in case of circular dependencies, maintain a visited set in each recursion stack**

Keep adding all the prepared recipes into the ans array and return at the end.

Time Complexity: `O(n+m)` -> n is no. of recipes and m is no. of ingredients

Space Complexity: `O(n)`
  