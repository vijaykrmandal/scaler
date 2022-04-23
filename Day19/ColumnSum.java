package Day19;

public class ColumnSum {
    public int[] solve(int[][] A) {
        int row=A.length;
        int col=A[0].length;
        int C[]=new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                C[j]+=A[i][j];
            }
            System.out.println();
        }
        return C;
    }
    public static void main(String[] args) {
        ColumnSum obj = new ColumnSum();
        int A[][] = {{1,2},{3,4}};
        int C[]=obj.solve(A);
        for(int a: C){
            System.out.print(a+ ", ");
        }
        
    }
}
