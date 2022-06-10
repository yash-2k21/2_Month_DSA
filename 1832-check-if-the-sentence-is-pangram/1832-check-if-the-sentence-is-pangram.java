class Solution {
    public boolean checkIfPangram(String sentence) {
       
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