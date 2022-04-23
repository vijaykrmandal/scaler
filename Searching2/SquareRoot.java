package Searching2;

public class SquareRoot {
    public int sqrt(int A) {
        if (A <= 1)
            return A;
        int L = 1;
        int R = A;
        int ans = 0;
        int M = 0;
        while (L <= R) {
            M = (L + R) / 2;
            if (M * M == A) {
                ans = M;
                break;
            }
            if (M * M < A) {
                L = M + 1;
                //ans = M;
            } else
                R = M - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        SquareRoot obj = new SquareRoot();
        System.out.println(obj.sqrt(2147483647));
    }
}
