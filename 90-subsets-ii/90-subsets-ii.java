class Solution {
    public void getSubset(List<List<Integer>> result, int[] nums, int index, ArrayList<Integer> list)
    {
           result.add(new ArrayList<>(list));
        for(int i=index;i<nums.length;i++)
        {
            if(i!=index && nums[i]==nums[i-1])
                continue;
            list.add(nums[i]);
            getSubset(result,nums,i+1,list);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(nums);
        getSubset(result,nums,0,new ArrayList<Integer>());
        return new ArrayList<>(result);
    }
}