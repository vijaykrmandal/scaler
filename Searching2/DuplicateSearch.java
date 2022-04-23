package Searching2;

public class DuplicateSearch {
    
    public void searchRange(final int[] A, int B) {
        int N=A.length;
        int L=0,R=N-1;
        int M=0;
        while(L<=R){
            M=L+(R-L)/2;
            if(A[M]==B && (M==0|| A[M]!=A[M-1]))
                System.out.println("startIndex : "+M);
            if(A[M]<B) L=M+1;
            else R=M-1;
        }
        L=0;R=N-1;
        while(L<=R){
            M=L+(R-L)/2;
            if(A[M]==B && (M==(N-1)|| A[M+1]>A[M] ))
            System.out.println("endIndex : "+M);
            if(A[M]>B) R=M-1;
            else L=M+1;
        }
        return;
    }
    public static void main(String[] args) {
        DuplicateSearch obj = new DuplicateSearch();
        final int A[]={ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };

        int B=10;
        obj.searchRange(A,B);
    }
}
