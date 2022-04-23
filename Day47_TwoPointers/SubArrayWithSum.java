package Day47_TwoPointers;

import java.util.Arrays;

public class SubArrayWithSum {

    public int[] solve(int[] A, int B) {
        int i = 0;
        int N = A.length;
        int j = 0;
        int sum = 0;// A[i];
        while (j < N) {
            if (sum == B)
                break;
            if (sum < B) {
                sum = sum + A[j++];
            } else {
                sum = sum - A[i++];
            }
        }
        if (sum > B) {
            while (i < N) {
                if (sum == B)
                    break;
                sum = sum - A[i++];
            }
        }
        int[] r = { -1 };
        if (sum!=B)
            return r;
        int ans[] = new int[j - i];
        for (int k = i; k < j; k++) {
            ans[k - i] = A[k];
        }
        return ans;
    }

    public static void main(String[] args) {
        SubArrayWithSum obj = new SubArrayWithSum();
        int A[] = { 1, 1000000000 };
        int B = 1000000000;
        int[] ans = obj.solve(A, B);
        Arrays.stream(ans).forEach(System.out::println);
    }
}
