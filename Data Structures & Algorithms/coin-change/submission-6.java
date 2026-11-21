class Solution {
    public int coinChange(int[] coins, int amount) {
        int l = coins.length;
        if(amount==0 || l==0) return 0;
        int[] dp = new int[amount+1];
        Arrays.fill(dp, -1);
        dpp(coins, l, amount, dp);
        return dp[amount];
    }

    public void dpp(int[] coins, int l, int amount, int[] dp) {
        for(int coin: coins) {
            for(int target=1;target<=amount;target++) {
                if(coin==target) dp[target] = 1;
                else if(coin>target) dp[target] = Math.max(-1, dp[target]);
                else {
                    if(dp[target-coin]==-1) dp[target] = dp[target];
                    else if(dp[target]==-1) dp[target] = 1 + dp[target-coin];
                    else dp[target] = Math.min(dp[target], dp[target-coin]+1);
                }
            }
        }
    }
}
