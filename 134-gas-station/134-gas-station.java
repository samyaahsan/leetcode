class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int totalCost = 0;
        for (int i = 0; i < gas.length; i++){
            totalCost += (gas[i] - cost[i]);
        }
        
        if (totalCost < 0){
            return -1;
        }
        
        int tank = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++){
            tank += (gas[i] - cost[i]);
            if (tank < 0){
                tank = 0;
                start = i+1;
            }
        }
        return start;
        
    }
}