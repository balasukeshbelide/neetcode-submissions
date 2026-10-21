class Solution {
    public int rob(int[] nums) {
        int l = nums.length;
        if(l==0) return 0;
        if(l==1) return nums[0];
        int[][] dp = new int[l][2];
        dp[l-1][0] = 0;
        dp[l-1][1] = nums[l-1];
        for(int i=l-2;i>=0;i--) {
            dp[i][0] = Math.max(dp[i+1][0], dp[i+1][1]);
            dp[i][1] = nums[i] + dp[i+1][0];
        }
        return Math.max(dp[0][0], dp[0][1]);
    }
}
