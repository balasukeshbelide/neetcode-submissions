class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(new ArrayList<>(), nums, 0);
        return res;
    }

    public void backtrack(List<Integer> a, int[] b, int index) {
        res.add(a);
        if(b.length == 0) return;
        int l = b.length;
        for(int i=index;i<l;i++) {
            List<Integer> nl = new ArrayList<>(a);
            nl.add(b[i]);
            backtrack(nl, b, i+1);
        }
    }
} 
