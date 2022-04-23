package Day15_StringManipulation;

public class ReverseSentenc {
    public String solve(String A) {
        int l = A.length();
        String result = new String();
        int i = 0;

        while (i < l) {
            while (i < l && A.charAt(i) == ' ')
                i++;
            if (i >= l)
                break;
            int j = i + 1;
            while (j < l && A.charAt(j) != ' ')
                j++;
            String word = A.substring(i, j);
            if (result.length() == 0)
                result = word;
            else
                result = word + " " + result;
            i = j + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        ReverseSentenc obj = new ReverseSentenc();
        String A = "My name";
        System.out.println(obj.solve(A));
    }
}
