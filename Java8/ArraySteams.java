package Java8;

import java.util.Arrays;

public class ArraySteams {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
       // int []arr2=new int[100];
        Arrays.stream(arr).filter(x->x%2==0).sorted().forEach(e->System.out.print(e + " "));
        System.out.println("Array sum = "+ Arrays.stream(arr).asDoubleStream().average());
    }
}
