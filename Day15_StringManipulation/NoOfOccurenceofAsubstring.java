package Day15_StringManipulation;

public class NoOfOccurenceofAsubstring {
    public int solve(String A) {
        String sub = "bob";
        int n = A.length();
        int ls = sub.length();
        int count = 0;
        for (int i = 0; i <= n - ls; i++) {
            System.out.println(A.substring(i, i + ls));
            if (A.substring(i, i + ls).equals(sub)) {
                count++;
                i++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        NoOfOccurenceofAsubstring obj = new NoOfOccurenceofAsubstring();
        System.out.println(obj.solve("bobob"));
    }

}
