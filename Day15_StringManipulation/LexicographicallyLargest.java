package Day15_StringManipulation;

import java.util.*;

public class LexicographicallyLargest {
    public String getLargest(String A) {
        String S = A.substring(0, A.indexOf("_"));
        String T = A.substring(A.indexOf("_") + 1);
        char[] arr = S.toCharArray();
        char[] arr2 = T.toCharArray();
        Arrays.sort(arr2);
        int N = arr.length;
        int M = T.length();
        for (char a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
        int j = 0;
        int i = 0;
        while (i < N && j < M) {
            if (i == N - 1 ){
                if(arr[i] < arr2[M - j - 1])  arr[i++] = arr2[M - j - 1];
                j++;
                break;
            }
                
            if (arr[i] < arr2[M - j - 1]) {
                arr[i++] = arr2[M - j - 1];
                j++;
            } else {
                i++;
            }
        }
        String res = "";
        for (char a : arr) {
            res += a;
        }
        return res;
    }

    public static void main(String[] args) {
        LexicographicallyLargest obj = new LexicographicallyLargest();
        System.out.println(obj.getLargest("abb_c"));
    }
}
