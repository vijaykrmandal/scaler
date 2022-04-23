package Day21;

import java.util.ArrayList;

public class RemoveDuplicate {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i = 0, j = 0;
        while (A.size() > i) {
            int N = A.get(i);
            arr.add(N);
            j = i;
            while (A.get(j) == N) {
                j++;
                if (j > A.size() - 1)
                    break;
            }
            i = j;
        }
        return arr;
    }

    public static void main(String[] args) {
        RemoveDuplicate obj = new RemoveDuplicate();
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> B = new ArrayList<Integer>();
        A.add(1);
        A.add(2);
        A.add(2);
        A.add(3);
        A.add(3);
        B = obj.solve(A);
        for (int i : B) {
            System.out.print(i + " ");
        }
    }
}
