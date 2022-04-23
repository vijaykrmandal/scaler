package Day16_BasicsOfMaths;

public class ReverseInteger {
    public int reverse(int A) {
        int N = A;
        long R =0;
        while(Math.abs(N)>0){
            R=R*10+N%10;
            N/=10;
            if(R< Integer.MIN_VALUE) return 0;
        }
        return (int)R;
    }
    public static void main(String[] args) {
        ReverseInteger obj=new ReverseInteger();
        System.out.println(obj.reverse(-1146467285));
    }
}
