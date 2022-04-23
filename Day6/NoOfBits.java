package Day6;
public class NoOfBits {
    public static void main(String[] args) {
        int A=5;
        int count=0;
        //int B=0;
        String res="";
        // while(A>0){
        //     res=res+(A%2);
        //     System.out.println(A+" %2 ="+A%2);
        //     B=A&1;
        //     if(B==1)
        //         count++;
        //     A=A>>1;
        // }
        while (A != 0) {
            A &= A - 1;
            System.out.println(A&A-1);
            count++;
        }
        
       // System.out.println(Long.toBinaryString(B)); 
        System.out.println("Binary"+res);
        System.out.println(count);
        }
}
