package Day23;

import java.util.*;

public class DuplicateRow {
    public void solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        long arr[] = new long[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i] += (long) (A[i][j] << (M - j - 1));
            }
        }
        for (long a : arr) {
            System.out.print(a + " ");
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] == arr[j]) {
                    set.add(j);
                }
            }
        }
        int l = set.size();
        int result[] = new int[l];
        int i = 0;
        int j = 0;
        while (j < l && i < N) {
            if (set.contains(i)) {
                result[j] = i + 1;
                i++;
                j++;
            } else
                i++;
        }
        System.out.println();
        for (long a : result) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        DuplicateRow obj = new DuplicateRow();
        int A[][] = { { 1, 1, 1, 0 }, { 0, 0, 0, 1 }, { 1, 1, 1, 0 }, { 0, 0, 0, 1 } };
        obj.solve(A);
    }
}
