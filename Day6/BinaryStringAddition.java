package Day6;
public class BinaryStringAddition {
    public static void main(String[] args) {
        String A = "100";
        String B = "11";
        StringBuilder result = new StringBuilder();
        int sum = 0;
        int carry = 0;
        int m = A.length();
        int n = B.length();
        for (int i = m - 1, j = n - 1; i >= 0 || j >= 0; i--, j--) {
            sum=carry;
            if (i >= 0)
                sum += A.charAt(i) - '0';
            if (j >= 0)
                sum += B.charAt(j) - '0';
            carry = (sum > 1) ? 1 : 0;
            result.append(sum % 2);
        }
        if(carry!=0) result.append(carry);
        System.out.println(result.reverse().toString());
    }

}
