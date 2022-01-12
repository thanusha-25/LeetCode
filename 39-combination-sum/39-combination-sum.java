class Solution {
    public void getCombo(HashSet<List<Integer>> result,int[] candidates,int curSum,int target,int index,List<Integer> list)
    {
        System.out.println(list+" "+curSum+" "+target);
        if(curSum==target)
        {
             result.add(new ArrayList<>(list));
           return ;
        }
        if(curSum>target)
            return;
        for(int i=index;i<candidates.length;i++)
        {
            if(curSum+candidates[i]<=target)
            {
             list.add(candidates[i]);
             getCombo(result,candidates,curSum+candidates[i],target,i,list);
             list.remove(list.get(list.size()-1));   
            }
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        HashSet<List<Integer>> result=new HashSet<List<Integer>>();
        getCombo(result,candidates,0,target,0,new ArrayList<Integer>());
       return new ArrayList<List<Integer>>(result);
    }
}