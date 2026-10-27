class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int l = nums.length;
        for(int i=0;i<l;i++) {
            s.add(nums[i]);
        }
        int res = 0;
        for(int cur: s) {
            if(!s.contains(cur-1)) {
                int count = 1;
                while(s.contains(cur+1)) {
                    count++;
                    cur++;
                }
                if(count>res) res = count;
            }
        }
        return res;
    }
}
