import java.util.*;
class String_palindrome
{
	public static void main(String args[])
	{
		String s1,temp;
		int len,i;
		String s2="";
		char ch;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string: ");
		s1=s.nextLine();
		temp=s1;
		len=s1.length();
		for(i=len-1;i>=0;i--)
		{
			ch=s1.charAt(i);
			s2+=ch;
		}
		System.out.println(s2);
		if(s2.equals(temp))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
}
