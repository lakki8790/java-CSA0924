import java.util.*;
class Array_square
{
	public static void main(String args[])
	{
		int n1,n2,i,k;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n1: ");
		n1=s.nextInt();
		System.out.println("enter n2: ");
		n2=s.nextInt();
		for(i=n1;i<=n2;i++)
		{
			k=i*i;
			System.out.println(i+","+k);
		}
	
	}
}
