class Solution {
    public int integerBreak(int n) {
        int arr[] = new int[n+1];
        
        arr[1] = 1;
        arr[2] = 1;
        
        for(int i=3;i<=n;i++) {
            int maxProduct = 1;
            for(int j=1;j<=i/2;j++) {
                int firstNo = Math.max(j, arr[j]);
                int secondNo = Math.max(i-j, arr[i-j]);
                
                maxProduct = Math.max(maxProduct, firstNo*secondNo);
            }
            
            arr[i] = maxProduct;
        }
        
        return arr[n];
    }
}
