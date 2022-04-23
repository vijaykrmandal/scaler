package Java8;

import java.util.HashMap;
import java.util.Map;

public class Map8 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val-" + i);
        }
        //map.forEach((key, val) -> System.out.println(val));        
        map.computeIfPresent(3,(num,val)->(num+val));
        System.out.println(map.get(3));
    }
}
