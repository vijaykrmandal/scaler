package Day31;

public class Flip {
    public int[] flip(String A) {
        int N=A.length();
        int arr[]=new int[N];
        int Psum[]=new int[N];
        for(int i=0;i<N;i++){
           arr[i]=Character.getNumericValue(A.charAt(i));
        }
        Psum[0]=(arr[0]==0)?1:0;
        int startPos=0;
        int endPos=0;
        int maxSum=Psum[0];
        for(int i=1;i<N;i++){
            Psum[i]=((arr[i]==0)?1:-1)+Psum[i-1];
            if(Psum[i]<0){
                Psum[i]=0;
                if(i<endPos) startPos=i;
            } 
            if(Psum[i]>maxSum){
                maxSum=Math.max(maxSum,Psum[i]);
                endPos=i;
            }
        }
       
        if(startPos>=0 && endPos>0){
            int res[]={startPos,endPos};
            return res;
        }     
        int[] emptyArr = {};
        return emptyArr;
        
    }
    public static void main(String[] args) {
        String A="010";//"100100111101";
        Flip obj= new Flip();
        int arr[]=obj.flip(A);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
