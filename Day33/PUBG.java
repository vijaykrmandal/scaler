package Day33;

import java.util.ArrayList;

public class PUBG {
    public int GCD(int a, int b) {
        while (b > 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        int ans = 0;
        for (int i = 0; i < N - 1; i++) {
            ans = GCD(A.get(i), ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        PUBG obj = new PUBG();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(100001);
        A.add(100002);
        A.add(100003);
        A.add(100004);
        A.add(100005);
        System.out.println(obj.solve(A));
    }
}
