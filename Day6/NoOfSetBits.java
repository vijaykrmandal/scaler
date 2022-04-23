package Day6;
public class NoOfSetBits {
    public static void main(String[] args) {
        int A = 4;
        int count=0;
        int B, j;
        int sum = 0;
        String res;
        for (int i = 1; i <= A; i++) {
            B = 0;
            j = i;
            res = "";
            while (j > 0) {
                res = res + (j % 2);
                B = j&1;
                if (B == 1)
                    count++;
                j = j >> 1;
            }
            sum += count;
            System.out.println("Binary of " + i + " is " + res + " having set " + count + " bits");
            count=0;
        }
        // System.out.println(Long.toBinaryString(B));
        System.out.println("Binary" + sum);
        System.out.println(sum % 1000000007);
    }
}
