class Solution {
    public int removeDuplicates(int[] nums) {
        int length=nums.length,k=0,i=0;
        while (i<length)
        {
            while(i!=0 && i<length && nums[i]==nums[i-1])
                i++;
            if(i<length)
            nums[k++]=nums[i++];
        }
        return k;
    }
}