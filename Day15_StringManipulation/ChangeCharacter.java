package Day15_StringManipulation;

import java.util.*;

public class ChangeCharacter {
    public int solve(String A, int B) {
        int res = 0;
        int N = A.length();
        int freqArr[] = new int[26];
        for (int i = 0; i < N; i++) {
            freqArr[A.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freqArr[i] > 0)
                res++;
        }
        if (B == 0)
            return res;
        res = 0;
        Arrays.sort(freqArr);
        for (int i = 0; i < 26; i++) {
            if (freqArr[i] <= B) {
                B = B - freqArr[i];
                freqArr[i] = 0;

            }

        }
        for (int i = 0; i < 26; i++) {
            if (freqArr[i] > 0)
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        ChangeCharacter obj = new ChangeCharacter();
        String A = "czzzbfkqdpqzikfobucdhthxdjgkjelrlpaxamceroswitdptpcclifkeljytihrcqaybnefxnxvgzedyyhngycdrudmphmeckotrwospofghfozqvlqfxwwkmfxdyygmdcaszsgovsodkjghcwmbmxrmhuyfyqgajqkcklznayxqkqoyzwmyubzazcpkhktkydzivcuypurfmbisgekyrgzvxdhpoamvafyrarxsvkhtqdihersigbhzjzujxmmyspnaraewkegjccvhhrjvbjtsqdjootgpknfpfycgfieowqrwwwpzsqmetogepspxnvjiupalyynmkmnuvklhsecdwracgfmzkgipdfodkjmjqwiqpuoqhimvfvuzwyvijgfullkjduhsjafbtl";
        int B = 387;
        System.out.println(obj.solve(A, B));
    }
}
