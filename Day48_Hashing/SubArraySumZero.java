package Day48_Hashing;

import java.util.HashMap;

public class SubArraySumZero {
    public static int solve(int[] A) {
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
        int sum = 0;
        int max_len = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (A[i] == 0 && max_len == 0)
                max_len = 1;
            if (sum == 0)
                max_len = i + 1;
            Integer prev_i = hM.get(sum);
            if (prev_i != null)
            {   
                max_len = Math.max(max_len, i-prev_i);
            }
            else
                hM.put(sum, i);
        }
        return max_len;
    }
    public static void main(String[] args) {
        final int A[]={-1,1};
        System.out.println(solve(A));
    }
}
