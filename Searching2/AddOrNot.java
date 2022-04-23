package Searching2;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
public class AddOrNot {
    public int solve(int[] A, int B) {
        Arrays.sort(A);
        int N = A.length;
        int max = A[N - 1];
        int min = A[0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int count = 0;
            if (map.containsKey(A[i])) {
                count = map.get(A[i]);
            }
            map.put(A[i], count + 1);
        }
        while (B > 0) {
            if (max - min == 0)
                return 0;
            int freqMax = map.get(max);
            int freqMin = map.get(min);
            if (freqMax > freqMin) {
                B-=map.get(min);
                if(B<0) break;
                min++;
                map.put(min, map.getOrDefault(min, 0) + map.get(min-1));
            } else {
                B-=map.get(max);
                if(B<0) break;
                max--;
                map.put(max, map.getOrDefault(max, 0) + map.get(max+1));
            } 
        }
        return max - min;
    }
    public static void main(String[] args) {
        AddOrNot obj = new AddOrNot();
        int[] A = { 3, 1, 2, 2, 1 };
        int B = 3;
        System.out.println(obj.solve(A, B));
    }
}
