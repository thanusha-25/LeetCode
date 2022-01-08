class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length==1)
            return 0;
        int first=nums[0],second=Integer.MIN_VALUE,index=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]> first)
            {
                second=first;
                first=nums[i];
                index=i;
            }
            else if( nums[i] > second)
                second=nums[i];
        }
        if(second*2<= first )
            return index;
        return -1;
    }
}