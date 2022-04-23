package Day20;

import java.util.*;

public class SumTheDifference {

    public int solve(int[] A) {
        Arrays.sort(A);
        int D = Integer.MAX_VALUE;
        //int sum = 0;
        int N = A.length;
        for (int i = 0; i < N - 1; i++) {
            if (A[i + 1] - A[i] < D) {
                D = A[i + 1] - A[i];
                //sum += D;
            }
        }
        return D;
    }

    public static void main(String[] args) {
        SumTheDifference obj = new SumTheDifference();
        int A[] = { 65, 38, 20, -58, 32, 75, -50, -80, -88, 82 };
        // int C[] = { 70, 21, 7, 64, 44, 79, 50, 89, 68, 23, 20, 50, 65, 64, 48, 3, 46,
        // 87 };
        // int D[] = { 5, 17, 11, 100 };
        // int B = 16;
        System.out.println(obj.solve(A));
    }
}
