class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1,mid;
        while(low<=high)
        {
            mid=(high+low)/2;
            // System.out.println("mid :"+mid);
            if(nums[mid]==target)
                return mid;
            if(nums[low]<=nums[mid])
            {
                if(nums[mid]>target && nums[low]<=target)
                    high=mid-1;
                else
                    low=mid+1;
            }
            else  if(nums[mid]<=nums[high])
            {
                if(nums[mid]<target && nums[high]>=target)
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return -1;
    }
}