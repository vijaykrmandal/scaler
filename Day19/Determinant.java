package Day19;

public class Determinant {
    public int solve(final int[][] A) {
        int D=0;
        int m1=0,m2=0,m3=0;
        if(A.length==2)
        D=A[0][0]*A[1][1]-A[1][0]*A[0][1];
        if(A.length==3){
            m1=A[0][0]*(A[1][1]*A[2][2]-A[2][1]*A[1][2]);
            m2=A[0][1]*(A[1][0]*A[2][2]-A[2][0]*A[1][2]);
            m3=A[0][2]*(A[1][0]*A[2][1]-A[2][0]*A[1][1]);
           D=m1-m2+m3;
        }         
        return D;
    }
    public static void main(String[] args) {
        final int [][]A={{1,2},{3,4}};
        Determinant o=new Determinant();
        System.out.println(o.solve(A));
    }
}
