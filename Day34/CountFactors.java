package Day34;

public class CountFactors {
    public int[] solve(int[] A) {
        int N = A.length;
        int B[] = new int[N];
        for (int i = 0; i < N; i++) {
            int factCount = 0;
            for (int j = 1; j * j <= A[i]; j++) {
                if (A[i] % j == 0) {
                    if (j * j == A[i])
                        factCount++;
                    else
                        factCount += 2;
                }
            }
            B[i] = factCount;
        }
        return B;
    }

    public static void main(String[] args) {
        int A[] = { 10, 3, 5, 9, 16, 8 };
        CountFactors obj = new CountFactors();
        int B[] = new int[A.length];
        B = obj.solve(A);
        for (int x : B) {
            System.out.print(x + ", ");
        }
    }
}
