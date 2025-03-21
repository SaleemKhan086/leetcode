class Solution {
    private boolean makeRecipe(String recipe, Map<String, List<String>> recipesToIngredients, Set<String> supplies, Set<String> doneRecipes, Set<String> visited) {
        
        if(visited.contains(recipe)){
            return false;
        }

        visited.add(recipe);

        List<String> ingredients = recipesToIngredients.get(recipe);
        for(String ingredient: ingredients){
            if(!supplies.contains(ingredient) && !recipesToIngredients.containsKey(ingredient)){
                return false;
            }
            if(supplies.contains(ingredient) || doneRecipes.contains(ingredient)){
                continue;
            } else {
                if(!makeRecipe(ingredient, recipesToIngredients, supplies, doneRecipes, visited)){
                    return false;
                }
            }
        }
        doneRecipes.add(recipe);
        return true;
    }

    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Set<String> suppliesSet = new HashSet<String>();
        for(int i=0;i<supplies.length;i++){
            suppliesSet.add(supplies[i]);
        }
        Set<String> doneRecipes = new HashSet<String>();
        Map<String, List<String>> recipesToIngredients = new HashMap<>();
        for(int i=0;i<recipes.length;i++){
            recipesToIngredients.put(recipes[i], ingredients.get(i));
        }

        List<String> ans = new ArrayList<>();

        for(int i=0;i<recipes.length;i++){
            Set<String> visited = new HashSet<>();
            if(makeRecipe(recipes[i], recipesToIngredients, suppliesSet, doneRecipes, visited)){
                ans.add(recipes[i]);
            }
        }

        return ans;
    }
}
