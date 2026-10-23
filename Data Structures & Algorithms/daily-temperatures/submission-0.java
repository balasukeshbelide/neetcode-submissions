class Solution {
    public int[] dailyTemperatures(int[] t) {
        int l = t.length;
        if(l==0) return new int[0];
        if(l==1) return new int[]{0};
        Stack<int[]> s = new Stack<>();
        s.push(new int[]{t[0], 0});
        int[] res = new int[l];
        for(int i=1;i<l;i++) {
            int val = t[i];
            while(!s.empty()) {
                int[] top = s.peek();
                if(top[0]>=val) break;
                else {
                    res[top[1]] = i - top[1];
                    s.pop();
                }
            }
            s.push(new int[]{val, i});
        }
        return res;
    }
}
