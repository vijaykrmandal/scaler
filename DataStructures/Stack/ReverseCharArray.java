package DataStructures.Stack;

import java.util.Stack;

public class ReverseCharArray {
    public static void main(String[] args) {
        Stack<Character> st=new Stack<>();
        char[] ch={'H','E','L','L','O'};
        int n=ch.length;
        for(int i=0;i<n;i++){
            st.push(ch[i]);
        }
        for(int i=0;i<n;i++){
            ch[i]=st.pop();
        }
        System.out.println(ch);
    }
}
