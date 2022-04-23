package Day9;

public class AnitiDiagonal {
    public int[][] diagonal(int[][] A) {
        int N = A.length;
        int B[][] = new int[2 * N - 1][N];
        for(int i=0;i<2*N-1;i++){
            for(int j=0;j<N;j++){
                B[i][j]=0;
            }
        }
        
         for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                B[i+j][j]=A[j][i];
            }
        }
        int c=1;
        for(int i=N;i<2*N-1;i++){
            for(int j=0;j<N-1;j++){
                if(j+c < N)
                B[i][j]=B[i][j+c]; 
            }
            c++;
        }
        c=1;
        for(int i=N;i<2*N-1;i++){
            for(int j=0;j<c;j++){
                B[i][N-1-j]=0;
            }
            c++;
        }
        System.out.println();
        return B;
    }

    public static void main(String[] args) {
        AnitiDiagonal o = new AnitiDiagonal();
        int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        //int[][] Ar={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] B = new int[5][3];
        B = o.diagonal(A);
         for (int i = 0; i < 5; i++) {
            System.out.print("[ ");
            for (int j = 0; j < 3; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
