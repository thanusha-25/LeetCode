class Solution {
    public void getCombo(HashSet<List<Integer>> result,int[] candidates,int curSum,int target,int index,List<Integer> list)
    {
        System.out.println(list+" "+curSum+" "+target);
        if(curSum==target)
        {
            // System.out.println("same sum"+" "+list);
            result.add(new ArrayList<>(list));
            // for(List<Integer> res : result)
            //     System.out.println(res);
            return ;
        }
        if(curSum>target)
            return;
        // list.add(candidates[index]);
        // getCombo(result,candidates,curSum+candidates[index],target,index,list);
        // list.remove(list.get(list.size()-1));
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
        // System.out.println("result :");
        // for(List<Integer> res : result)
        //         System.out.println(res);
        return new ArrayList<List<Integer>>(result);
    }
}