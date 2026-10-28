class Solution {
    public int canCompleteCircuit(int[] g, int[] c) {
        int l = g.length;
        if(l==1) return g[0]>=c[0] ? 0 : -1;
        int total_gas = 0;
        for(int i=0;i<l;i++) {
            total_gas += g[i];
        }
        int total_cost = 0;
        for(int i=0;i<l;i++) {
            total_cost += c[i];
        }
        if(total_gas<total_cost) return -1;
        int[] gas = new int[2*l];
        int[] cost = new int[2*l];
        for(int i=0;i<l;i++) {
            gas[i] = g[i];
        }
        for(int i=l;i<2*l;i++) {
            gas[i] = g[i-l];
        }
        for(int i=0;i<l;i++) {
            cost[i] = c[i];
        }
        for(int i=l;i<2*l;i++) {
            cost[i] = c[i-l];
        }
        int curr_gas = gas[0];
        int curr_index = 0;
        int end_index = l-1;
        for(int i=1;i<2*l;i++) {
            if(curr_index>=l) return -1;
            curr_gas = curr_gas - cost[i-1];
            if(curr_gas<0) {
                curr_index = i;
                curr_gas = gas[i];
                end_index = curr_index + l;
            } else {
                if(i==end_index) return curr_index;
                curr_gas = curr_gas + gas[i];
            }
        }
        return -1;
    }
}
