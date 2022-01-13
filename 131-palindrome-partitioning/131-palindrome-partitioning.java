class Solution {
    public boolean isPalindrome(String s)
    {
        int start=0,end=s.length()-1;
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    public void getPartitions(List<List<String>> result,int start,String s,ArrayList<String>list)
    {
       if(start==s.length())
        {
            result.add(new ArrayList<>(list));
            return ;
        }
         
        for(int i=start;i<s.length();i++)
        {
            String st=s.substring(start,i+1);
            if(st.length()>0 && isPalindrome(st))
            {
              list.add(st);
              getPartitions(result,i+1,s,list);
              list.remove(list.size()-1);
            }
          }
    }
    
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<List<String>>();
        getPartitions(result,0,s,new ArrayList<String>());
        return result;
    }
}