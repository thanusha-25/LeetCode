class Solution {
    public int reverse(int x) {
        long rev=0;
        int negFlag= x<0 ? -1 : 1;
        if(negFlag==-1)
            x=x*(-1);
        while(x>0)
        {
            rev=rev*10+(x%10);
            x=x/10;
        }
        if(rev<Integer.MIN_VALUE || rev > Integer.MAX_VALUE)
            return 0;
        return (int)rev*negFlag;
    }
}