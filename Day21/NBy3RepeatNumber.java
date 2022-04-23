package Day21;

import java.util.*;

public class NBy3RepeatNumber {
    public int repeatedNumber(final List<Integer> A) {
        int N3 = A.size() / 3;
        int ans = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            if (map.containsKey(A.get(i))) {
                map.put(A.get(i), map.get(A.get(i)) + 1);
            } else
                map.put(A.get(i), 1);
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet())
            if (e.getValue() > N3)
                ans = e.getKey();
        // System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
        return ans;
    }

    public static void main(String[] args) {
        final List<Integer> A = new ArrayList<Integer>();
        A.add(1);
       
        NBy3RepeatNumber obj = new NBy3RepeatNumber();
        System.out.println(obj.repeatedNumber(A));
    }
}
