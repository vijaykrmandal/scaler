package Day30;

public class FirstMissingInteger {
    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public int firstMissingPositive(int[] A) {
        int i = 0;
        while (i < A.length) {
            if (A[i] > 0 && A[i] <= A.length) { // ignore values <0 && >nums.length
                int ci = A[i] - 1;
                if (A[i] != A[ci])
                    swap(A, i, ci);
                else
                    i++;
            } else
                i++;
        }
        for (int j = 0; j < A.length; j++) {
            if (A[j] < 0 || A[j] > A.length || A[j] != j + 1) // first i which has the wrong values return
                                                              // i+1
                return j + 1;
        }

        return A.length + 1; // if all are at correct index i.e nums.length + 1 is missing
    }

    public static void main(String[] args) {
        int A[] = { 3, 4, -1, 1 };
        FirstMissingInteger obj = new FirstMissingInteger();
        System.out.println(obj.firstMissingPositive(A));
    }
}
