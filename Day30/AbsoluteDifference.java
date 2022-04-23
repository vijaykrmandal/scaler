package Day30;

public class AbsoluteDifference {
    public int maxArr(int[] A) {
        int N = A.length;
        int Xmax=Integer.MIN_VALUE;
        int Xmin=Integer.MAX_VALUE;
        int Ymax=Integer.MIN_VALUE;
        int Ymin=Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int X = A[i] + i;
            int Y = A[i] - i;
            if(X<Xmin) Xmin=X;
            if(X>Xmax) Xmax=X;
            if(Y<Ymin) Ymin=Y;
            if(Y>Ymax) Ymax=Y;

        }
        return Math.max(Xmax-Xmin, Ymax-Ymin);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, -1 };
        AbsoluteDifference o = new AbsoluteDifference();
        System.out.println(o.maxArr(arr));
    }
}
