package Day21;
import java.util.*;
public class MergeArray {
    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
        //ArrayList<Integer> arr=new ArrayList<Integer>();
        //int i=0,j=0;
        /*while(A.size()>i && B.size()>j){
            if(A.get(i)<B.get(j)){
                arr.add(A.get(i++));
            } 
            else if(A.get(i)>B.get(j)){
                arr.add(B.get(j++));
            }
            else if(A.get(i)==B.get(j)){
                arr.add(B.get(j++));
            } 

        }
        if(A.size()>i){
            while(A.size()>i){
                arr.add(A.get(i++));
            }
        }
        if(B.size()>j){
            while(B.size()>j){
                arr.add(B.get(j++));
            }
        }*/
        ArrayList<Integer> arr=new ArrayList<Integer>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < A.size(); i++) {
            if (map.containsKey(A.get(i))) {
                map.put(A.get(i), map.get(A.get(i)) + 1);
            } else
                map.put(A.get(i), 1);
        }
        for (int i = 0; i < B.size(); i++) {
            if (map.containsKey(B.get(i))) {
                map.put(B.get(i), map.get(B.get(i)) + 1);
            } else
                map.put(B.get(i), 1);
        }
        for (Map.Entry<Integer,Integer> me : map.entrySet())
        {   
            int v=me.getValue();
            while(v>0){
                arr.add(me.getKey());
                v--;
            } 
                
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<Integer>();
        ArrayList<Integer> B=new ArrayList<Integer>();
        A.add(-4);
        A.add(3);
        B.add(-2);
        B.add(-2);
        ArrayList<Integer> C=new ArrayList<Integer>();
        MergeArray obj=new MergeArray();
        C=obj.solve(A, B);
        for(int a:C){
            System.out.print(a+" ");
        }
    }
}
