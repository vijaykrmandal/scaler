package Day5;

public class DifferenceEvenOdd {
    public static void main(String[] args) {
        int A[]={-15, -45, 43, 23, -63, 69, 35, 19, 37, -52};
        int even=Integer.MIN_VALUE,odd=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
               if(A[i]>even)
               even=A[i];
            } 
            else{
                if(A[i]<odd) odd=A[i];
            }
        }
        System.out.println(odd +" Min Odd");
        System.out.println(even +" Max Even");
        System.out.println(even-odd);
    }
}
