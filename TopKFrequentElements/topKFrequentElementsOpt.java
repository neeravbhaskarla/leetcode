class Solution {
    int[] unique;
    Map<Integer, Integer> count = new HashMap();
    public void swap(int a, int b){
        int temp = unique[a];
        unique[a] = unique[b];
        unique[b] = temp;
    }
    public int partition(int left, int right, int pivot_index){
        int pivot_frequency = count.get(unique[pivot_index]);
        swap(pivot_index, right);
        int store_index = left;
        for(int i = left; i<right; i++){
            if(count.get(unique[i])<pivot_frequency){
                swap(i, store_index);
                store_index++;
            }
        }
        swap(store_index, right);
        return store_index;
    }
    public void quickselect(int left, int right, int k_smallest){
        if(left==right)return;
        Random random_num = new Random();
        int pivot_index = left + random_num.nextInt(right-left);
        pivot_index = partition(left, right, pivot_index);
        if(pivot_index == k_smallest) return;
        else if(pivot_index<k_smallest) quickselect(pivot_index+1, right, k_smallest);
        else quickselect(left, pivot_index-1, k_smallest);
    }
    public int[] topKFrequent(int[] nums, int k) {
        for(int num: nums) count.put(num, count.getOrDefault(num, 0)+1);
        int index = 0;
        int n = count.size();
        unique = new int[n];
        for(int key: count.keySet()) unique[index++]=key;
        quickselect(0, n-1, n-k);
        return Arrays.copyOfRange(unique, n-k, n);
    }
