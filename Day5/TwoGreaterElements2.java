package Day5;

public class TwoGreaterElements2 {
    public static void main(String[] args) {
        int A[] = { 11, -32, 3, 4, -75 };
        TwoGreaterElements2 obj = new TwoGreaterElements2();
        int arr[] = obj.solve(A);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

    }

    public int[] solve(int[] A) {
        bubbleSort(A);
        int B[] = new int[A.length];
        int lengthB = 0;
        for (int i = A.length-1; i >1; i--) {
            B[lengthB++] = A[i];
        }
        int result[] = new int[lengthB];
        for (int i = 0; i < lengthB; i++) {
            if (B[i] != 0) {
                result[i] = B[i];
            }
        }
        return result;
    }

    void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] < arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }
}