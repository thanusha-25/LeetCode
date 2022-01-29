class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target<nums[0])
            return 0;
        if(target> nums[nums.length-1])
            return nums.length;
        int start=0,end=nums.length-1,mid;
        while(start<end)
        {
            mid=start+(end-start)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]<target)
                start=mid+1;
            if(nums[mid]>target)
                end=mid;
        }
       return start;
            
    }
}