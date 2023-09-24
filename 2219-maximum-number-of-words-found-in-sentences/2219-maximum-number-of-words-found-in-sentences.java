import java.util.*;
class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        for(String s : sentences){
            count = Math.max(count, new StringTokenizer(s).countTokens());
        }
        return count;
    }
}