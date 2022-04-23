package Day33;

public class DeleteOne {
    public int GCD(int a, int b) {
        while (b > 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public int solve(int[] A) {
        int N = A.length;
        int P[] = new int[N + 1];
        int S[] = new int[N + 1];
        int maxGCD = Integer.MIN_VALUE;
        int res = 0;
        P[0] = 0;
        S[N] = 0;
        for (int i = 0; i < N; i++) {
            P[i + 1] = GCD(P[i], A[i]);
            S[N - 1 - i] = GCD(S[N - i], A[N - 1 - i]);
        }
        for (int i = 0; i < N; i++) {
            res = GCD(P[i], S[i + 1]);
            maxGCD = Math.max(res, maxGCD);
        }
        return maxGCD;
    }

    public static void main(String[] args) {
        int A[] = { 9, 18, 49, 12, 30 };
        DeleteOne o = new DeleteOne();
        System.out.println(o.solve(A));
    }
}
