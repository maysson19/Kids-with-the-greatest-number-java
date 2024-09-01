public static void main(String[] args) {
    Solution solution = new Solution();
    int[] candies = {2, 3, 5, 1, 3};
    int extraCandies = 3;
    boolean[] result = solution.kidsWithCandies(candies, extraCandies);
    for (boolean b : result) {
        System.out.print(b + " ");
    }
}