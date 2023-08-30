class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 0){
            return false;
        }
        for(char ch = 'a'; ch <= 'z'; ch++){
            if(sentence.indexOf(ch) < 0){
                return false;
            }
        }
        return true;
    }
}