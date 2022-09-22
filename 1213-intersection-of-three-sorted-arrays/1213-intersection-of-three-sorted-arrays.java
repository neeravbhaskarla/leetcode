class Solution {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        int n = arr1.length;
        int iter1 = 0, iter2 = 0, iter3 = 0;
        List<Integer> result = new ArrayList<>();
        while(iter1<n && iter2<n && iter3<n){
            if(arr1[iter1] == arr2[iter2] && arr2[iter2] == arr3[iter3]){
                result.add(arr1[iter1]);
                iter1++; iter2++; iter3++;
            }
            else{
                if(arr1[iter1] < arr2[iter2]){
                    iter1++;
                }
                else if(arr2[iter2] < arr3[iter3]){
                    iter2++;
                }
                else{
                    iter3++;
                }
            }
        }
        return result;
    }
}