package Day32;

import java.util.ArrayList;

public class ModSum {
    static int mod = (int) (1e9 + 7);

    public static int solve(ArrayList<Integer> A) {
        int N = A.size();
        long ans = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (A.get(i) > max)
                max = A.get(i);
        }
        int[] cnt = new int[max + 1];
        for (int i = 0; i < N; i++)
            cnt[A.get(i)]++;

        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max; j++) {
                ans = ans + cnt[i] * cnt[j] * (i % j);
                ans = ans % mod;
            }
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        System.out.println(solve(A));
    }
}
