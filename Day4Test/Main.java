package Day4Test;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        String s1="grand master";
        String s2="candidate master";
        String s3="expert";
        String s4="pupil";
        String s5="newbie";
        if(N%2==0){
            s1=s1.toUpperCase();
            s2=s2.toUpperCase();
            s3=s3.toUpperCase();
            s4=s4.toUpperCase();
            s5=s5.toUpperCase();
        }
        if(N>=2100){
            System.out.println(s1);
        if(N>=1900 & N<2100)
            System.out.println(s2);
        if(N>=1600 & N<1900)
            System.out.println(s3);
        if(N>=1400 & N<1600)
            System.out.println(s4);
        else
            System.out.println(s5);
        }
        sc.close();
    }
}