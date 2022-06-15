class Solution {
    public int[] sumZero(int n) {
        int res[] = new int[n];
        if(n%2==1)
        {
            res[n-1]=0;
        }
        for(int i=1 ; i<n ; i+=2)
        {
            res[i-1]= i;
            res[i] = -i;
        }
        return res;
    }
}