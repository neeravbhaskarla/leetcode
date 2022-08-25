class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String operation: operations){
            if(operation.charAt(0) == 'X'){
                if(operation.substring(1, 3).equals("--")){
                    x = x - 1;
                }
                else{
                    x = x + 1;
                }
            }
            else{
                if(operation.substring(0, 2).equals("--")){
                    x = x - 1;
                }
                else{
                    x = x + 1;
                }
            }
        }
        return x;
    }
}