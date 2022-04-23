package Day4Test;
import java.util.*;
public class Palindrome {
	static boolean isPalindrome(String s)
	{  	int count[] = new int[256];
		Arrays.fill(count, 0);
		for (int i = 0; i < s.length(); i++)
        count[(int)(s.charAt(i))]++;
		int odd = 0;
		for (int i = 0; i < 256; i++) {
		//	System.out.print((count[i] & 1) +" ");
			if ((count[i] & 1) == 1)
				odd++;
				
			if (odd > 1)
				return false;
		}
		return true;
	}
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
		String S="abd";
		System.out.println(S.toUpperCase());
        String s=sc.nextLine();
		if (isPalindrome(s))
			System.out.println("Yes");
		else
			System.out.println("No");
        sc.close();
	}
}
