class Solution {
    public boolean isPalindrome(int x) {
        int num=x,r,s=0;
        if(x<0 || (x%10==0 && x!=0))
            return false;
        while(x>0)
        {
            r=x%10;
            s=s*10+r;
            x=x/10;
        }
        if(num == s)
            return true;
        else
            return false;
    }
}