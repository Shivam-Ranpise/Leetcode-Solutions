class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         int maxCandies = Integer.MIN_VALUE;
         for(int candie : candies){
             maxCandies = Math.max(candie, maxCandies);
         }
        
        List<Boolean> result = new ArrayList<>();
        for(int candie : candies){
            result.add(candie + extraCandies >= maxCandies);
        }
        return result;
    }
}