class Solution {
    public int maxArea(int[] height) {
        int low=0,high=height.length-1;
        int res=0;
        while(low<high)
        {
            res=Math.max(res,Math.min(height[low],height[high])*(high-low));
            if(height[low]<height[high])
                low++;
            else
                high--;
        }
        return res;
    }
}