package Day19;

public class CountSpecialElement {
    public int solve(int[] A) {
        int leftOdd = 0;
        int leftEven = 0;
        int rightEven = 0;
        int rightOdd = 0;
        int ans = 0;
        int N = A.length;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0)
                rightEven += A[i];
            else
                rightOdd += A[i];
        }
        System.out.println("right Odd "+ rightOdd);
        System.out.println("right even "+ rightEven);
        for (int i = 0; i < N; i++) {
            if (i % 2 != 0)
                rightOdd -= A[i];
            else
                rightEven -= A[i];
            if (leftOdd + rightEven == rightOdd + leftEven)
                ans++;
            if (i % 2 != 0)
                leftOdd += A[i];
            else
                leftEven += A[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        CountSpecialElement obj = new CountSpecialElement();
        int A[] = { 1, 2, 3, 7, 1, 2, 3 };
        System.out.println(obj.solve(A));
    }
}
