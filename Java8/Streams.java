package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Streams {
    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        //filter
        //stringCollection.stream().filter((s) -> s.startsWith("a")).forEach(System.out::println);
        System.out.println();
        //sorted
        //stringCollection.stream().sorted().filter((s) -> s.startsWith("a")).forEach(System.out::println);
        System.out.println();
        //map
        //stringCollection.stream().map(String::toUpperCase).sorted((a,b)->b.compareTo(a)).forEach(System.out::println);
        System.out.println();

        //Match --terminal boolean result;
        boolean anyStartsWithA=stringCollection.stream().anyMatch((s)->s.startsWith("a"));
        System.out.println(anyStartsWithA+"\n");

        boolean allStartWithA=stringCollection.stream().allMatch((s)->s.startsWith("a"));
        System.out.println(allStartWithA+"\n");

        boolean noneMatch=stringCollection.stream().noneMatch((s)->s.startsWith("z"));
        System.out.println(noneMatch+"\n");

        //count-- terminal-- long result
        long startsWithB=stringCollection.stream().filter((s)->s.startsWith("b")).count();
        System.out.println(startsWithB+"\n");

        //reduce  -- terminal  - optional result
        Optional<String> reduce=stringCollection.stream().sorted().reduce((s1,s2)->s1+"#"+s2);
        reduce.ifPresent(System.out::println);

        

    }
}
