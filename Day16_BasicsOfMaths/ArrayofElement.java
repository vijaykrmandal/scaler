package Day16_BasicsOfMaths;
import java.util.ArrayList;
public class ArrayofElement {
    public ArrayList<Integer> solve(ArrayList<Integer> A){
        ArrayList<Integer> B=A;
        int N=B.size();
        for(int i=0;i<N;i++){
            B.set(i, B.get(i)*4);
        }
        for(int i=0;i<N;i++){
            int num=B.get(i)+(B.get(B.get(i)/N)/N);
            B.set(i,num);
        }
        for(int i=0;i<N;i++){
            B.set(i, B.get(i)%4);
        }
        return B;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        //A.add(4);
        A.add(3);
        A.add(2);
        A.add(0);
        A.add(1);
        for(int x: A){
            System.out.print(x +" ");
        }
        System.out.println();
        int B[] = new int[A.size()];
        for (int i = 0; i < A.size(); i++) {
            B[A.indexOf(i)] = A.get(i);
        }
        for (int x : B) {
            System.out.print(x + " ");
        }
        System.out.println();
        ArrayofElement obj= new ArrayofElement();
        ArrayList<Integer> C= obj.solve(A);
        for(int x: C){
            System.out.print(x +" ");
        }
    }
}
