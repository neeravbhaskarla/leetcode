class MovingAverage {
    Queue<Integer> queue;
    int capacity;
    int sum;
    public MovingAverage(int size) {
        this.capacity = size;
        this.queue = new ArrayDeque();
        this.sum = 0;
    }
    
    public double next(int val) {
        if(this.queue.size() == this.capacity){
            sum-=queue.poll();
        }
        queue.add(val);
        sum+=val;
        return sum*1.0/this.queue.size();     
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */