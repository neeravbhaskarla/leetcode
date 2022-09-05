class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        
        int total_tank = 0;
        int current_tank = 0;
        int start_pos = 0;
        for(int i=0; i<n; i++){
            total_tank += gas[i] - cost[i];
            current_tank += gas[i] - cost[i];
            
            if(current_tank < 0){
                start_pos = i+1;
                current_tank = 0;
            }
        }
        if(total_tank>=0)
            return start_pos;
        else
            return -1;
    }
}