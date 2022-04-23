package Day31;

public class SumOfSubMatrices {
    public int solve(int[][] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int top_left = (i + 1) * (j + 1);
                int bottom_right = (n - i) * (n - j);
                sum += (top_left * bottom_right * arr[i][j]);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        SumOfSubMatrices obj = new SumOfSubMatrices();
        int A[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int B[][] = { { 8, 9, 9, 1, 7 }, { 5, 5, 10, 1, 0 }, { 7, 7, 5, 8, 6 }, { 7,
        // 3, 7, 9, 2 }, { 7, 7, 8, 10, 6 } };
        System.out.println(obj.solve(A));
    }
}
