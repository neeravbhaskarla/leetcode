class Solution {
    public void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while(left<right){
            swap(s, left++, right--);
        }
    }
}