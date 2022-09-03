class MedianFinder {
    Queue<Integer> smallHeap;
    Queue<Integer> largeHeap;
    public MedianFinder() {
        largeHeap = new PriorityQueue<Integer>();
        smallHeap = new PriorityQueue<Integer>((a,b)->b-a);
    }
    
    public void addNum(int num) {
        largeHeap.add(num);
        if(largeHeap.size()>smallHeap.size())
            smallHeap.add(largeHeap.poll());
        if(smallHeap.size()>largeHeap.size())
            largeHeap.add(smallHeap.poll());
    }
    
    public double findMedian() {
        if(largeHeap.size() == smallHeap.size()) 
            return ((double) largeHeap.peek() + (double) smallHeap.peek()) / 2;
        else if(largeHeap.size()>smallHeap.size())
            return largeHeap.peek();
        else
            return smallHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */