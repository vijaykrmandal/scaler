package Searching2;

public class HeightOfStairs {
    static int mod = 1000000007;
    public int solve(int A) {
        int L = 0;
        int R = A;
        while (L <= R) {
            int M = L + (R - L) / 2;
            long H = (M * (M + 1)) / 2;
            long H1 = (M + 1) * (M + 2) / 2;
            if (H == A || (H < A && H1 > A))
                return M;
            if (H > A)
                R = M - 1;
            else
                L = M + 1;
        }
        return 0;
    }
    public static int calculateStairs(int blocks) {
        int lastHeight = 0;
        int sum = 0;
        int currentHeight = 0; //number of bricks / level
        while (sum <= blocks) {
            lastHeight = currentHeight;
            currentHeight++;
            sum += currentHeight;
        }
        return lastHeight;
    }
    public static void main(String[] args) {
        //HeightOfStairs obj = new HeightOfStairs();
        System.out.println(calculateStairs(20));
    }
}
