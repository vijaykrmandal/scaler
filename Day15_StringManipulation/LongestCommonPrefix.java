package Day15_StringManipulation;

import java.util.*;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] A) {
        String res = "";
        int l = A.length;
        int count = 1, exit = 1;
        Arrays.sort(A);
        int ls = A[0].length();
        if (A.length == 1) {
            return A[0];
        }
        for (int i = 0; i < ls; i++) {
            char c = A[0].charAt(i);
            for (int k = 1; k < l; k++) {
                if (c != A[k].charAt(i)) {
                    exit = 0;
                    break;
                } else {
                    count++;
                    if (count == l) {
                        res = res + c;
                        count = 1;
                    }
                }
            }
            if (exit == 0) {
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LongestCommonPrefix obj = new LongestCommonPrefix();
        String A[] = { "abcdefgh", "abfghijk", "aececdfgh" };
        System.out.println(obj.longestCommonPrefix(A));
    }

}
