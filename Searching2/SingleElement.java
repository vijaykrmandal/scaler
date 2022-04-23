package Searching2;

public class SingleElement {
    public int solve(int[] A) {
        int N=A.length;
        int L=0,R=N-1;
        int M=0;
        while(L<=R){
            M=L+(R-L)/2;
            if( (M==0 || A[M]!=A[M-1] ) &&
                (M==N-1 || A[M]!=A[M+1]) )
                    return A[M];
            if(M==0 || A[M]!=A[M-1] ){
                if(M%2==0) L=M+1;
                else R=M-1;
            }
            else
            {
                if(M%2==0) R=M-1;
                else L=M+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        SingleElement obj=new SingleElement();
        int A[]={5,10,10,110,110};
        System.out.println(obj.solve(A));
    }
}
