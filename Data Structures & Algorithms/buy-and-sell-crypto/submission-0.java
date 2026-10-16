class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int l = prices.length;
        if(l == 0) return 0;
        int i = 0;
        int j = 1;
        while(j<l) {
            if(prices[j]<=prices[i]) {
                i = j;
                j++;
                continue;
            } 
            res = Math.max(res, prices[j] - prices[i]);
            j++;
        }
        return res;
    }
}
