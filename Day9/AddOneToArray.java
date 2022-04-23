package Day9;
public class AddOneToArray{
    public static int[] plusOne(int[] A) {
        int l =A.length;
        String res="";
        long num=0;
            for(int i=0;i<l;i++){
                res+=A[i];
            }
            num=Integer.parseInt(res)+1;
            System.out.println(num);
                num++;
            System.out.println(num);
            res=Long.toString(num);
            l=res.length();
            int B[]=new int[l];
            for(int i=0;i<l;i++){
                B[i]=Integer.parseInt(String.valueOf(res.charAt(i)));
            }
            return B;
    }
    public static void main(String[] args) {
        int A[]={9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int B[]=plusOne(A);
        for(int x: B){
            System.out.print(x+" ");
        }
    }
}