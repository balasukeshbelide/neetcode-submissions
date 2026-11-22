class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        int[] dp = new int[amount+1];
        for(int coin: coins) {
            for(int target=1;target<=amount;target++) {
                if(coin==target) dp[target] = 1;
                else if(coin<target && dp[target - coin] != 0) {
                    int candidate = dp[target - coin] + 1;
                    dp[target] = dp[target] == 0 ? candidate : Math.min(dp[target], candidate);
                }
            }
        }
        return dp[amount] == 0 ? -1 : dp[amount];
    }
}
