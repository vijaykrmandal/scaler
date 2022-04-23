package Day16_BasicsOfMaths;

public class ExcelCoumnTitle {
    public String convertToTitle(int A){
        String res="";
        while(A>0){
            A--;
            res=(char)(A%26+'A')+res;
            A/=26;
        }
        return res;
    }
    public static void main(String[] args) {
        ExcelCoumnTitle o=new ExcelCoumnTitle();
        System.out.println(o.convertToTitle(27));//BAQUZ//corect ans : BAQTZ
    }
    
}