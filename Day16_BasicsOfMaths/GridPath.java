package Day16_BasicsOfMaths;

public class GridPath {
    public int uniquePaths(int A, int B) {
        if (A == 1 || B == 1)
            return 1;
        // return uniquePaths(A - 1, B) + uniquePaths(A, B - 1);
        // int left=0;
        /*
         * int arr[] = new int[A]; for (int i = 0; i < A; i++) { arr[i] = 1; } while (B
         * > 1) { for (int i = 1; i < A; i++) { if (i == 1) arr[i]++; else { arr[i] +=
         * arr[i - 1]; } } B--; } return arr[A - 1];
         */
        if (A == 2 || B == 2)
            return Math.max(A, B);
        int ans = 1;
        for (int i = (Math.max(A, B)); i < A + B - 1; i++) {
            ans *= i;
            ans /= (i - Math.max(A, B) + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        GridPath obj = new GridPath();
        int A = 7;
        int B = 6;
        System.out.println(obj.uniquePaths(A, B));
    }
}
