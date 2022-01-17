class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0,end=0,flipCnt=0,max=0;
       while(end<nums.length)
       {
           if(nums[end]==1)
               end++;
           else
           {
               if(flipCnt<k)
               {
                   flipCnt++;
                   end++;
               }
               else
               {
                  while(flipCnt>=k)
                  {
                      if(nums[start]==0)
                      {
                          flipCnt--;
                      }
                      start++;          
                  }
               }
           }
           max=Math.max(max,end-start);
       }
    return max;
    }
}