package Day10;

public class SpecialSubsequenceAG {
    public int solve(String A) {
        String S = "AG";
        int N = A.length();
        int L = S.length();
        int[][] dp = new int[N + 1][L + 1];
        for (int j = 0; j < L + 1; j++) {
            dp[0][j] = 0;
        }
        for (int i = 0; i < N + 1; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < L; j++) {
                if (A.charAt(i) == S.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j] + dp[i][j + 1];
                } else {
                    dp[i + 1][j + 1] = dp[i][j + 1];
                }
            }
        }
        return dp[N][L];
    }

    public static void main(String[] args) {
        String A = "ABCGAG";
        SpecialSubsequenceAG obj = new SpecialSubsequenceAG();
        System.out.println(obj.solve(A));

    }
}
