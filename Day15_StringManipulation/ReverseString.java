package Day15_StringManipulation;

public class ReverseString {
    public String solve(String A) {
        int l=A.length();
        char charArr[]=A.toCharArray();
        char ch;
        for(int i=0;i<l/2;i++){
            ch=charArr[i];
            charArr[i]=charArr[l-1-i];
            charArr[l-1-i]=ch;
        }
        String B=String.valueOf(charArr);
        return B;
    }
    public static void main(String[] args) {
        ReverseString obj=new ReverseString();
        String A="mike";
        System.out.println(obj.solve(A));
    }
}
