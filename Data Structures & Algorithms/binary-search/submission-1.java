class Solution {
    public int search(int[] nums, int target) {
     return bs(nums, 0, nums.length-1, target);
    }

    public int bs(int[] nums, int start, int end, int target) {
        while(start<=end) {
            int mid = (start+end)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]<target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
