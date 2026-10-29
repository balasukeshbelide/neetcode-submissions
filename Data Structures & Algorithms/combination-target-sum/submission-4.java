class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        compute(new ArrayList<>(), nums, 0, target);
        return res;
    }

    public void compute(List<Integer> left, int[] nums, int index, int target) {
        if(target<0 || index>=nums.length) return;
        if(target==0) {
            res.add(new ArrayList<>(left));
            return;
        }
        left.add(nums[index]);
        compute(left, nums, index, target - nums[index]);
        left.remove(left.size()-1);
        compute(left, nums, index+1, target);
    }
}
