package Day34;

public class LuckyNumber {
    public int[] diviors(int N){
        int []d=new int[N+1];
        for(int i=2;i<=N;i++){
            if(d[i]==0){
                for(int j=i;j<=N;j+=i){
                    d[j]++;
                }
            }
            
        }
        return d;
    }
    public static void main(String[] args) {
        LuckyNumber obj=new LuckyNumber();
        int A=10;
        int d[]=new int[A+1];
        d=obj.diviors(A);
        int i=0;
        for( int a: d){
            System.out.println(i++ +" :-> "+a);
        }
    }
}
