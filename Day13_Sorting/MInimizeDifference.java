package Day13_Sorting;

import java.util.*;

public class MInimizeDifference {

    public int solve(int[] A, int B) {
        Arrays.sort(A);
        int N = A.length;
        int start = 0;
        int end = N - 1;
        int max = A[end];
        int min = A[start];
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
        return Math.abs(min - max);
    }

    public int solve1(int[] A, int B) {
        Arrays.sort(A);
        int N = A.length;
        int start = 0;
        int end = N - 1;
        int max = A[end];
        int min = A[start];
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
                min++;
                A[start] = min;
                map.put(min, map.getOrDefault(min, 0) + 1);
                map.put(min - 1, map.get(min - 1) - 1);
                if (map.get(min - 1) != 0) {
                    min--;
                    if (A[start] > A[start + 1])
                        start++;
                    if (A[start] > A[start - 1])
                        start--;
                }
            } else if (freqMax < freqMin) {
                max--;
                A[end] = max;
                map.put(max, map.getOrDefault(max, 0) + 1);
                map.put(max + 1, map.get(max + 1) - 1);
                if (map.get(max + 1) != 0) {
                    max++;
                    if (A[end] < A[end - 1])
                        end--;
                    if (A[end] > A[end - 1])
                        end++;
                }
            } else if (freqMax == freqMin) {
                min++;
                A[start] = min;
                map.put(min, map.getOrDefault(min, 0) + 1);
                map.put(min - 1, map.get(min - 1) - 1);
                if (map.get(min - 1) != 0) {
                    min--;
                    if (A[start] > A[start + 1])
                        start++;
                    if (A[start] > A[start - 1])
                        start--;
                }
            }
            B--;
        }
        int minValue = A[start];
        int maxValue = A[end];
        return Math.abs(maxValue - minValue);
    }

    public static void main(String[] args) {
        MInimizeDifference obj = new MInimizeDifference();
        int[] A = { 2, 8, 3, 7, 8, 7, 9 };
        int B = 9;
        System.out.println(obj.solve1(A, B));
    }
}
