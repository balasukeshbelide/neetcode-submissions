class Solution {
    public int findDuplicate(int[] nums) {
        int l = nums.length;
        for(int i=0;i<l;i++) {
            int val = nums[i];
            val = Math.abs(val);
            if(nums[val]<0) return val;
            nums[val] = nums[val]*-1;
        }
        return 0;
    }
}

