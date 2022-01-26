class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length],max=0;
        if(nums.length==1)
            return nums[0];
        if(nums[1]<nums[0])
        {
            dp[0]=nums[0];
            dp[1]=nums[0];
            max=nums[0];
        }
        else
        {
            dp[1]=nums[1];
            dp[0]=nums[0];
            max=nums[1];
        }
        for(int i=2;i<nums.length;i++)
        {
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
             max = max < dp[i] ? dp[i] : max;
        }
        return max;
    }
}