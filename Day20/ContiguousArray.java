package Day20;
import java.util.*;
public class ContiguousArray {
    public int solve(int[] A) {
        int ans=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==0) A[i]=-1;
        }
        int PxSum[]=new int[A.length];
        PxSum[0]=A[0];
        for(int i=1;i<A.length;i++){
            PxSum[i]=PxSum[i-1]+A[i];
        }
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        map.put(0, -1);
        for(int i=0;i<A.length;i++){
            if(map.containsKey(PxSum[i])){
                ans=Math.max(ans,i-map.get(PxSum[i]));
                // if(PxSum[i]==0 && i!=A.length-1) ans =i+1;
            }
            else{
                map.put(PxSum[i],i);
            }
        }
        return ans;
        /*
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < A.length; i++) {
            count = count + (A[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxlen;
        */
    }
    public static void main(String[] args) {
        ContiguousArray obj=new ContiguousArray();
        //int A[]={0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1 };
        int A[]={0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0};
        //int A[]={1, 0, 1, 0};
        System.out.println(obj.solve(A));
    }
}
