package Day15_StringManipulation;

public class RotateString {
    public String solve(String A, int B) {
        int l = A.length();
        char[] result = new char[l];
        int i = 0;
        while (i < l) {
            result[(i + B + l) % l] = A.charAt(i);
            i++;
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        RotateString obj = new RotateString();
        String A = "Scaler";
        int B = 2;
        System.out.println(obj.solve(A, B));
    }
}
