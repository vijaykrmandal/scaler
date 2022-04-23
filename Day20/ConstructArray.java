package Day20;

public class ConstructArray {
    public int[] solve(final int A, final int B, final int C) {
        int arr[] = new int[A];
        int firstTerm = 0;
        int lastMin = Integer.MAX_VALUE;
        int firstMin = 0;
        int diff = 0;
        int d = 0;
        for (int i = 1; i <= A; i++) {
            for (int j = i + 1; j <= A; j++) {
                if ((C - B) % (j - i) == 0) {
                    diff = (C - B) / (j - i);
                    firstTerm = B - ((i - 1) * diff);
                    int lastTerm = firstTerm + (A - 1) * diff;
                    if (firstTerm <= 0)
                        continue;
                    if (lastTerm < lastMin) {
                        lastMin = lastTerm;
                        firstMin = firstTerm;
                        d = diff;
                    } else if (lastTerm == C) {
                        if (firstTerm < firstMin) {
                            firstMin = firstTerm;
                            d = diff;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < A; i++) {
            arr[i] = firstMin + i * d;
        }
        return arr;
    }

    public static void main(String[] args) {
        ConstructArray obj = new ConstructArray();
        int arr[] = obj.solve(7, 39, 41);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
