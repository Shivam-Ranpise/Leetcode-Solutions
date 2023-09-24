import java.util.*;
class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        for(String s : sentences){
            count = Math.max(count, new StringTokenizer(s).countTokens());
        }
        return count;

        /*

        int max = 0;
        for (String s : sentences) {
            int x = s.indexOf(" "), count = 1;
            while (x != -1) {
                count++;
                x = s.indexOf(" ", x + 1);
            }
            max = Math.max(count, max);
        }
        return max; 

        */
        /*

        int max = 1;
        for(int i = 0; i < sentences.length; i++){
            String[] arr = sentences[i].split(" ");
            max = Math.max(max,arr.length);
        }
        return max; 

        */
    }
}