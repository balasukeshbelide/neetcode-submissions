class Solution {
    public int countSubstrings(String s) {
        int l = s.length();
        int[][] dp = new int[l][l];
        int res = 0;
        for(int i=0;i<l;i++) {
            dp[i][i] = 1;
            res++;
        }
        for(int i=2;i<=l;i++) {
            for(int j=0;j+i-1<l;j++) {
                if(s.charAt(j)==s.charAt(j+i-1)) {
                    if(i==2 || dp[j+1][j+i-2]==1) {
                        dp[j][j+i-1] = 1;
                        res++;
                    } 
                }
            }
        }
        return res;
    }
}
