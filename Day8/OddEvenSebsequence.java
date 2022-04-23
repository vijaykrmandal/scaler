package Day8;

public class OddEvenSebsequence {
    public int solve(int[] A) {
        int length = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] % 2 == 0 && A[i - 1] % 2 != 0 && A[i] != A[i - 1]) {
                length++;
            }
            if (A[i] % 2 != 0 && A[i - 1] % 2 == 0 && A[i] != A[i - 1]) {
                length++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        OddEvenSebsequence o = new OddEvenSebsequence();
        int A[] = { 12, 10, 28, 37, 43, 40, 14, 12, 48 };
        System.out.println(o.solve(A));
    }

}
