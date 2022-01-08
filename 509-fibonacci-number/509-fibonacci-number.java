class Solution {
    public int getFib(int n, int[]fibonacci)
    {
        if(fibonacci[n]!=-1)
            return fibonacci[n];
        fibonacci[n]=getFib(n-1,fibonacci)+getFib(n-2,fibonacci);
        return fibonacci[n];
    }
    public int fib(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int fibonacci[]=new int[n+1];
        fibonacci[0]=0;
        fibonacci[1]=1;
        for(int i=2;i<=n;i++)
            fibonacci[i]=-1;
        return getFib(n,fibonacci);       
    }
}