package Day15_StringManipulation;

public class StringOperations {
    public String solve(String A) {
        StringBuilder s = new StringBuilder();
        int index = 0;
        int l = A.length();
        while (index < l) {
            if (!Character.isUpperCase(A.charAt(index))) {
                if (A.charAt(index) == 'a' || A.charAt(index) == 'e' || A.charAt(index) == 'i' || A.charAt(index) == 'o'
                        || A.charAt(index) == 'u')
                    s.append("#");
                else
                    s.append(A.charAt(index));
            }

            index++;
        }
        return s.append(s).toString();

    }

    public static void main(String[] args) {
        StringOperations obj = new StringOperations();
        System.out.println(obj.solve("AbcaZeoB"));
    }

}
