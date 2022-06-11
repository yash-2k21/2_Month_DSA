class Solution {
    public int largestAltitude(int[] gain) {
        int[] res = new int[gain.length+1];
        res[0]=0 ;
        int s=0,max=0;
            
        for(int i=0 ; i<gain.length ; i++)
        {
            s=s+gain[i];
            res[i+1] = s;
            if(res[i+1] > max)
                max=res[i+1];
        }
        return max;
    }
}