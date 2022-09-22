class Solution {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> arrMap = new HashMap<>();
        for(int num: arr1){
            arrMap.put(num, arrMap.getOrDefault(num, 0)+1);
        }
        for(int num: arr2){
            arrMap.put(num, arrMap.getOrDefault(num, 0)+1);
        }
        for(int num: arr3){
            arrMap.put(num, arrMap.getOrDefault(num, 0)+1);
        }
            
        for(int key: arrMap.keySet()){
            if(arrMap.get(key) == 3)
                result.add(key);
        }
        return result;
    }
}