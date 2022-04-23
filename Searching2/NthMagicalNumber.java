package Searching2;

public class NthMagicalNumber {
    static int mod = 1000000007;

    public int GCD(int a, int b) {
        while (b > 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public int solve(int A, int B, int C) {
        long LCM = B / GCD(B, C) * C;
        long L = 0;
        long R = (long) A * Math.min(B, C);
        while (L <= R) {
            long M = L + (R - L) / 2;
            if (M / B + M / C - M / LCM < A)
                L = M + 1;
            else
                R = M - 1;
        }
        return (int) (L % mod);
    }

    public static void main(String[] args) {
        NthMagicalNumber obj = new NthMagicalNumber();
        System.out.println(obj.solve(19, 11, 13));
    }
}
