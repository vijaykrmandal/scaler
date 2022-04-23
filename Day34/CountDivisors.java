package Day34;

public class CountDivisors {
    public int[] diviors(int N){
        int d[]=new int[N+1];
        for(int i=1;i<=N;i++){
            for(int j=i;j<=N;j+=i){
                d[j]++;
            }
        }
        return d;
    }
    public static void main(String[] args) {
        CountDivisors obj=new CountDivisors();
        int A=10;
        int d[]=new int[A+1];
        d=obj.diviors(A);
        for( int a: d){
            System.out.println(a);
        }
    }
}
