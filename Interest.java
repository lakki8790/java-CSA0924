import java.util.*;
class Interest
{
	
	public static void main(String args[])
	{
		double p,t,r;
		double si;
		char c;
		Scanner s=new Scanner(System.in);
        	System.out.println("enter the principal amount: ");
		p=s.nextDouble();
        	System.out.println("enter the no.of years: ");
		t=s.nextDouble();
        	System.out.println("is customer senior citizen:");
		c=s.next().charAt(0);
		if(c=='y')
		{
			r=12;
			si=(p*t*r)/100;
			System.out.println("simple interest is:"+si);
		}
		else
		{
			r=10;
			si=(p*t*r)/100;
			System.out.println("simple interest is:"+si);
		}

	}
}
