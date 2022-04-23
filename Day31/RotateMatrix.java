package Day31;

public class RotateMatrix {
    public void solve(int[][] A) {
        int N = A.length;
        for (int i = 0; i < N / 2; i++) {
            for (int j = i; j < N - i - 1; j++) {
                int temp = A[i][j];
                A[i][j] = A[N - 1 - j][i];
                A[N - 1 - j][i] = A[N - 1 - i][N - 1 - j];
                A[N - 1 - i][N - 1 - j] = A[j][N - 1 - i];
                A[j][N - 1 - i] = temp;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int A[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        RotateMatrix obj = new RotateMatrix();
        obj.solve(A);
    }
}
