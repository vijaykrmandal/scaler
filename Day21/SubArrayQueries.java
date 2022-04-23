package Day21;

public class SubArrayQueries {
    public int[] solve(int[] A, int[][] B) {
        int N = A.length;
        int C[] = new int[N];
        int PSum[] = new int[N];
        int ans[] = new int[B.length];
        for (int i = 1; i < N; i++) {
            if (A[i] < A[i - 1])
                C[i] = 1;
        }
        PSum[0] = 0;
        for (int i = 1; i < N; i++) {
            PSum[i] = PSum[i - 1] + C[i];
        }
        for (int i = 0; i < B.length; i++) {
            ans[i] = (PSum[B[i][1] - 1] - PSum[B[i][0] - 1]) > 0 ? 0 : 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        SubArrayQueries obj = new SubArrayQueries();
        int A[] = { 7, 7, 1, 6, 9 };
        int B[][] = { { 1, 3 }, { 4, 5 }, { 1, 2 }, { 3, 4 }, { 1, 5 } };
        int C[] = obj.solve(A, B);
        for (int a : C) {
            System.out.print(a + " ");
        }
    }
}
