package Day16_BasicsOfMaths;

public class ExcelColumnNumber {
    public static void main(String[] args) {
        String A="AAA";
        int N=A.length();
        int Column = 0;
        int i=0;
        while(i<N){
            Column = Column*26+(A.charAt(i)-'A'+1)%27;
            i++;
        }
        System.out.println("Column : "+A+" -> "+Column);
    }
    
}
