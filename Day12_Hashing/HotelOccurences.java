package Day12_Hashing;

import java.util.*;

public class HotelOccurences {
    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 2, 5, 3, 2, 4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=A.length-1;i>=0;i--) {
            if(map.containsKey(A[i])) continue;
            else {
                map.put(A[i], i+1);
            }             
        }
        int n=map.size();
        int [] res=new int[n];
        map.clear();
        n--;
        for (int i=A.length-1;i>=0;i--) {
            if(map.containsKey(A[i])) continue;
            else {
                map.put(A[i], i+1);
                res[n--]=A[i];
            }             
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet())
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
    }
}
