package Day32;

public class VeryLargePower {
    static int M= 1000000007;
    public static int fact(int B) {
        int i;
        long fact = 1;
        for (i = 1; i <= B; i++) {
            fact = ((fact%M) * (i%M))%M;
        }
        return (int) fact;
    }

    public static int solve(int A1, int B) {
        
        long A=A1;
        long ans = 1;
         B=fact(B);
        A = A % M;
        while (B > 0) {
            if ((B & 1) != 0) {
                ans = ((ans%M) * (A % M)) % M;
            }
            A = (A % M * A % M) % M;
            B = B >> 1;
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        int A = 2;
        int B = 27;
        System.out.println(solve(A, B));
    }
}
