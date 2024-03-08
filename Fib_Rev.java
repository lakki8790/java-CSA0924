import java.util.*;
class A extends Thread
{
	public void run()
	{
		int i;
		for(i=10;i>=1;i--)
		{
			System.out.println(i);
		}
	}
}
class Fib_Rev extends Thread
{
	public void run()
	{
		int n1=0,n2=1,sum,i;
		for(i=0;i<10;i++)
		{
			System.out.print(n1+" ");
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		B obj1=new B();
		obj1.start();
		A obj=new A();
		obj.start();

	}

}
