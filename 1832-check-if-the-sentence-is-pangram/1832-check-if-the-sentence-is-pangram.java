class Solution {
    public boolean checkIfPangram(String sentence) {
        int len = sentence.length();
        if(len<26)
            return false;
        
        boolean isPangram = true;
        sentence = sentence.toLowerCase();
        
        for(char ch='a'; ch <='z' ; ch++)
        {
            if(!sentence.contains(String.valueOf(ch))){
                isPangram = false;
            }
            
        }
        return isPangram;
    }
}