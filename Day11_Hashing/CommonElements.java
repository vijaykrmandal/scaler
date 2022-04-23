
package Day11_Hashing;
import java.util.*;
public class CommonElements {
    public static int[] solve(int[] A, int[] B) {
        int N=A.length;
       // int M=B.length;
        int count=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++){
            count = map.containsKey(A[i]) ? map.get(A[i]) : 0;
            map.put(A[i],count+1);
        }
        map.forEach((k,v) -> System.out.println("Key = "+ k + ", Value = " + v));
        /*int []C=new int [A.length];
        for(int i=0;i<N;i++){
            C[i]=0;
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(B[j]==A[i]){
                    C[i]=1;
                    B[j]=Integer.MIN_VALUE;
                    break;
                }
            }
        }
        for(int i=0;i<N;i++){
            if(C[i]>0){
                list.add(A[i]);
            }
        }*/
		for(int x: B){
			if(map.get(x) != null && map.get(x) != 0){
                list.add(x);
                map.put(x,map.get(x)-1);
            }
                
		}
        int [] arr = new int[list.size()];
        int i=0;
        for (int x:list)
        {   
                arr[i++]=x;
        }           
        return arr;
    }
    public static void main(String[] args) {
        int []A={2, 1, 4, 10};
        int []B={3, 6, 2, 10, 10};
        int C[]= solve(A, B);
        for (int i : C) {
            System.out.print("\n"+i+" ");
          }
    }
}
