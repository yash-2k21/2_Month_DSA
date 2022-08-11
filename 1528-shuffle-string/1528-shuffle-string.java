class Solution {
    public String restoreString(String s, int[] indices) 
    {
        int n=indices.length;
      // String[] c = new String[n];
        String c="";
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<n ;j++)
            {
                if(indices[j] == i)
                {
                    char y = s.charAt(j);
                    c=c+y;
                }
            }
        }
        return c;
    }
}