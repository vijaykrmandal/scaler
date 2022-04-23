package Day32;

public class NthMagicNumber {
    public int solve(int A) {
        int ans = 0;
        for (int i = 31; i >= 0; i--) {
            int x = 1 << i;
            if ((A & x) == (1 << i)) {
                ans += Math.pow(5, i + 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int A = 3;
        NthMagicNumber obj = new NthMagicNumber();
        System.out.println(obj.solve(A));
    }
}
