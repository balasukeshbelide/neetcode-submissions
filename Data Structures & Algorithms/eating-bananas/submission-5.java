class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = piles.length;
        if(h<l) return 0;
        int left = 1;
        int max = 0;
        for(int i=0;i<l;i++) {
            if(piles[i]>max) max = piles[i];
        }
        int right = max;
        int res = max;
        while(left<=right){
            int mid = (left+right)/2;
            int total = 0;
            for(int i=0;i<l;i++) {
                total = total + (int)Math.ceil((double)piles[i]/(double)mid);
            }
            if(total<=h) {
                res = mid;
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return res;
    }
}
