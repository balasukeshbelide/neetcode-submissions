class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int l = cost.length;
        int[] dp = new int[l];
        dp[l-1] = cost[l-1];
        dp[l-2] = cost[l-2];
        for(int i=l-3;i>=0;i--) {
            dp[i] = cost[i] + Math.min(dp[i+1], dp[i+2]);
        }
        return Math.min(dp[0], dp[1]);
    }
}
