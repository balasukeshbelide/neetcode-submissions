class Solution {
    public int rob(int[] nums) {
        int l = nums.length;
        if(l==0) return 0;
        if(l==1) return nums[0];
        if(l==2) return Math.max(nums[0], nums[1]);
        return Math.max(rob1(nums, 0, l-2), rob1(nums, 1, l-1));
        
    }

    public int rob1(int[] nums, int start, int end) {
        int l = end - start + 1;
        if(l<=0) return 0;
        if(l==1) return nums[start];
        int[][] dp = new int[end+1][2];
        dp[end][0] = 0;
        dp[end][1] = nums[end];
        for(int i=end-1;i>=start;i--) {
            dp[i][0] = Math.max(dp[i+1][0], dp[i+1][1]);
            dp[i][1] = nums[i] + dp[i+1][0];
        }
        return Math.max(dp[start][0], dp[start][1]);
    }
}
