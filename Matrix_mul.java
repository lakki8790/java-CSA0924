import java.util.*;
class Matrix_mul
{
	public static void main(String args[])
	{
		int i,j,r,c,k;
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		int m[][]=new int[10][10];
		Scanner s=new Scanner(System.in);
		System.out.print("enter the no.of rows: ");
		r=s.nextInt();
		System.out.print("enter the no.of rows: ");
		c=s.nextInt();
		System.out.print("enter the elements of first matrix: ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.print("enter the elements of second matrix: ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
			m[i][j]=0;
			for(k=0;k<c;k++)
			{
				m[i][j]+=a[i][k]*b[k][j];
			}
			}
		}
		System.out.println(" matrix multiplication is:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		


	}
}
