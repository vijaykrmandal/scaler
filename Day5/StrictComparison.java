package Day5;

//import java.util.Arrays;

public class StrictComparison {
    public static void main(String[] args) {
        int []A={ 197, 302, 658, 925 };
        
        //int A[]= { 0, 271, 73, 548, 573, 56, 716, 178, 435, 381, 721, 662, 830, 829, 509, 483, 476, 445, 270, 301, 668, 99, 491, 606, 672, 601, 171, 51, 273, 872, 197, 473, 743, 334, 478, 388, 413, 686, 740, 570, 225, 27};
       // Arrays.sort(A);
        int count=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i]>max) max=A[i];
            if(A[i]<min) min=A[i];
        }
        System.out.println("MAX = "+max);
        System.out.println("MIN = "+min);
        for(int i=0;i<A.length;i++){
            if(A[i]==min || A[i]==max) count++;
        }
        // for(int i=0;i<A.length;i++){
        //     System.out.print(A[i]+", ");
        // }
        System.out.println("\n"+(A.length-count));
    }
    
}
