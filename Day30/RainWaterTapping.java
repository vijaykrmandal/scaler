package Day30;

public class RainWaterTapping {
    public int trap(final int[] A) {
        int N = A.length;
        int L[]=new int[N];
        int R[]=new int[N];
        L[0]=0;
        R[N-1]=0;
        for (int i = 1; i < N-1; i++) {
            if(A[i]> L[i-1]) L[i]=A[i];
            else L[i]=L[i-1];

            if(A[N-i]>R[N-i]) R[N-1-i]=A[N-i];
            else R[N-1-i]=R[N-i];
        }
        L[N-1]=L[N-2];
        R[0]=R[1];
        int WaterCollected=0;
        for(int i=0;i<N;i++){
            if(Math.min(L[i],R[i])-A[i]>0)
            WaterCollected+=Math.min(L[i],R[i])-A[i];
        }
        return WaterCollected;
    }

    public static void main(String[] args) {
        RainWaterTapping obj = new RainWaterTapping();
        //int A[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int B[]={56, 6, 52, 43, 23, 47, 48, 38, 96, 46, 30, 66, 80, 15, 62, 71, 61, 12, 98, 9, 28, 81, 70, 59, 95, 34, 9, 60, 70, 81, 71, 67, 58, 20, 22, 3, 95, 85, 20, 24, 74, 5, 23, 33, 75, 50, 38, 75, 68, 26, 46, 30, 75, 18, 4, 42, 51, 59, 8, 77};
        System.out.println(obj.trap(B));
    }
}
