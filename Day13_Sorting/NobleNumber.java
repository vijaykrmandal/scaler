package Day13_Sorting;
import java.util.*;
public class NobleNumber {
    public static void main(String[] args) {
        int A[]={-113, -70, -14, -8, -29, 5, -94, -44, 23, 9, 13, -132, -14 };
        Arrays.sort(A);
        int l=A.length;
        System.out.println("Modified arr[] : %s"+
                           Arrays.toString(A));
        for(int i=0;i<l;i++){
            if(Math.abs(A[i])==(l-1-i) && A[i]>0) 
                System.out.println("true "+(l-1-i));
        }
    }
}
