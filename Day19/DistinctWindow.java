package Day19;

import java.util.*;

public class DistinctWindow {
    public int[] dNums(int[] A, int B) {
        int N = A.length;
        int C[] = new int[N - B + 1];
        if (B > N) {
            return C;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < B; i++) {
            int count = 0;
            if (map.containsKey(A[i])) {
                count = map.get(A[i]);
            }
            map.put(A[i], count + 1);
            if (map.get(A[i]) == 1)
                ans++;
        }
        C[0] = ans;
        for (int i = B; i < N; i++) {
            int count = 0;
            if (map.containsKey(A[i])) {
                count = map.get(A[i]);
            }
            map.put(A[i], count + 1);
            map.put(A[i - B], map.get(A[i - B]) - 1);
            if (map.get(A[i]) == 1)
                ans++;
            if (map.get(A[i - B]) == 0)
                ans--;
            C[i - B + 1] = ans;
        }
        return C;
    }

    public static void main(String[] args) {
        DistinctWindow o = new DistinctWindow();
        int A[] = { 1, 2, 1, 3, 4, 3 };
        int B = 3;
        int C[] = o.dNums(A, B);
        for (int a : C) {
            System.out.print(a + ", ");
        }
    }
}
