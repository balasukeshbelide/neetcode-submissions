class Solution {
    public int search(int[] nums, int target) {
     return bs(nums, 0, nums.length-1, target);
    }

    public int bs(int[] nums, int start, int end, int target) {
        if(start>end) return -1;
        int mid = (start+end)/2;
        if(nums[mid] == target) return mid;
        if(nums[mid]<target) return bs(nums, mid+1, end, target);
        return bs(nums, start, mid-1, target);
    }
}
