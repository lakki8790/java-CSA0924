import java.util.*;
class Special_count
{
	public static void main(String args[])
	{
		String s1;
		int count=0,i,len;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string: ");
		s1=s.nextLine();
		len=s1.length();
		for(i=0;i<len;i++)
		{
			char ch=s1.charAt(i);
			if(!(ch>='a' && ch<='z') && !(ch>='A' && ch<='Z') && !(ch>='0' && ch<='9'))
			{
				System.out.println(ch);
				count++;
			}
		}
		System.out.println("no.of special characters is: "+count);
	}
}
