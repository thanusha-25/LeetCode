class Solution {
    public int removeElement(int[] nums, int val) {
        int low=0,high=nums.length-1,k=0;
        while(low<high)
        {
            if(nums[low]==val)
            {
                while(low<high && nums[high]==val)
                    high--;
                if(low<high){
                nums[low]=nums[high];
                low++;
                high--;
                k++;
                }
            }
            else
            {
                low++;
                k++;
            }
        }
        if(low==high && nums[low]!=val)
        return k+1;
        return k;
    }
}