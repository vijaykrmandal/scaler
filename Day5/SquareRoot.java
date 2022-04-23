package Day5;
public class SquareRoot {
    public static void main(String[] args) {
        int N = 36;
        // Consider L = 1, R = N, and cnt = 0
        // STEP 1: MID = (floor)(L+R)/2 and cnt += 1
        // STEP 2: if ((MID * MID) == N), then go to STEP 5 else go to STEP 3.
        // STEP 3: if ((MID * MID) < N), then L = MID+1 and go to STEP 1 else STEP 4.
        // STEP 4: if ((MID * MID) > N), then R = MID - 1 and go to STEP 1.
        // STEP 5: PRINT MID.
        int L = 1, R = N, cnt = 0;
        int MID=0;
        for(int i=1;i<=N;i++){
            MID = Math.floorDiv((L+R),2);
            cnt += 1;
            if ((MID * MID) == N)
                break;
            if ((MID * MID) < N) L = MID+1;
            else if ((MID * MID) > N) R = MID - 1;
        }
         System.out.println(MID);
         System.out.println(cnt);

    }

}
