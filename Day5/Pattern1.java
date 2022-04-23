package Day5;

public class Pattern1 {
    public static void main(String[] args) {
        int N=4;
        int arr[][]=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<=i;j++){
                arr[i][j]=j+1;
            }
            for(int j=N-1;j>i;j--){
                arr[i][j]=0;
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
