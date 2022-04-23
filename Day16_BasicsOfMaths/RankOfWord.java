package Day16_BasicsOfMaths;

import java.util.*;

public class RankOfWord {
    private int mod = 1000003;

    public int fact(int N) {
        if (N == 0)
            return 1;
        if (N == 1)
            return 1;
        else
            return N * fact(N - 1) % mod;
    }

    public int findRank(String A) {
        char[] arr = A.toCharArray();
        int index = A.length() - 1;
        int count = 0;
        int res = 0;
        Arrays.sort(arr);
        for (int i = 0; i < A.length(); i++) {
            count = 0;
            for (int j = i + 1; j < A.length(); j++) {
                if (A.charAt(i) > A.charAt(j))
                    count++;
            }
            res = res + count * fact(index) % mod;
            res = res % mod;
            index--;
        }
        return (res + 1) % mod;
    }

    public static void main(String[] args) {
        RankOfWord obj = new RankOfWord();
        System.out.println(obj.findRank("DTNGJPURFHYEW"));
    }
}
