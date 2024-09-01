public class Solution {
    public boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        boolean[] result = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            result[i] = candies[i] + extraCandies >= maxCandies;
        }

        return result;
    }
}