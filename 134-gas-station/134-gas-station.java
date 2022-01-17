class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalSum=0,j=0,index=0,curGas=0;
        while(j<gas.length)
        {
            totalSum+=gas[j]-cost[j];
            curGas+=gas[j]-cost[j];
            if(curGas<0)
            {
                curGas=0;
                index=j+1;
            }
            j++;
        }
        return totalSum < 0 ? -1 : index;
    }
}