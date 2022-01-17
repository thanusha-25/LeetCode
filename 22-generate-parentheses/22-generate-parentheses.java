class Solution {
    public void getResult(int openCount, int closedCount,String result, List<String> list)
    {
        if(openCount==0 && closedCount==0)
        {
            System.out.println(result);
            list.add(result);
            return;
        }
        if(openCount==closedCount)
        {
         getResult(openCount-1,closedCount,result+"(",list);   
        }
        if(openCount>0 && openCount<closedCount)
        {
            getResult(openCount-1,closedCount,result+"(",list);
        }
        if(openCount<closedCount)
        {
              getResult(openCount,closedCount-1,result+")",list);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<String>();
        getResult(n,n,"",result);
        return result;
    }
}