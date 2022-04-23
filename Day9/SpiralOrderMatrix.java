package Day9;

public class SpiralOrderMatrix {
    public int[][] generateMatrix(int A) {
        int arr[][] = new int[A][A];
        int num = 1;
        int row_start = 0;
        int col_start = 0;
        int row_end = A;
        int col_end = A;
        while (col_start < col_end && row_start < row_end) {
            for (int i = col_start; i < col_end; i++) {
                arr[row_start][i] = num;
                // System.out.print(A[row_start][i]+" ");
                num++;
            }
            row_start++;
            // System.out.println("");
            for (int i = row_start; i < row_end; i++) {
                arr[i][col_end - 1] = num;
                // System.out.print(A[i][col_end-1]+" ");
                num++;
            }
            col_end--;
            // System.out.println("");
            for (int i = col_end - 1; i >= col_start; i--) {
                arr[row_end - 1][i] = num;
                // System.out.print(A[row_end-1][i]+" ");
                num++;
            }
            row_end--;
            // System.out.println("");
            for (int i = row_end - 1; i >= row_start; i--) {
                // System.out.print(A[i][col_start]+" ");
                arr[i][col_start] = num;
                num++;
            }
            col_start++;
            // System.out.println("");
        }
        return arr;
    }

    public static void main(String[] args) {
        SpiralOrderMatrix o=new SpiralOrderMatrix();
        int A=3;
        int B[][]=o.generateMatrix(A);
        for(int i=0;i<B.length;i++){
            for(int j=0;j<B[0].length;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
    }
}
