class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int temp[] = Arrays.copyOfRange(arr, 0, arr.length);
        Arrays.sort(temp);
        Map<Integer, Integer> hash = new HashMap<>();
        for(int num: temp) hash.putIfAbsent(num, hash.size()+1);
        for(int i=0; i<arr.length; i++) arr[i] = hash.get(arr[i]);
        return arr;
    }
}