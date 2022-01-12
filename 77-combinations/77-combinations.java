class Solution {
    public void getCombine(List<List<Integer>> result, int nums[],int start,int size,ArrayList<Integer> list)
    {
        if(size==list.size())
        {
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=start;i<nums.length;i++)
        {
            // System.out.println("start: "+i+" "+list);
            list.add(nums[i]);
            getCombine(result,nums,i+1,size,list);
            list.remove(list.get(list.size()-1));
        }
    }
    
    public List<List<Integer>> combine(int n, int k) {
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++)
            nums[i]=i+1;
        List<List<Integer>> result=new ArrayList<>();
        getCombine(result,nums,0,k,new ArrayList<Integer>());
        return result;
    }
}