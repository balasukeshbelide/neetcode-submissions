class Solution {
    public int maxArea(int[] heights) {
        int l = heights.length;
        int left = 0;
        int right = l-1;
        int res = 0;
        while(left<right) {
            int area = Math.min(heights[left], heights[right])*(right-left);
            if(res<area) res = area;
            if(heights[left]<heights[right]) left++;
            else if(heights[left]>heights[right]) right--;
            else {
                left++;
                right--;
            }
        }
        return res;

    }
}
