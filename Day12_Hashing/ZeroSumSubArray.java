package Day12_Hashing;

import java.util.*;

public class ZeroSumSubArray {
    public int solve(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        int N = A.length;
        for (int i = 0; i < N; i++) {
            sum += A[i];
            if (sum == 0 || set.contains(sum))
                return 1;
            else
                set.add(sum);
        }
        System.out.println(sum);
        return 0;
    }

    public int solve1(int[] A) {
        if (A.length == 1 && A[0] == 0) {
            return 1;
        }
        if (A.length == 1 && A[0] != 0) {
            return 0;
        }
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
            if (set.contains(sum)) {
                return 1;
            }
            set.add(sum);
        }
        return 0;
    }

    public static void main(String[] args) {
        ZeroSumSubArray obj = new ZeroSumSubArray();
        int[] A = { 96, -71, 18, 66, -39, -32, -16, -83, -11, -92, 55, 66, 93, 5, 50, -45, 66, -28, 69, -4, -34, -87,
                -32, 7, -53, 33, -12, -94, -80, -71, 48, -93, 62 };

        System.out.println(obj.solve(A));
    }
}
