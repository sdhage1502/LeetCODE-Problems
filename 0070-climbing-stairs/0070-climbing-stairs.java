class Solution {

    int[] t = new int[46];

    public int solve(int n) {

        if (n < 0)
            return 0;

        // already calculated
        if (t[n] != -1)
            return t[n];

        // base case
        if (n == 0)
            return 1;

        int one_step = solve(n - 1);
        int two_step = solve(n - 2);

        // store result in dp array
        return t[n] = one_step + two_step;
    }

    public int climbStairs(int n) {

        // initialize array with -1
        for (int i = 0; i < 46; i++) {
            t[i] = -1;
        }

        return solve(n);
    }
}