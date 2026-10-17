class KthLargest {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int k;

    public KthLargest(int ki, int[] nums) {
        k = ki;
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
    }
    
    public int add(int val) {
        if(minHeap.size()>=k) {
            int min = minHeap.peek();
            if(val>min) {
                minHeap.poll();
                minHeap.offer(val);
            }
        } else {
            minHeap.offer(val);
        }
        return minHeap.peek();
    }
}
