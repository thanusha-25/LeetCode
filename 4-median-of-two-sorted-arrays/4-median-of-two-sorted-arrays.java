class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length)
            return findMedianSortedArrays(nums2,nums1);
        int leftSize=(nums1.length+nums2.length+1)/2;
        int rightSize=nums1.length+nums2.length-leftSize;
        int low=0,high=nums1.length;
        while(low<=high)
        {
            int cut1=(high+low)/2;
            int cut2=leftSize-cut1;
            int l1,l2,r1,r2;
            if(cut1==0)
                l1=Integer.MIN_VALUE;
            else
                l1=nums1[cut1-1];
            if(cut2==0)
                l2=Integer.MIN_VALUE;
            else
                l2=nums2[cut2-1];
            if(cut1==nums1.length)
                r1=Integer.MAX_VALUE;
            else
                r1=nums1[cut1];
            if(cut2==nums2.length)
                r2=Integer.MAX_VALUE;
            else
                r2=nums2[cut2];
            if(l1<=r2 && l2 <=r1)
            {
                if((nums1.length+nums2.length)%2==0)
                    return (Math.max(l1,l2)+Math.min(r1,r2))/(double)(2);
                return (double)Math.max(l1,l2);
            }
            if(l1>r2)
                high=cut1-1;
            else
                low=cut1+1;
        }
        return 0.0;
    }
}