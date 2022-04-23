package Day19;

import java.util.*;

public class MaximumDifference {
    public int solve(int[] A, int B) {
        int n = A.length;
        Arrays.sort(A);
        int minS1 = 0;
        int maxS2 = Integer.MAX_VALUE;
        int maxS1 = 0;
        int minS2 = Integer.MAX_VALUE;
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += A[i];
        }
        for (int i = 0; i < B; i++) {
            minS1 += A[i];
            maxS1 += A[n - i - 1];
        }
        maxS2 = total - minS1;
        minS2 = total - maxS1;
        return Math.max(Math.abs(minS1 - maxS2), Math.abs(maxS1 - minS2));
    }

    public static void main(String[] args) {
        MaximumDifference obj = new MaximumDifference();
        //int A[] = { 93, 51, 84, 81, 89, 82, 28, 78, 86, 35, 64, 38, 49, 99, 83 };
        int C[] = { 70, 21, 7, 64, 44, 79, 50, 89, 68, 23, 20, 50, 65, 64, 48, 3, 46, 87 };
        //int D[] = { 5, 17, 11, 100 };
        int B = 16;
        System.out.println(obj.solve(C, B));
    }
}
