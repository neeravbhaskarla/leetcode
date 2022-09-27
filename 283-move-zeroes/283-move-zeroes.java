class Solution {
    public void moveZeroes(int[] nums) {
        int numOfZeros = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num: nums){
            if(num!=0)
                arr.add(num);
            else
                numOfZeros++;
        }
        while(numOfZeros!=0){
            arr.add(0);
            numOfZeros--;
        }
        for(int i=0; i<arr.size(); i++){
            nums[i] = arr.get(i);
        }
    }
}