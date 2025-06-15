class Solution {
    private int getFirstDigit(int n){
        int d = 0;
        while(n>0){
            d = n%10;
            n = n/10;
        }
        return d;
    }
    private int getFirstDigit(int n, int k){
        int d = k;
        while(n>0){
            if(n%10 !=k){
                d = n%10;
            }
            n = n/10;
        }
        return d;
    }
    private int getFirstDigitGreaterThanOne(int n, int k){
        int d = k;
        while(n>0){
            if(n%10 !=k && n%10 > 1){
                d = n%10;
            }
            n = n/10;
        }
        return d;
    }

    private long replace(int num, int oldDigit, int newDigit){
        long ans = 0;
        int arr[] = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = -1;
        }
        int i = 9;
        while(num>0){
            arr[i] = num%10;
            num/= 10;
            i--;
        }
        for(i=0;i<10;i++){
            if(arr[i]==-1){
                ans = ans*10 + 0;
            }
            else {
                ans = ans*10 + (arr[i]==oldDigit?newDigit:arr[i]);
            }
        }
        return ans;
    }

    public int maxDiff(int num) {
        int firstDigitNonNine = getFirstDigit(num,9);
        long high = replace(num, firstDigitNonNine, 9);
        int firstDigit = getFirstDigit(num);
        long low = 0;
        if(firstDigit!=1)
            low = replace(num, firstDigit, 1);
        else {
            int firstDigitNonOne = getFirstDigitGreaterThanOne(num, 1);
            if(firstDigitNonOne==1)
                low = replace(num, firstDigitNonOne, 1);
            else
                low = replace(num, firstDigitNonOne, 0);
        }
        return (int)(high - low);
    }
}
