package Day6;
public class BitManipulation {
    public static void main(String[] args) {
    int A[]={1,2,2,3,3,4,1};;
        int res=0;
    for(int i=0;i<A.length;i++)
        res^=A[i];        
        System.out.println(res);
    }

}
