package Day4Test;

import java.util.Scanner;

public class SuperMaxima {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A[]=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        int count=0;
        for(int i=1;i<N-1;i++){
            System.out.print(A[i-1] +" ");
            System.out.print(A[i+1]+" ");
            System.out.println(A[i]+" ");
            if(A[i]>A[i-1] && A[i]<A[i+1] )
            { if( A[i] > (A[i-1]+A[i+1])) count ++;}

            System.out.println();
        }
        System.out.println(count);
        sc.close();
    }
}