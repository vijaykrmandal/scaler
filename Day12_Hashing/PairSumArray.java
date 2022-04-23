package Day12_Hashing;

import java.util.HashSet;
import java.util.*;

public class PairSumArray {
    public int solve(int[] A) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        int N = A.length;
        for (int i = 0; i < N; i++) {
            set.add(A[i]);
        }
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] != A[j] && set.contains(A[i] + A[j])) {
                    System.out.println(A[i] + "+" + A[j] + " = " + (A[i] + A[j]));
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] A = { 10, 8, 7, 6, 13, 3, 2 };
        PairSumArray obj = new PairSumArray();
        System.out.println(obj.solve(A));
    }
}
