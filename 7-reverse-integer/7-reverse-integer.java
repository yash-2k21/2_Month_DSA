class Solution {
    public int reverse(int x) {
        
       /* boolean isNegative = x<0;
        if(isNegative)
            x=x*-1;
        
        int num=x;
        while(num>0)
        {
            rev = rev*10 + num%10;
            num/=10;
        }*/ 
        
        long rev=0;
        while(x!=0){
            rev = rev*10+(x%10);
            x/=10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE)
            return 0;
        return (int)rev;
    }
}