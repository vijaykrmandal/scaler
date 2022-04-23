package Day20;

import java.util.*;

public class SortUnsortedSubArray {
    public static int solve(int[] A) {
        int N = A.length;
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = A[i];
        }
        Arrays.sort(B);
        int start = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == B[i])
                start++;
            else
                break;
        }
        int end = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (A[i] == B[i])
                end++;
            else
                break;
        }
        if (start == end)
            return 0;
        return N - 1 - end - start;
    }

    public static void main(String[] args) {
        int A[] = { -146316343, 179840175, 760528516 };
        System.out.println(solve(A));
    }
}
