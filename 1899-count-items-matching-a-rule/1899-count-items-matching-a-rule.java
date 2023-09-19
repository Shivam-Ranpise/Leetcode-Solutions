class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(List x : items){
            if(ruleKey.equals("type") && x.get(0).equals(ruleValue)) count++;
            if(ruleKey.equals("color") && x.get(1).equals(ruleValue)) count++;
            if(ruleKey.equals("name") && x.get(2).equals(ruleValue)) count++;
        }
        return count;
    }
}