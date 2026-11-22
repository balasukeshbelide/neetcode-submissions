class Solution {
    public boolean canJump(int[] nums) {
        int l = nums.length;
        int nearest_true = l-1;
        for(int index=l-2;index>=0;index--)
            if(nearest_true<=index + nums[index]) nearest_true = index;
        return nearest_true==0 ? true : false;
    }
}
