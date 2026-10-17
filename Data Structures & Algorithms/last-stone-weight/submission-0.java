class Solution {
    public int lastStoneWeight(int[] stones) {
        int l = stones.length;
        if(l==1) return stones[0];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<l;i++) {
            maxHeap.offer(stones[i]);
        }
        while(maxHeap.size()>1) {
            int y = maxHeap.poll();
            int x = maxHeap.poll();
            if(x==y) continue;
            maxHeap.offer(y-x);
        }
        if(maxHeap.isEmpty()) return 0;
        return maxHeap.peek();
    }
}
