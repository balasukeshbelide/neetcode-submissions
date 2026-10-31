class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int l = nums.length;
        int i;
        for (i=0;i<k && i<l;i++) {
            minHeap.offer(nums[i]);
        }
        while(i<l) {
            int min = minHeap.peek();
            if(nums[i]>min) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
            i++;
        }
        return minHeap.peek();
    }
}



// [1,2,3,4,5,6,7,{8},9,10]
/*


Total size = N
Indices = [0,N-1]
Kth Largest = (N-k+1)th smallest



*/