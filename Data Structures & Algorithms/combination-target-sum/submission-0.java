class Solution {
    Set<List<Integer>> res = new HashSet<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        compute(new ArrayList<>(), nums, 0, target);
        return new ArrayList<>(res);
    }

    public void compute(List<Integer> left, int[] nums, int index, int target) {
        if(target<0) return;
        if(target==0) {
            res.add(left);
            if(left.size()==3) {
                System.out.println(left + " " + nums + " " + index + " " + target);
            }
            return;
        }
        if(index>=nums.length) return;
        
        List<Integer> newL = new ArrayList<>(left);
        newL.add(nums[index]);

        compute(newL, nums, index, target - nums[index]);
        compute(newL, nums, index+1, target - nums[index]);
        compute(left, nums, index+1, target);
    }
}
