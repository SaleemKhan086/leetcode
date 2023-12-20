class Solution {
    public int buyChoco(int[] prices, int money) {
        int n = prices.length;
        int minIndex = 0;

        for(int i=0;i<n;i++){
            if(prices[i]<prices[minIndex]){
                minIndex = i;
            }
        }

        int secondMinIndex = minIndex==0?1:0;
        for(int i=1;i<n;i++){
            if(i!=minIndex && prices[i]<prices[secondMinIndex]){
                secondMinIndex = i;
            }
        }

        int sum = prices[minIndex]+prices[secondMinIndex];

        return money>=sum ? money-sum : money;

    }
}
