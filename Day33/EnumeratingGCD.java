package Day33;

public class EnumeratingGCD {
    public long GCD(long a, long b) {
        while (b > 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public String solve(String A, String B) {
        long M = Long.parseLong(A);
        long N = Long.parseLong(B);
        String result = Long.toString(GCD(N, M));
        return result;
    }

    public static void main(String[] args) {
        EnumeratingGCD o = new EnumeratingGCD();
        String A = "678728391838182039102";
        String B = "678728391838182039103";
        System.out.println(o.solve(A, B));
    }
}
