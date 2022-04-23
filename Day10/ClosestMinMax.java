package Day10;

public class ClosestMinMax {
    public int solve(int[] A) {
        int indexMin = 0;
        int indexMax = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int N = A.length;
        int res = N;
        int distance = 0;
        int localMin = Integer.MAX_VALUE;
        int localMax = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (A[i] < min) {
                min = A[i];
            }
            if (A[i] > max) {
                max = A[i];
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] == min) {
                indexMin = i;
                localMin = min;
            }
            if (A[i] == max) {
                indexMax = i;
                localMax = max;
            }

            distance = Math.abs(indexMax - indexMin) + 1;
            if (res > distance && distance != 0 && localMax == max && localMin == min)
                res = distance;
        }

        return res;
    }

    public static void main(String[] args) {
        ClosestMinMax obj = new ClosestMinMax();
        int A[] = { 377, 448, 173, 307, 108 };

        System.out.println(obj.solve(A));
    }
}
