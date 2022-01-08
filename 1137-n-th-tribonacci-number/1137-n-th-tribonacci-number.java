class Solution {
    public int getTrib(int n,int trib[])
    {
        if(trib[n]!=-1)
            return trib[n];
        trib[n]=getTrib(n-1,trib)+getTrib(n-2,trib)+getTrib(n-3,trib);
        return trib[n];
    }
    public int tribonacci(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 1;
        int trib[]=new int[n+1];
        trib[0]=0;trib[1]=1;trib[2]=1;
        for(int i=3;i<=n;i++)
            trib[i]=-1;
        return getTrib(n,trib);
    }
}