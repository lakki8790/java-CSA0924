import java.util.*;
class Prime
{
	public static void main(String args[])
	{
	int n,count=0,i;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number: ");
	n=s.nextInt();
	for(i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println("Prime number");
	}
	else
	{
		System.out.println("Not a Prime number");
	}
	}
}
