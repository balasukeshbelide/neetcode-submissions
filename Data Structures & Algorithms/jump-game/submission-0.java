class Solution {
    public boolean canJump(int[] nums) {
        int l = nums.length;
        int nearest_true = l-1;
        boolean current = true;
        for(int index=l-2;index>=0;index--) {
            if(nums[index]==0) current = false;
            else {
                int max_reachable = index + nums[index];
                if(nearest_true<=max_reachable) {
                    current = true;
                    nearest_true = index;
                } else {
                    current = false;
                }
            }
        }
        return current;
    }
}
