import java.util.*;
class A
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		int count,prime=0,composite=0,i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no.of elements: ");
		int n=s.nextInt();
		System.out.println("enter the elements: ");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			count=0;
			for(j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
	
			}
			if(count>2)
			{
				composite++;
			}
			else
			{
				prime++;
			}
			
		}
		System.out.println("no.of primes are: " +prime);
		System.out.println("no.of composites are: "+composite);
	}
}
