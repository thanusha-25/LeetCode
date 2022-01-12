class Solution {
    public void getCombo(HashSet<List<Integer>> result,int[] candidates,int curSum,int target, int index,ArrayList<Integer> list )
    {
        if(curSum>target)
            return;
        if(curSum==target)
        {
            result.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=index;i<candidates.length;i++)
        {
            if(i > index && candidates[i]==candidates[i-1])continue;
           list.add(candidates[i]);
            getCombo(result,candidates,curSum+candidates[i],target,i+1,list);
            list.remove(list.get(list.size()-1));
        }
  }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        HashSet<List<Integer>> result=new HashSet<>();
        int index=0;
        Arrays.sort(candidates);
        getCombo(result,candidates,0,target,index,new ArrayList<Integer>());
        return new ArrayList<>(result);
    }
}