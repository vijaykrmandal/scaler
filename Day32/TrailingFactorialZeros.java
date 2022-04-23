package Day32;

public class TrailingFactorialZeros {
    static int mod = (int) (1e9 + 7);

    public int factorial(int A) {
        long fact = 1;
        for (int i = 1; i <= A; i++) {
            fact = (fact % mod * i % mod) % mod;
        }
        return (int) fact % mod;
    }

    public int trailingZeroes(int A) {
        int count5 = 0;
        while (A > 0) {
            count5 += A / 5;
            A /= 5;
        }
        return count5;
    }

    public static void main(String[] args) {
        TrailingFactorialZeros obj = new TrailingFactorialZeros();
        int A = 9247;
        System.out.println(obj.trailingZeroes(A));
    }
}
