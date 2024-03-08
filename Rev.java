import java.util.*;
class Fib extends Thread
{
	public void run()
	{
		int n1=0,n2=1,sum=0,i;
		System.out.print(n1+" "+n2+" ");
		for(i=2;i<10;i++)
		{
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(sum+" ");
		}
	}
}
class Rev extends Thread
{
	public void run()
	{
		int i;
		System.out.println("Reverse");
		for(i=10;i>=1;i--)
		{
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		Rev o2=new Rev();
		o2.start();
		Fib o1=new Fib();
		o1.start();

	}
}
