class Solution {
    public int deleteAndEarn(int[] n) {
    int a[]=new int[10001];
    for(int i:n)
    {
        a[i]+=i;
    }
    int dp[]=new int[10001];
    dp[0]=a[0];
    dp[1]=Math.max(a[0],a[1]);
    for(int i=2;i<10001;i++)
    {
        dp[i]=Math.max(a[i]+dp[i-2],dp[i-1]);
    }
    return dp[10000];
}
        
    }