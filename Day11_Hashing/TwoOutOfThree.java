package Day11_Hashing;

import java.util.*;

public class TwoOutOfThree {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        Set<Integer> setC = new HashSet<>();
        for (int i = 0; i < A.size(); i++)
            setA.add(A.get(i));
        for (int i = 0; i < B.size(); i++)
            setB.add(B.get(i));
        for (int i = 0; i < C.size(); i++)
            setC.add(C.get(i));
        int i = 0, j = 0;
        while (A.size() > i) {
            if (setB.contains(A.get(i)) || setC.contains(A.get(i)))
                arr.add(A.get(i));
            i++;
        }
        i = 0;
        while (C.size() > i) {
            if (setB.contains(C.get(i)))
                arr.add(C.get(i));
            i++;
        }
        Collections.sort(arr);
        i = 0;
        while (arr.size() > i) {
            int N = arr.get(i);
            res.add(N);
            j = i;
            while (arr.get(j) == N) {
                j++;
                if (j > arr.size() - 1)
                    break;
            }
            i = j;
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> B = new ArrayList<Integer>();
        ArrayList<Integer> C = new ArrayList<Integer>();
        A.add(56);
        A.add(56);
        A.add(34);
        A.add(34);
        A.add(72);
        A.add(71);

        B.add(56);
        B.add(56);
        B.add(34);
        B.add(34);
        B.add(72);
        B.add(71);

        C.add(56);
        C.add(56);
        C.add(34);
        C.add(34);
        C.add(72);
        C.add(71);
        ArrayList<Integer> D = new ArrayList<Integer>();
        TwoOutOfThree obj = new TwoOutOfThree();
        D = obj.solve(A, B, C);
        for (int a : D) {
            System.out.print(a + " ");
        }
    }
}
